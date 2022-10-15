package helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PrintTreeMap {

    public static void printAllCountsAlphabetta(TreeMap<String, Integer> frequencyInput, boolean bPrintIncOrder, String title) {
        int total = 0;
        List<String> abcList = new ArrayList<>(frequencyInput.keySet());
        if (bPrintIncOrder == false) {
            abcList = abcList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        }
        for (String word : abcList) {
            total = total + frequencyInput.get(word);
        }
    }

    public static void printAllCountsBySize(TreeMap<String, Integer> frequencyInput, boolean bSmallFirst, String title) {
        int total = 0;
        Map sortedMap = WordUtils.sortByValues(frequencyInput, bSmallFirst);
        Set set = sortedMap.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            total = total +  ((Integer)me.getValue()).intValue();
        }
    }
    
}
