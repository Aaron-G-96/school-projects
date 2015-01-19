
//example only by Caleb Taylor
package yahtzee;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Yahtzee {
    
public static boolean y, yy, yyy, yyyy, yyyyy;

    public static void main(String[] args){
            

        Dicerdog.Declare();
        
        Scanner z = new Scanner(System.in);
        
        System.out.println("Please give me your name");
        
        String q = z.nextLine();
        
        if (q.equals("Timothy")){
            System.out.println("You are too smart to play this game. You WIN");
        }
        if (q.equals("Caleb") || q.equals("Caleb Taylor") || q.equals("caleb")){
            System.out.println("Don't you have calculus to be doing?");
        }                                                                                           
        if (q.equals("John") || q.equals("JED") || q.equals("John Dalton")){
            System.out.println("Shouldn't you be arguing with Mr. Wesner?");
        }
        if (q.equals("Mr. Wesner")){
            System.out.println("This game is not rigged in your favor (wink, wink)");
            System.out.println("Please give us an A++ and not a C++");
        }
        if (q.equals("The coolest guy ever") || q.equals("The creator")){
            System.out.println("Don't you mean Caleb?");
        }
        if (q.equals("Phillip") || q.equals("Philip") || q.equals("philip") || q.equals("phillip")){
            System.out.println("The world would be lost without you");
        }
        if (q.equals("Chiba Tadayoshi") || q.equals("chiba tadayoshi")){
            System.out.println("That means Caleb Taylor in Japanese. What a cool guy");
        }
        if (q.equals("Saruwatari Taiki") || q.equals("saruwatari taiki")){
            System.out.println("That means Timothy Bogdan in Japanese. What a cool guy");
        }
        if (q.equals("Nakajima Masaki") || q.equals("nakajima masaki")){
            System.out.println("That means John Dalton in Japanese. What a cool guy");
        }
        else {
            System.out.println("Enjoy your game of Yahtzee");
        }
            System.out.println(Checkerdog.d1 + "\t" + Checkerdog.d2 + "\t" + Checkerdog.d3 + "\t" + Checkerdog.d4 + "\t" + Checkerdog.d5);
            
            System.out.println("Type in true for every dice you want to save or false to re-roll");
            
            Scanner cjt = new Scanner(System.in);
            
            y = cjt.nextBoolean();
            yy = cjt.nextBoolean();
            yyy = cjt.nextBoolean();
            yyyy = cjt.nextBoolean();
            yyyyy = cjt.nextBoolean();
            
            Checkerdog.method();
            
            System.out.println(Checkerdog.d1 + "\t" + Checkerdog.d2 + "\t" + Checkerdog.d3 + "\t" + Checkerdog.d4 + "\t" + Checkerdog.d5);
            
            System.out.println("Type in true and false again");
            
            Scanner tcj = new Scanner(System.in);
            
            y = tcj.nextBoolean();
            yy = tcj.nextBoolean();
            yyy = tcj.nextBoolean();
            yyyy = tcj.nextBoolean();
            yyyyy = tcj.nextBoolean();
            
            Checkerdog.method();
            
            System.out.println(Checkerdog.d1 + "\t" + Checkerdog.d2 + "\t" + Checkerdog.d3 + "\t" + Checkerdog.d4 + "\t" + Checkerdog.d5);
            
            Checkercat.Cat();
            
            Pointdog.method();
            
            
    }
}











class Pointdog {
    
    public static boolean point;
    
    public static void method() {
        
        
        Scanner tcj = new Scanner(System.in);
            
            int score = 0;
            int count = 0;
            int whileloop = 1;
            int d1 = Checkerdog.d1;
            int d2 = Checkerdog.d2;
            int d3 = Checkerdog.d3;
            int d4 = Checkerdog.d4;
            int d5 = Checkerdog.d5;
            int counttk = 0;
            
            
            String point = tcj.nextLine();
            
            if (point.equals("1")){
                
                if (Checkerdog.d1 == 1){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 1){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 1){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 1){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 1){
                    count = count + 1;
                }
                score = count;
            }
            if (point.equals("2")){
                
                if (Checkerdog.d1 == 2){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 2){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 2){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 2){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 2){
                    count = count + 1;
                }
                score = 2 * count;
            }
            if (point.equals("3")){
                
                if (Checkerdog.d1 == 3){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 3){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 3){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 3){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 3){
                    count = count + 1;
                }
                score = 3 * count;
            }
            if (point.equals("4")){
                
                if (Checkerdog.d1 == 4){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 4){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 4){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 4){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 4){
                    count = count + 1;
                }
                score = 4 * count;
            }
            if (point.equals("5")){
                
                if (Checkerdog.d1 == 5){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 5){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 5){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 5){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 5){
                    count = count + 1;
                }
                score = 5 * count;
            }
            if (point.equals("6")){
                
                if (Checkerdog.d1 == 6){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 6){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 6){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 6){
                    count = count + 1;
                }
                if (Checkerdog.d2 == 6){
                    count = count + 1;
                }
                score = 6 * count;
            }
            if (point.equals("tk")){
                
                while (whileloop < 6){
                    
                    if (d1 == whileloop){
                        counttk = counttk + 1;
                    }
                    if (d2 == whileloop){
                        counttk = counttk + 1;
                    }
                    if (d3 == whileloop){
                        counttk = counttk + 1;
                    }
                    if (d4 == whileloop){
                        counttk = counttk + 1;
                    }
                    if (d5 == whileloop){
                        counttk = counttk + 1;
                    }
                    
                    if (counttk < 3){
                        System.out.println("You are a cheater, you lose");
                        score = -666;
                    }
                    
                    if (counttk >= 3){
                        score = d1 + d2 + d3 + d4 + d5;
                    } 
                        whileloop ++;
                }
            }
            
            if (point.equals("fk")){
                whileloop = 0;
                
                while (whileloop < 6){
                    
                    if (d1 == whileloop){
                        counttk = counttk + 1;
                    }
                    if (d2 == whileloop){
                        counttk = counttk + 1;
                    }
                    if (d3 == whileloop){
                        counttk = counttk + 1;
                    }
                    if (d4 == whileloop){
                        counttk = counttk + 1;
                    }
                    if (d5 == whileloop){
                        counttk = counttk + 1;
                    }
                    
                    if (counttk < 4){
                        System.out.println("You are a cheater, you lose");
                        score = -666;
                    }
                    
                    if (counttk >= 4){
                        score = d1 + d2 + d3 + d4 + d5;
                    } 
                        whileloop ++;
                }
            }
            if (point.equals("fh")){
            }
            if (point.equals("ss")){
            }
            if (point.equals("ls")){
            }
            if (point.equals("y")){
            }
            if (point.equals("c")){
                score = (Checkerdog.d1 + Checkerdog.d2 + Checkerdog.d3 + Checkerdog.d4 + Checkerdog.d5);
            }
        
            System.out.println(score);
            
    }
    
    
    }







 class Dicerdog {
     
       public static int d1 = 0;
       public static int d2 = 0;
       public static int d3 = 0;
       public static int d4 = 0;
       public static int d5 = 0;
       
    public static void Declare() {
      Checkerdog.d1 = Random();
      Checkerdog.d2 = Random();
      Checkerdog.d3 = Random();
      Checkerdog.d4 = Random();
      Checkerdog.d5 = Random();
    }
       
public static int Random(){
    int y;
    
    double x = Math.random();
       x *= 6;
       int r = (int) x;
       y = Math.round(r) + 1;
       
    return y;
}
}




class Checkerdog {
    
    public static int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;
    
    public static void method() {

        fixIt();
        if (suckIt == false){
                d1 = Random();
        }
        if (tuckIt == false){
                d2 = Random();
        }
        if (buckIt == false){
                d3 = 0;
                d3 = d3 + Random();
        }
        if (yuckIt == false){
                d4 = 0;
                d4 = d4 + Random();
        }
        if (luckIt == false){
                d5 = 0;
                d5 = d5 + Random();
        }
}

    public static int Random(){
    int y;
    
    double x = Math.random();
       x *= 6;
       int r = (int) x;
       y = Math.round(r) + 1;
       
    return y;
    
}
    public static void fixIt(){
        
        suckIt = Yahtzee.y;
        tuckIt = Yahtzee.yy;
        buckIt = Yahtzee.yyy;
        yuckIt = Yahtzee.yyyy;
        luckIt = Yahtzee.yyyyy;
        
    }
    public static boolean suckIt;
    public static boolean tuckIt;
    public static boolean buckIt;
    public static boolean yuckIt;
    public static boolean luckIt;
}






class Checkercat {
    
    public static void Cat() {
        
   
            System.out.println("Type in the kind of catagory you want");
            System.out.println("1's(1)" + "\t" + "Three of a kind(tk)");
            System.out.println("2's(2)" + "\t" + "Four of a kind(fk)");
            System.out.println("3's(3)" + "\t" + "Full House(fh)");
            System.out.println("4's(4)" + "\t" + "Small Straight(ss)");
            System.out.println("5's(5)" + "\t" + "Large Straight(ls)");
            System.out.println("6's(6)" + "\t" + "Yahtzee(y)");
            System.out.println("\t" + "Chance(c)");
}
}

