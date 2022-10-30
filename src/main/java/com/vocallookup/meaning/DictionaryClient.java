package com.vocallookup.meaning;

import com.vocallookup.helper.TripleStrings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class DictionaryClient {
    public static TripleStrings dictionaryLookup(String url) throws IOException {
        StringBuilder plainText = new StringBuilder(100);

        Document doc = null;
        
        try {                   
            doc = Jsoup.connect(url)       
            .userAgent("Firefox")
            .timeout(3000)
            .get();
            return DocParser.parse(doc.toString());
        }
        catch (Exception ex) {
            System.out.println("File to process text " + ex.getMessage());
            return null;
        }
    }
    
    public static String getSaveText(String url, String file) throws IOException {
        String str = null;

        Document doc = null;
        
        try {                   
            doc = Jsoup.connect(url)       
            .userAgent("Firefox")
            .timeout(3000)
            .get();   
            
            Files.write( Paths.get(file), doc.toString().getBytes(), StandardOpenOption.CREATE);
            str = doc.toString();
        }
        catch (Exception ex) {          
            ex.printStackTrace();
        }     
                
        return str;
    }

}
