package com.vocallookup.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.jsoup.Jsoup;

public class ReadWord {
    public static void readWordBufferedReader(TreeMap<String, Integer> frequencyData, BufferedReader  reader) {
        String word;
        Integer count;

        try {
            while (((word = reader.readLine()) != null)) {
                // Read the next word and get rid of the end-of-line marker if needed:
               // word = wordFile.next().trim();
                count = WordUtils.getCount(word.trim(), frequencyData) + 1;
                frequencyData.put(word.toLowerCase(), count);
            } 
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void readWordFile(TreeMap<String, Integer> frequencyData, File file) {
        Scanner wordFile;
        String word;
        Integer count;
        try {
            wordFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println(e);
            return;
        }
        // This will make sure we read only words, no spaces, numbers, punctuation, etc.
        // Unfortunately, apostrophes and hyphens are considered delimeters
        // here (have to be, in order for quotes and dashes to work correctly)
        // which means that words with apostophes and hyphens get split,
        // rather than taken as single words
        wordFile.useDelimiter("[^a-zA-Z]+");
        while (wordFile.hasNext()) {
            // Read the next word and get rid of the end-of-line marker if needed:
            word = wordFile.next().trim();
            count = WordUtils.getCount(word, frequencyData) + 1;
            frequencyData.put(word.toLowerCase(), count);
        }
    }

    public static void readWordNewFile(TreeMap<String, Integer> frequencyData, TreeMap<String, Integer> frequencyNewData, 
            String urlText, Scanner wordFile, boolean bOrderbyFreq) {
        String word; // A word read from the file
        Integer count; // The number of occurrences of the
        Integer start = 1;
        
        if(urlText != null && urlText.length() > 0) {
            //From URL
            StringTokenizer tokenizer = new StringTokenizer(urlText, ",; ");
            while (tokenizer.hasMoreElements()) {
                word = tokenizer.nextToken();
                if (bOrderbyFreq) {
                if (!frequencyData.containsKey(word.toLowerCase())) {
                    count = WordUtils.getCount(word, frequencyNewData) + 1;
                    frequencyNewData.put(word, count);
                }
                } else {
                    // Order by location
                    if (!frequencyData.containsKey(word.toLowerCase()) && !frequencyNewData.containsKey(word)) {
                        frequencyNewData.put(word, start++);
                    }
                }
            }
        } else {
            //From local file
            wordFile.useDelimiter("[^a-zA-Z]+");
            while (wordFile.hasNext()) {
                word = wordFile.next().trim().replaceAll("<[^>]*>", "").replaceAll("<.*?", "");
                word = Jsoup.parse(word).text();
                if (bOrderbyFreq) {
                    if (!frequencyData.containsKey(word.toLowerCase())) {
                        count = WordUtils.getCount(word, frequencyNewData) + 1;
                        frequencyNewData.put(word, count);
                    }
                } else {
                    // Order by location
                    if (!frequencyData.containsKey(word.toLowerCase()) && !frequencyNewData.containsKey(word)) {
                        frequencyNewData.put(word, start++);
                    }
                }
            }
        }
    }
}
