
package cypher;

import java.util.Scanner;


public class Cypher {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine().toString().toLowerCase();
        
        if (command.equals("encrypt")){
            Scanner scan2 = new Scanner(System.in);
            String secret = scan.nextLine().toString().toLowerCase(); 
            for (int i = 0; i < secret.length(); i++)
              if (secret.substring(i, i + 1).equals("a")){
                secret.substring(i, i + 1) = "g";
              }    
        }
    }
}
