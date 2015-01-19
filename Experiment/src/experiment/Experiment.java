
package experiment;

import java.util.Random;
import java.util.Scanner;



public class Experiment {


    public static void main(String[] args) {
      int a, b;
      
      boolean guess;
      guess = false;
      
      Scanner in = new Scanner(System.in);
      int UserName = in.nextInt();
        
      a = UserName;
      b = 0;
      
      while (guess == false){
          b = b + 1;
          System.out.println(b);
          if (b == a){
            System.out.println(b);
            guess = true;  
          }          
      }
      
      basicLetters.declare();
    }
}

class basicLetters {
    
    public static boolean point;
    
    public static void declare() {
      int letterNum;
      int x = 0;
      boolean guess;
      String a, b;
            String word = null;
      char preletters = 0;
      char letters[]; 
      letters = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; 
      
      
      Scanner scan = new Scanner(System.in);
      String userInput = scan.next();
      String of26 = null;
      
      a = userInput;
      x = 0;
      letterNum = 0;
      guess = false;
              
      while (guess == false){
        letterNum = letterNum + 1;
        x++;
        if (letterNum == 1){
          of26 = ("a");
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 2){
          of26 = "b";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 3){
          of26 = "c";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 4){
          of26 = "d";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 5){
          of26 = "e";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 6){
          of26 = "f";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 7){
          of26 = "g";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 8){
          of26 = "h";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 9){
          of26 = "i";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 10){
          of26 = "j";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 11){
          of26 = "k";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 12){
          of26 = "l";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 13){
          of26 = "m";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 14){
          of26 = "n";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 15){
          of26 = "o";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 16){
          of26 = "p";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 17){
          of26 = "q";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 18){
          of26 = "r";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 19){
          of26 = "s";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 20){
          of26 = "t";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 21){
          of26 = "u";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 22){
          of26 = "v";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 23){
          of26 = "w";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 24){
          of26 = "x";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 25){
          of26 = "y";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
        }else if(letterNum == 26){
          of26 = "z";
          of26 = new String(new char[]{preletters});
          letters[x] = preletters;
          
        }
        System.out.println(letters);
      }
      
      
    }
}    