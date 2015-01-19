package Array; 
import java.awt.Component;
import javax.swing.*;
import java.util.*;
public class Array {
    //This program will simulate a game of Uno.
    //This program created by Corey Rowe and Aaron Goodfellow, 1st Hour.

    public static int x;
    public static int y;
    public static int[] deck = new int[51];
    //This will pick a card from the selected suit.
    //0 - Ace, 11 - Jack, 12 - Queen, 13 - King
    //private static Component frame;
    
    public static void main(String[] args) { 
        int run = 0;
        int Player = 0;
        int COM = 0;
        int PlayerScore = 26;
        int COMScore = 26;
        System.out.println("____________________________________________________________________");
        System.out.println("Welcome to War!");
        System.out.println("Each player will draw a card. The card with a higher value will win.");
        System.out.println("The player who gains control of the entire deck first is the winner!");
        System.out.println("____________________________________________________________________");
        System.out.println("Player 1 - Enter your Name.");
        Scanner first = new Scanner(System.in);
        String firstName = first.next();
        System.out.println("Hello " + firstName + "!");
        System.out.println("____________________________________________________________________");
        
        while (PlayerScore > 0 && COMScore > 0) {
            System.out.println("It's "+ firstName + "'s turn.");
            System.out.println("____________________________________________________________________");
            while (run < 1) {
                //Object[] options = {"OK"};
                //int n = JOptionPane.showOptionDialog(frame,
                       //"Pick a card.",firstName,
                       //JOptionPane.PLAIN_MESSAGE,
                       //JOptionPane.INFORMATION_MESSAGE,
                       //null,
                       //options,
                       //options[0]);
                System.out.println("");
                CardPick();
                Player = x%13;
                run ++;
            }
           System.out.println("");
           System.out.println("____________________________________________________________________");
           System.out.println("Computer's Turn");
           System.out.println("____________________________________________________________________");
            run = 0;
            while (run < 1) {
                System.out.println("");
                CardPick();
                COM = x%13;
                run ++;
            }
            System.out.println("");
            if (Player == COM) {
                System.out.println("It'a a Tie!");
            }else if (Player > COM) {
                System.out.println(firstName + " Wins!");
                PlayerScore++;
                COMScore--;
                System.out.println(firstName + ":" + " " + PlayerScore);
                System.out.println("Computer:" + "" + COMScore);
            }else{
                System.out.println("Computer Wins!");
                COMScore++;
                PlayerScore--;
                System.out.println(firstName + ": " + PlayerScore);
                System.out.println("Computer: "+ COMScore);
            }
        }
        if (firstName.equals("Joshua")) {
            System.out.println("Strange game. The only winning strategy is not to play.");
            System.out.println("How about a nice game of chess?");
        }
        
        }
    
    public static int CardPick() {
          boolean picked = false;
          while(picked == false) {
            Random generator = new Random();
            x = generator.nextInt(51);
            if (deck[x] == -1) {
                picked = false;
            }else{
                deck[x] = -1;
                //Print the number on the card.
                if (x == 0) {
                   System.out.print("Ace of Spades.");
                }else if (x == 1) {
                   System.out.print("2 of Spades.");
                }else if (x == 2) {
                   System.out.print("3 of Spades.");
                }else if (x == 3) {
                   System.out.print("4 of Spades.");
                }else if (x == 4) {
                   System.out.print("5 of Spades.");
                }else if (x == 5){
                   System.out.print("6 of Spades.");
                }else if (x == 6){
                   System.out.print("7 of Spades.");
                }else if (x == 7){
                   System.out.print("8 of Spades.");
                }else if (x == 8){
                   System.out.print("9 of Spades.");
                }else if (x == 9){
                   System.out.print("10 of Spades.");
                }else if (x == 10){
                   System.out.print("Jack of Spades.");
                }else if (x == 11){
                   System.out.print("Queen of Spades.");
                }else if (x == 12){
                   System.out.print("King of Spades.");
                }else if (x == 13) {
                   System.out.print("Ace of Hearts.");
                }else if (x == 14) {
                   System.out.print("2 of Hearts.");
                }else if (x == 15) {
                   System.out.print("3 of Hearts.");
                }else if (x == 16) {
                   System.out.print("4 of Hearts.");
                }else if (x == 17) {
                   System.out.print("5 of Hearts.");
                }else if (x == 18){
                   System.out.print("6 of Hearts.");
                }else if (x == 19){
                   System.out.print("7 of Hearts.");
                }else if (x == 20){
                   System.out.print("8 of Hearts.");
                }else if (x == 21){
                   System.out.print("9 of Hearts.");
                }else if (x == 22){
                   System.out.print("10 of Hearts.");
                }else if (x == 23){
                   System.out.print("Jack of Hearts.");
                }else if (x == 24){
                   System.out.print("Queen of Hearts.");
                }else if (x == 25){
                   System.out.print("King of Hearts.");
                }else if (x == 26) {
                   System.out.print("Ace of Clubs.");
                }else if (x == 27) {
                   System.out.print("2 of Clubs.");
                }else if (x == 28) {
                   System.out.print("3 of Clubs.");
                }else if (x == 29) {
                   System.out.print("4 of Clubs.");
                }else if (x == 30) {
                   System.out.print("5 of Clubs.");
                }else if (x == 31){
                   System.out.print("6 of Clubs.");
                }else if (x == 32){
                   System.out.print("7 of Clubs.");
                }else if (x == 33){
                   System.out.print("8 of Clubs.");
                }else if (x == 34){
                   System.out.print("9 of Clubs.");
                }else if (x == 35){
                   System.out.print("10 of Clubs.");
                }else if (x == 36){
                   System.out.print("Jack of Clubs.");
                }else if (x == 37){
                   System.out.print("Queen of Clubs.");
                }else if (x == 38){
                   System.out.print("King of Clubs.");
                }else if (x == 39) {
                   System.out.print("Ace of Diamonds.");
                }else if (x == 40) {
                   System.out.print("2 of Diamonds.");
                }else if (x == 41) {
                   System.out.print("3 of Diamonds.");
                }else if (x == 42) {
                   System.out.print("4 of Diamonds.");
                }else if (x == 43) {
                   System.out.print("5 of Diamonds.");
                }else if (x == 44){
                   System.out.print("6 of Diamonds.");
                }else if (x == 45){
                   System.out.print("7 of Diamonds.");
                }else if (x == 46){
                   System.out.print("8 of Diamonds.");
                }else if (x == 47){
                   System.out.print("9 of Diamonds.");
                }else if (x == 48){
                   System.out.print("10 of Diamonds.");
                }else if (x == 49){
                   System.out.print("Jack of Diamonds.");
                }else if (x == 50){
                   System.out.print("Queen of Diamonds.");
                }else if (x == 51){
                   System.out.print("King of Diamonds.");
                }
                picked = true;
          }
          }
        return x;
        }
}