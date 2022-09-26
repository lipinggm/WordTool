package meaning;


import helper.Constants;
import helper.TripleStrings;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileText extends Constants{
    public static String getText(String url) throws IOException {
        //StringBuilder plainText = new StringBuilder(100);
        //System.out.println(url);
        
        String str = new String(Files.readAllBytes(Paths.get(url)));
                      
        return str;
    }
    
    public static TripleStrings getProcessText(String url) throws IOException {
        //System.out.println(url);
        
        String str = new String(Files.readAllBytes(Paths.get(url)));
      //  System.out.println(str);
      //  Document doc = Jsoup.parse(new File(url), "utf-8");
                      
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
                          //  System.out.println(token);
                           // System.out.println("<------->");
                            String brs[] = token.split("<br>");
                            for (int brN = 1; brN < brs.length; brN++) {
                            //    System.out.println(brs[brN]);
                         //       System.out.println("++++++++++++++");
                             //   System.out.println(brs[brN].replaceAll("<.*?>","").trim());
                                detailedText.append(brs[brN].replaceAll("<.*?>","").trim());
                        //        System.out.println("-------");
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
