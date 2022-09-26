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
        System.out.println("-----------------printAllCountsAlphabetta------------------------------");
        System.out.printf("%s     Word\n", title);
        if (bPrintIncOrder == false) {
            abcList = abcList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        }
        for (String word : abcList) {
            System.out.printf("%6d         %s\n", frequencyInput.get(word), word);    
            total = total + frequencyInput.get(word);
        }
        System.out.println("------Word Count: " + frequencyInput.size() + "----Used Total: " + total + " Times----");
    }

    public static void printAllCountsBySize(TreeMap<String, Integer> frequencyInput, boolean bSmallFirst, String title) {
        int total = 0;
        Map sortedMap = WordUtils.sortByValues(frequencyInput, bSmallFirst);
        Set set = sortedMap.entrySet();
        System.out.println("----------------------printAllCountsBySize-------------------------");
        System.out.printf("%s     Word\n", title);
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            //System.out.print(me.getKey() + ": ");
            //System.out.println(me.getValue());
            System.out.printf("%6d         %s\n", me.getValue(), me.getKey());
            total = total +  ((Integer)me.getValue()).intValue();
        }
        //System.out.println("----------------total words:" + frequencyInput.size() + "----------------");
        System.out.println("------Word Count: " + frequencyInput.size() + "----Used Total: " + total + " Times----");
    }
    
}
