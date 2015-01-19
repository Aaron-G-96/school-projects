/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringguesser;

import java.util.Scanner;

/**
 *
 * @author 008230
 */
public class Stringguesser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int letterNum, x;
      boolean guess;
      String a, b;
      String letter = null;
      String word = "a";
      
      Scanner scan = new Scanner(System.in);
      String userInput = scan.next();
        
      a = userInput;
      x = 0;
      letterNum = 0;
      guess = false;
              
      while (guess == false){
        letterNum = letterNum + 1;
        x++;
        if (letterNum == 1){
          letter = "a";
        }else if(letterNum == 2){
          letter = "b";
        }else if(letterNum == 3){
          letter = "c";
        }else if(letterNum == 4){
          letter = "d";
        }else if(letterNum == 5){
          letter = "e";
        }else if(letterNum == 6){
          letter = "f";
        }else if(letterNum == 7){
          letter = "g";
        }else if(letterNum == 8){
          letter = "h";
        }else if(letterNum == 9){
          letter = "i";
        }else if(letterNum == 10){
          letter = "j";
        }else if(letterNum == 11){
          letter = "k";
        }else if(letterNum == 12){
          letter = "l";
        }else if(letterNum == 13){
          letter = "m";
        }else if(letterNum == 14){
          letter = "n";
        }else if(letterNum == 15){
          letter = "o";
        }else if(letterNum == 16){
          letter = "p";
        }else if(letterNum == 17){
          letter = "q";
        }else if(letterNum == 18){
          letter = "r";
        }else if(letterNum == 19){
          letter = "s";
        }else if(letterNum == 20){
          letter = "t";
        }else if(letterNum == 21){
          letter = "u";
        }else if(letterNum == 22){
          letter = "v";
        }else if(letterNum == 23){
          letter = "w";
        }else if(letterNum == 24){
          letter = "x";
        }else if(letterNum == 25){
          letter = "y";
        }else if(letterNum == 26){
          letter = "z";
        }
        System.out.println(letter);
        if (letter.equals(a)){ 
          guess = true;
        }else if (word.equals(a)){
          guess = true;
        }else if (letter.equals(a.substring(0,1)) && x == 1){
          word = letter;
        }else if(letter.equals(a.substring(1, 2)) && x == 2){
          word = word.concat(letter);
        }else if(letter.equals(a.substring(2, 3)) && x == 3){
          word = word.concat(letter);
        }else if(letter.equals(a.substring(3, 4)) && x == 4){
          word = word.concat(letter);
        }else if(letter.equals(a.substring(4, 5)) && x == 5){
          word = word.concat(letter);
        }else if(letter.equals(a.substring(5, 6)) && x == 6){
          word = word.concat(letter);
        }else if(letter.equals(a.substring(6, 7)) && x == 7){
          word = word.concat(letter);
        }else{
          System.out.println("why?");
        }
      }
      System.out.println(word);
    }
}
