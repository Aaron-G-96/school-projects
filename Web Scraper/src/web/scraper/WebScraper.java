/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.scraper;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.net.*;
import java.io.*;


public class WebScraper {

public static void main(String[] args) {
scrapeTopic("/wiki/Python");
}
public static void scrapeTopic(String url){
  String html = getUrl("http://www.wikipedia.org/"+url);
  Document doc = Jsoup.parse(html);
  Elements contentText = doc.select("#mw-content-text >p".toString());
  
  System.out.println(contentText);
}
public static String getUrl(String url){
  URL urlObj = null;
  try{
    urlObj = new URL(url);
  }
  catch(MalformedURLException e){
  System.out.println("The url was malformed!");
  return "";
  }
  URLConnection urlCon = null;
  BufferedReader in = null;
  String outputText = "";
  try{
  urlCon = urlObj.openConnection();
  in = new BufferedReader(new
  InputStreamReader(urlCon.getInputStream()));
  String line = "";
  while((line = in.readLine()) != null){
    outputText += line;
  }
  in.close();
  }catch(IOException e){
  System.out.println("There was an error connecting to the URL\"");
  
  return "";
 }
return outputText;
}
}











/**

  
    public static void main(String[] args) throws IOException { {
       
        
        String url = "http://www.wikipedia.org/";
        print("Fetching %s...", url);

        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("a[href]");
        Elements media = doc.select("[src]");
        Elements imports = doc.select("link[href]");

        print("\nMedia: (%d)", media.size());
        for (Element src : media) {
            if (src.tagName().equals("img"))
                print(" * %s: <%s> %sx%s (%s)",
                        src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
                        trim(src.attr("alt"), 20));
            else
                print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
        }

        print("\nImports: (%d)", imports.size());
        for (Element link : imports) {
            print(" * %s <%s> (%s)", link.tagName(),link.attr("abs:href"), link.attr("rel"));
        }

        print("\nLinks: (%d)", links.size());
        for (Element link : links) {
            print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
        }
    }
    }
    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width){
            return s.substring(0, width-1) + ".";
        }else{
            return s;
    }
    }
        
        
        
    }
**/

