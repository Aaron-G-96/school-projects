/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.scraper.pkg2.pkg0;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import org.joda.time.*;



public class WebScraper20 {
private static String response;
private static String repeat_response;    
    public static void main(String[] args) throws IOException {
      answer();
    }
 

    
    
    public static String getResponse(){
        LocalTime dt = new LocalTime();
        int hour = dt.getHourOfDay();
        if (hour <= 5){
          System.out.println("Wow, someone's up early. What can I do for you this morning?");
        }else if(hour > 5 && hour < 12){
          System.out.println("Good morning. What can I do for you?");
        }else if(hour >= 12 && hour <= 18){
          System.out.println("Good afternoon. What can I do for you?");
        }else if(hour > 18 && hour <= 22){
          System.out.println("Good evening. What can I do for you?");
        }else if(hour > 22 && hour <= 24){
          System.out.println("Shouldn't you be in bed? What can I do for you?");
        }else{
          System.out.println("Either I don't have access to your clock or something is really wrong. Please open source code and debug before further use.");
        }

        Scanner greeting = new Scanner(System.in);
        response = greeting.nextLine().toString();
        return response;
        
  }

  public static String answer() throws IOException{
        getResponse();
        String text = "";
        
        
          if (response.contains("snow") || response.contains("have school") || response.contains("there school")){
            
            //Document is like a scanner. Scraped is a the name of the document variable. We convert it to text and it becomes string text  
            Document scraped = Jsoup.connect("http://ftpcontent2.worldnow.com/wjrt/school/closings.htm").get();
            text = scraped.text();
            if (text.contains("Grand Blanc [web]")){
              System.out.println("Good news. School is closed today.");
              System.out.println("Maybe we can spend some time together.");
            }else if(text.contains("no active records")){
              System.out.println("NO ONE called it.");
            }else{
              System.out.println("Looks like school is on. Sorry. See you in first hour.");
            }
          }else if(response.contains("weather")){
            
            Document scraped = Jsoup.connect("http://wxdata.weather.com/wxdata/weather/rss/local/USMI0339?cm_ven=LWO&cm_cat=rss").get();
            text = scraped.text();
            int a = text.length();
            System.out.println(text.substring(3447, a));
            System.out.println("Sorry for the poor formating. I'm waiting for that to be fixed..."); 
          }else if (response.contains("talk")){
            talk();
          }
        repeat(); 
        return text;
        
    }
  
  public static String talk() throws IOException{
    System.out.println("Alright, so let's talk. First thing's first. What's your name?");
    Scanner scan = new Scanner(System.in);
    String name = scan.next().toString();
    if (name.contains("aleb")){
      caleb();
      return "done";
    }
    if (name.equals("")){
      System.out.println("Fine, I'll just call you Caleb.");
      name = "Caleb";
    }
    System.out.println("Hi " + name + " how are you doing today?");
    
    return "hi";
    }
        
  
  
  public static String caleb() throws IOException{
    boolean stop = false;
    System.out.println("_____________________________________________________________");
    System.out.println("If you feel like stopping just type: stop");
    System.out.println("Ho, Caleb. I was hoping to talk to you. How was your day?");
    
    while (stop == false){
      /*if(){
          
      }else if(){
          
      }
    */
    }
    return "hi";
  }
  
  
  
  
  public static String repeat() throws IOException{
      System.out.println("___________________________");
      System.out.println("Is there anything else I can do for you? Right now I can tell you about snowdays, weather or just talk.");
      
      Scanner greeting = new Scanner(System.in);
      repeat_response = greeting.nextLine().toString();
      repeat_answer();
      return repeat_response;
  } 
  
  public static String repeat_answer() throws IOException{
      String text = "";
      
      if (repeat_response.contains("snow") || repeat_response.contains("have school")){
            
            //Document is like a scanner. Scraped is a the name of the document variable. We convert it to text and it becomes string text  
            Document scraped = Jsoup.connect("http://ftpcontent2.worldnow.com/wjrt/school/closings.htm").get();
            text = scraped.text();
            if (text.contains("Grand Blanc [web]")){
              System.out.println("Good news. School is closed today.");
              System.out.println("Maybe we can spend some time together.");
            }else if(text.contains("no active records")){
              System.out.println("NO ONE called it.");
            }else{
              System.out.println("Looks like school is on. Sorry. See you in first hour.");
            }
          }else if(repeat_response.contains("weather")){
            
            Document scraped = Jsoup.connect("http://wxdata.weather.com/wxdata/weather/rss/local/USMI0339?cm_ven=LWO&cm_cat=rss").get();
            text = scraped.text();
            int a = text.length();
            System.out.println(text.substring(3447, a));
            System.out.println("Sorry for the poor formating. I'm waiting for that to be fixed..."); 
        }

      return text;
  }
}