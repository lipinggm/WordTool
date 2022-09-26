package helper;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class WordUtils {

    public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map, boolean bSmallFirst) {
        Comparator<K> valueComparator = (K k1, K k2) -> {
            int compare = 0;
            if (bSmallFirst) {                
                compare = map.get(k2).compareTo(map.get(k1));
            } else {                
                compare = map.get(k1).compareTo(map.get(k2));
            }
            if (compare == 0) {
                return 1;
            } else {
                return compare;
            }
        };
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

    public static int getCount(String word, TreeMap<String, Integer> frequencyData) {
        if (frequencyData.containsKey(word)) {
            return frequencyData.get(word);
        } else {
            return 0;
        }
    }
    
}
