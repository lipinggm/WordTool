package meaning;

import helper.TripleStrings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class URLtext {
    public static TripleStrings getProcessText(String url) throws IOException {
        StringBuilder plainText = new StringBuilder(100);

        Document doc = null;
        
        try {                   
            doc = Jsoup.connect(url)       
            .userAgent("Firefox")
            .timeout(3000)
            .get();   
            
//            System.out.println("Doc:" + doc.toString());
        }
        catch (Exception ex) {          
            ex.printStackTrace();
        }     
                
        return FileText.textProcess(doc.toString());
    }
    
    public static String getSaveText(String url, String file) throws IOException {
       // StringBuilder plainText = new StringBuilder(100);
//System.out.println(url);
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
