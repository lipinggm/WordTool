package com.vocallookup.meaning;


import com.vocallookup.helper.Constants;
import com.vocallookup.helper.TripleStrings;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileText extends Constants{
    public static String getText(String url) throws IOException {
        String str = new String(Files.readAllBytes(Paths.get(url)));
                      
        return str;
    }
    
    public static TripleStrings getProcessText(String url) throws IOException {
        String str = new String(Files.readAllBytes(Paths.get(url)));
        return textProcess(str);
    }  
    
    public static TripleStrings textProcess(String str) {
        StringBuilder simpleText = new StringBuilder(200);    
        StringBuilder moreText = new StringBuilder(200);
        StringBuilder detailedText = new StringBuilder(1000);
        int count = 0;
    
        if (str != null) {
            String pres[] = str.split("<pre>");
            if (pres.length >= 2) {
                String backPres [] = pres[1].split("</pre>");
                if (backPres.length >= 1) {
                    String tokens[] = backPres[0].split("<span class=\"source\">");

                    for (String token: tokens) {
                        if (token.contains("來源") && !token.contains("看影片學英語")) {
                            String brs[] = token.split("<br>");
                            for (int brN = 1; brN < brs.length; brN++) {
                                detailedText.append(brs[brN].replaceAll("<.*?>","").trim());
                            }
                            count = count + 1;                            
                            if (count == 1) {
                                simpleText.append(detailedText.toString());
                            }
                            else if (count == 2) {
                                moreText.append(detailedText.toString());
                            }
                        }
                    }     
                }

            }
  
        }
    
        return new TripleStrings(simpleText.toString(), moreText.toString(), detailedText.toString());
    }
}
