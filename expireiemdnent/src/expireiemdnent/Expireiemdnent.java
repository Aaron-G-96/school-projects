/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package expireiemdnent;

import java.util.Scanner;

public class Expireiemdnent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //This program is Aaron Goodfellow's, who was assisted greatly by several websites and people:
        //People: Caleb Taylor, Corey Rowe
        //Websites: Java API, much of the code was used from the contributions of coders at StackOverflow who were helping other people with the same problems/questions as me.
        //While this code borrows heavily from the aformentioned sources, it has been optimized and made unique by me.
        //enjoy
        
        int attempts = 10;//Head, arms, legs, body, two eyes, a mouth and a nose. 
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //optimizing for user annoyingness
        word = word.toLowerCase();
        
        int wordlength = word.length(); //Store the length which will be used to see if puzzle was solved.
        
        //This is the array that will show you asteriks or '*' or star things. Hence the array name.
        //Corey was working on this before me, and we have both looked online from several sites to properly set up this array
        char[] stars = new char[wordlength]; 
        for(int i = 0; i < stars.length; i++){ 
            stars[i] = '*';
        }
        
        
        //The main loop of the program. It runs when you still have attempts left and when you have not yet guessed the word. 
        //The idea for this for loop came from a coding forum. However, I have modified it's contents and conditions.
        while (wordlength > 1 && attempts > 0){

            System.out.println("Attempts left: " + attempts);
            System.out.print("Enter your guess: ");
            //The guess
            String guess = scan.next();

                if(guess.length() != 1){ 
    
                    System.out.println("Woa. Calm down, if you know the word, you still have to go one at a time.");
                    continue;
                }

            char guessChar = guess.charAt(0);
            //This section was from a helpful person at stackoverflow. Without his contribution, I would be stuck with a game that could only print out astericks
            //and find a correct/incorrect guess once.
            //"I don't understand how this works and have directly copied from others
            //Find matches
            int foundPos = -2;
            int foundCount = 0; //How many matches did we find
            while((foundPos = word.indexOf(guessChar, foundPos + 1)) != -1){
    
                stars[foundPos] = guessChar; //Update the temp array from * to the correct character
                foundCount++;
                
            }

            
            if(foundCount == 0){
                System.out.println("Sorry, didn't find any matches for " + guess);
                attempts--;
            }else{
                System.out.println("Found " + foundCount + " matches for " + guess);
                wordlength--; //Decrease overall counter
            }

            //Print 
            for(int i = 0; i < stars.length; i++){
                System.out.print(stars[i]);
            }
            System.out.println();
            if(wordlength == 0){    
                break; //Solved!
            }

            
        }
    // I do understand how this works and have both modified conditions and contents.
    if(wordlength == 1){
        System.out.println("\n___________________________");
        System.out.println("Solved!");
    }else{
        System.out.println("\n___________________________");
        System.out.println("You lost!");
        System.out.println("It was \"" + word + "\"");     
    }
    //Although this program does borrow heavily from others, it was fixed and optimized by me.
    //Special thanks to Caleb Taylor for general coding help and motiviation
    ///Special thanks to Corey for providing good ideas and help (asterik thing) and character arrays
    //Thanks to Java API for string methods
    //Thanks to StackOverflow for answering all my questions and for the code that was used. 
    //I started making a program from scratch and got as far as I could on my own. However, it became apparent that I needed help
    //I therefore used the aformentioned resources liberally. I hope that next year, as I learn more about Java, I will become less dependent on thrid party services.
    //~Aaron Goodfellow
}
}
