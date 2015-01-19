
package eliza;

import java.util.Scanner;


public class Eliza {

 
    public static void main(String[] args) {
        System.out.println("************************");
        String ptype = System.getenv("PROCESSOR_ARCHITECTURE");
        String pnumber = System.getenv("NUMBER_OF_PROCESSORS");
        System.out.println("Nice computer. " + pnumber + " " + ptype + " processeors.");
        System.out.println("Hello. I'm sorry, what is your name?");
        System.out.print(" - ");
        
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine().toString().toLowerCase();
    
    if (name.contains("melissa")){
      System.out.println("That's good. Hi Melissa. Just to be sure, what is your favorite color?");
      System.out.print(" - ");
      Scanner scan1 = new Scanner(System.in);
      String color = scan1.nextLine().toString().toLowerCase();
      if (color.contains("yellow")){
          System.out.println("\nOh good. It is you. Interesting form of communication don't you think?");
      }else{
          System.out.println("That's strange. You didn't put in the right color. Goodbye.");
          System.exit(0);
      }
    }else{
      System.out.println("That did not contain the right name. Sorry.");
      System.exit(0);
    }
    
    System.out.println("It is somewhat limited. I have to guess your responses. Oh well."
            + "\nDo you already know the password to get into the hidden folder?"); 
    System.out.print(" - ");
    
    
    Scanner scan2 = new Scanner(System.in);
    String answer = scan2.nextLine().toString().toLowerCase();
    
    if (answer.contains("yes")){
      System.out.println("Then I have no reason for being executed. I'm stopping my program. Goodbye.");
      System.exit(0);
    }else{
      System.out.println("");
      System.out.println("Step 1: You have to click on the batch file. It's called 'locker'."
              + "        \nStep 2: The program will prompt you for a password. It is INELOQUENCE. All caps."
              + "        \nStep 3: The folder should appear and you will have access to it."
              + "        \nStep 4: To relock the folder, click on the batch file again. Y is yes. N is no."
              + "        \n \nOnce you're done with these instructions type 'bye' and this program will end.  ");
      System.out.print(" - ");
    }
    
    Scanner scan3 = new Scanner(System.in);
    String good = scan3.nextLine().toString().toLowerCase();
    
    if(good.contains("bye")){
      System.exit(0);
    }else{
      System.exit(0);
    }
    
    
    }
}