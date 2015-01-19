
package hangman;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Hangman {

    public static void main(String[] args) {
      String a, b;
      boolean repeat = true;
      
      ArrayList<String> guesses = new ArrayList<String>();
      
      //basic intro to the program, finds your name and says hi.
      a = JOptionPane.showInputDialog("Hello user. Please enter your name."); 
      System.out.println("Sweet. Hi " + a + "I hope you're into music.");
      //the first hangman phrase
      b = "forte";
      
      String user = JOptionPane.showInputDialog("Please guess a letter");
      
      int pos = b.indexOf(user);
      
      if(pos == -1){
        System.out.println("That letter isn't in the word. Sorry");
      }else{
          
      }
      
      
      
      
      
      
    }
}
