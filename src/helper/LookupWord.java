package helper;

import meaning.URLtext;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LookupWord extends Constants {  
    public static void lookupBunch(String symbols[], String savingFolder, int fileIndex) {
        StringBuilder simpleMeaningBuf = new StringBuilder(2000);
        StringBuilder moreMeaningBuf = new StringBuilder(2000);
        StringBuilder detailedMeaningBuf = new StringBuilder(20000);
        StringBuilder foundBuf = new StringBuilder(800);
        StringBuilder notFoundBuf = new StringBuilder(300);
        int count = 1;
        
        for (String symbol: symbols) 
        {
            String addr = CDICT_URL + symbol;

            try {
                TripleStrings Meanings = URLtext.getProcessText(addr);

                String simple = Meanings.getSimple();
                String more = Meanings.getMore();
                String detailed = Meanings.getDetailed();
                if (simple != null && simple.length() != 0) {
                    simpleMeaningBuf.append(count).append(". ").append(simple).append("\n").append("\n");
                    moreMeaningBuf.append(count).append(". ").append(more).append("\n").append("\n");
                    detailedMeaningBuf.append(count).append(". ").append(detailed).append("\n").append("\n");
                    foundBuf.append(count).append(". ").append(symbol).append("\n");
                    count = count + 1;
                }
                else {
                   notFoundBuf.append(symbol).append("\n");
                }     
                
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
                    
        try {
            if (simpleMeaningBuf.length() > 0) {       
               final Path fileSave = Paths.get(savingFolder + FS + SIMPLE_MEANINGS  + fileIndex + DOT_TXT);
               Files.write(fileSave, simpleMeaningBuf.toString().getBytes(), Files.exists(fileSave) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
            }
            
            if (moreMeaningBuf.length() > 0) {       
               final Path fileSave = Paths.get(savingFolder +  FS + MORE_MEANINGS + fileIndex + DOT_TXT);
               Files.write(fileSave, moreMeaningBuf.toString().getBytes(), Files.exists(fileSave) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
            }
                        
            if (detailedMeaningBuf.length() > 0) {       
               final Path fileSave = Paths.get(savingFolder +  FS + DETAILED_MEANINGS  + fileIndex + DOT_TXT);
               Files.write(fileSave, detailedMeaningBuf.toString().getBytes(), Files.exists(fileSave) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
            }

            if (foundBuf.length() > 0) {       
                final Path fileSave = Paths.get(savingFolder +  FS + FOUND_WORD_LIST);                                       
                Files.write(fileSave, foundBuf.toString().getBytes(), Files.exists(fileSave) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
            }

            if (notFoundBuf.length() > 0) {       
                final Path fileSave = Paths.get(savingFolder +  FS  + NOT_FOUND_WORD_LIST);                                       
                Files.write(fileSave, notFoundBuf.toString().getBytes(), Files.exists(fileSave) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
            }
             
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     
}
    
