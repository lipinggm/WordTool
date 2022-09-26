package helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import static helper.Constants.*;

public class ProcessFile {
    File file;
    String knownWordList;
    String savingFolder;
    boolean bPrintIncOrder;
    OrderMethod orderMethod;
    public ProcessFile (File file, String knownWordList, String savingFolder, 
                        OrderMethod orderMethod, boolean bPrintIncOrder) {
        this.file = file;
        this.knownWordList = knownWordList;
        this.savingFolder = savingFolder;
        this.orderMethod = orderMethod;
        this.bPrintIncOrder = bPrintIncOrder;
    }

    public TreeMap<String, Integer> sort() {
        TreeMap<String, Integer> frequencyData = new TreeMap<>();
        TreeMap<String, Integer> frequencyNewData = new TreeMap<>();
 
        String knownList = knownWordList; //"10k.txt"
        if (!knownList.endsWith(Constants.NONE)) {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(knownList);
//System.out.println("Inputstream:" + inputStream.toString());            
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));           
            ReadWord.readWordBufferedReader(frequencyData, reader);            
        }
        
       // String pathSave = getSaveLoc();

            
        Path fileSave = Paths.get(savingFolder + Constants.FOUND_WORD_LIST);
        if (fileSave.toFile().exists()) {
            ReadWord.readWordFile(frequencyData, fileSave.toFile());
        }
        fileSave = Paths.get(savingFolder + Constants.NOT_FOUND_WORD_LIST);
        if (fileSave.toFile().exists()) {
            ReadWord.readWordFile(frequencyData, fileSave.toFile());
        }
        if (orderMethod == OrderMethod.LOCATION) {
            ReadWord.readWordNewFile(frequencyData, frequencyNewData, file, false);
            PrintTreeMap.printAllCountsBySize(frequencyNewData, !bPrintIncOrder, ORDER_OF_OCCURRENCE);       
        }
        else {
            ReadWord.readWordNewFile(frequencyData, frequencyNewData, file, true);     
            if (orderMethod == OrderMethod.OCCURANCE) {
                PrintTreeMap.printAllCountsBySize(frequencyNewData, !bPrintIncOrder, NUMBER_OF_OCCURRENCE);       
            }
            else {
                PrintTreeMap.printAllCountsAlphabetta(frequencyNewData, bPrintIncOrder, NUMBER_OF_OCCURRENCE);                
            }
        }

        return frequencyNewData;
    }

    public void lookup() {
        TreeMap<String, Integer> frequencyNewData = sort();
        System.out.println("Start: " + " " + Instant.now());
        File dir = new File(savingFolder);
        int fileIndex = 0;
        if (!dir.exists()) {
            dir.mkdirs();
            fileIndex = 1;
        }
        else {
            File file;
            boolean bExist = true;
            while (bExist) {                
                fileIndex = fileIndex + 1;
                file =  new File(savingFolder + FS + SIMPLE_MEANINGS  + fileIndex + DOT_TXT);
                bExist = file.exists();
            }
        }
        Map sortedMap = WordUtils.sortByValues(frequencyNewData, false);
        Set set = sortedMap.entrySet();
        Iterator i = set.iterator();
        List<String> symList = new ArrayList<>(WORDCOUNT);
        int count = 0;
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            symList.add((String) me.getKey());
            count = count + 1;
            if (count % WORDCOUNT == 0) {
                LookupWord.lookupBunch(symList.toArray(new String[0]), savingFolder, fileIndex);
                symList.clear();
                fileIndex = fileIndex + 1;
                System.out.println("Just Done: " + count + " " + Instant.now());
            }
        }
        if (count < WORDCOUNT) {
            LookupWord.lookupBunch(symList.toArray(new String[0]), savingFolder, fileIndex);
        }
        System.out.println("All Done: " + Instant.now());
    }
    
}
