package crap;
import java.util.Random;
import java.util.Scanner;
public class Crap {
    public static void main(String[] args) {
        int bet;
        int Money = 100;
        Boolean GameOver = false;
        Boolean ComeOut = true;
        Boolean Run = true;
        
        while (Run == true) {
            if (ComeOut == true) {
                if (GameOver == true) {
                    System.out.println("Roll again? (Y/N)");
                    Scanner restart = new Scanner(System.in);
                    String a = restart.next();
                    if (a.equals("n") || a.equals("N")) {
                        Run = false;
                    }
                }else{
            
                System.out.println("Please place a bet between 10 and 50.");
                Scanner in = new Scanner(System.in);
                bet = in.nextInt();

                if (bet < 10 || bet > 50){
                    System.out.println("YOU CHEATER!");
                    System.out.println("You just layed down $10.");
                    bet = 10;
                }else if (bet > 10 && bet < 20){
                    System.out.println("You never win big being cautious.");
                }else if (bet > 40){
                    System.out.println("Whoa look at you!");
                }else{
                    System.out.println("Good luck");
                }
                    System.out.println("Rolling the dice...");
                    int die1, die2;
                    Random generator = new Random();
                    die1 = generator.nextInt(6);
                    die1 = die1 + 1;

                    Random generator2 = new Random();
                    die2 = generator2.nextInt(6);
                    die2 = die2 + 1;

                    System.out.println(die1 + " " + die2);

                if (die1 + die2 == 2) {
                    System.out.println("Snake Eyes!");
                    System.out.println("You Lose $" + bet);
                    Money = Money - bet;
                    System.out.println("You Have $" + Money);
                    GameOver = true;
                }else if (die1 + die2 == 3) {
                    System.out.println("Ace Deuce!");
                    System.out.println("You Lose $" + bet);
                    Money = Money - bet;
                    System.out.println("You Have $" + Money);
                    GameOver = true;
                }else if (die1 + die2 == 4 && die2 == 2) {
                    System.out.println("Hard Four.");
                    //6 to 5 ratio - six and eight
                    //2 to 1 ratio - four and ten
                    //3 to 2 ratio - five and nine
                    ComeOut = false;
                }else if (die1 + die2 == 4) {
                    System.out.println("Easy Four.");
                    ComeOut = false;
                }else if (die1 + die2 == 5) {
                    System.out.println("Fever Five.");
                    ComeOut = false;
                }else if (die1 + die2 == 6 && die2 == 3) {
                    System.out.println("Hard Six.");
                    ComeOut = false;
                }else if (die1 + die2 == 6) {
                    System.out.println("Easy Six.");
                    ComeOut = false;
                }else if (die1 + die2 == 7) {
                    System.out.println("Seven! Pay the Line!");
                    System.out.println("You Win $" + bet);
                    Money = Money + bet;
                    System.out.println("You Have $" + Money);
                    GameOver = true;
                }else if (die1 + die2 == 8 && die2 == 4) {
                    System.out.println("Hard Eight.");
                    ComeOut = false;
                }else if (die1 + die2 == 8) {
                    System.out.println("Easy Eight.");
                    ComeOut = false;
                }else if (die1 + die2 == 9) {
                    System.out.println("Nina.");
                    ComeOut = false;
                }else if (die1 + die2 == 10 && die2 == 5) {
                    System.out.println("Hard Ten.");
                    ComeOut = false;
                }else if (die1 + die2 == 10) {
                    System.out.println("Easy Ten.");
                    ComeOut = false;
                }else if (die1 + die2 == 11) {
                    System.out.println("Yo-Leven! Pay the Line!");
                    System.out.println("You Win $" + bet);
                    Money = Money + bet;
                    System.out.println("You Have $" + Money);
                    GameOver = true;
                }else if (die1 + die2 == 12) {
                    System.out.println("Boxcars!");
                    System.out.println("You Lose $" + bet);
                    Money = Money - bet;
                    System.out.println("You Have $" + Money);
                    GameOver = true;
                }else{
                    System.out.println("What dice are you using?");
                }
                }
            }else if (ComeOut == false) {
                    System.out.println("Please place a bet behind your pass line bet.");
                    System.out.println("This bet can be zero.");
                    Scanner in = new Scanner(System.in);
                    bet = in.nextInt();

                    if (bet < 10 || bet > 50){
                    System.out.println("YOU CHEATER!");
                    System.out.println("You just layed down $10.");
                    bet = 10;
                }else if (bet > 10 && bet < 20){
                    System.out.println("You never win big being cautious.");
                }else if (bet > 40){
                    System.out.println("Whoa look at you!");
                }else{
                    System.out.println("Good luck");
                }
                    new Scanner(System.in);
                    bet = in.nextInt();
                    System.out.println("Rolling the dice...");
                    int die1, die2;
                    Random generator = new Random();
                    die1 = generator.nextInt(6);
                    die1 = die1 + 1;

                    Random generator2 = new Random();
                    die2 = generator2.nextInt(6);
                    die2 = die2 + 1;

                    System.out.println(die1 + " " + die2);

                if (die1 + die2 == 2) {
                    System.out.println("Snake Eyes!");
                    System.out.println("You Lose $" + bet);
                    Money = Money - bet;
                    System.out.println("You Have $" + Money);
                }else if (die1 + die2 == 3) {
                    System.out.println("Ace Deuce!");
                    System.out.println("You Lose $" + bet);
                    Money = Money - bet;
                    System.out.println("You Have $" + Money);
                }else if (die1 + die2 == 4 && die2 == 2) {
                    System.out.println("Hard Four.");
                    //6 to 5 ratio - six and eight
                    //2 to 1 ratio - four and ten
                    //3 to 2 ratio - five and nine

                }else if (die1 + die2 == 4) {
                    System.out.println("Easy Four.");
                    ComeOut = false;
                }else if (die1 + die2 == 5) {
                    System.out.println("Fever Five.");
                    ComeOut = false;
                }else if (die1 + die2 == 6 && die2 == 3) {
                    System.out.println("Hard Six.");
                    ComeOut = false;
                }else if (die1 + die2 == 6) {
                    System.out.println("Easy Six.");
                ComeOut = false;
                }else if (die1 + die2 == 7) {
                    System.out.println("Seven! Pay the Line!");
                    System.out.println("You Win $" + bet);
                    Money = Money + bet;
                    System.out.println("You Have $" + Money);
                }else if (die1 + die2 == 8 && die2 == 4) {
                    System.out.println("Hard Eight.");
                    ComeOut = false;
                }else if (die1 + die2 == 8) {
                    System.out.println("Easy Eight.");
                    ComeOut = false;
                }else if (die1 + die2 == 9) {
                    System.out.println("Nina.");
                    ComeOut = false;
                }else if (die1 + die2 == 10 && die2 == 5) {
                    System.out.println("Hard Ten.");
                    ComeOut = false;
                }else if (die1 + die2 == 10) {
                    System.out.println("Easy Ten.");
                    ComeOut = false;
                }else if (die1 + die2 == 11) {
                    System.out.println("Yo-Leven! Pay the Line!");
                    System.out.println("You Win $" + bet);
                    Money = Money + bet;
                    System.out.println("You Have $" + Money);
                    Money = Money + bet;
                    System.out.println("You Have $" + Money);
                }else if (die1 + die2 == 12) {
                    System.out.println("Boxcars!");
                    System.out.println("You Lose $" + bet);
                    Money = Money - bet;
                    System.out.println("You Have $" + Money);
                }else{
                    System.out.println("What dice are you using?");
                }
            
            }
        }
    }
}