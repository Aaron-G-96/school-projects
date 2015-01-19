
package pig.latin;

import java.util.Arrays;
import java.util.Scanner;


public class PigLatin {


    public static void main(String[] args) {     
        int vowel = 0;
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine().toString().toLowerCase();
        String [] parts = name.split(" "); //all parts stored in an array
        String [] newparts = new String[parts.length];
        for (int i = 0; i < parts.length ; i++){
          
        
            if (parts[i].substring(0,1).equals("a") || parts[i].substring(0,1).equals("e") || parts[i].substring(0,1).equals("i") ||
                parts[i].substring(0,1).equals("o") || parts[i].substring(0,1).equals("u")){
                parts[i] = parts[i].substring(0,1).toUpperCase() + parts[i].substring(1, parts[i].length());
                newparts[i] = (parts[i] + "way");
            }else if (parts[i].length() <= 2){
                newparts[i] = parts[i];
            }else{
                for (int q = 0; q < parts[i].length() - 1; q++){
                if (parts[i].substring(q, q + 1).equals("a") || parts[i].substring(q, q + 1).equals("e") || parts[i].substring(q, q + 1).equals("i") ||
                parts[i].substring(q, q + 1).equals("o") || parts[i].substring(q, q + 1).equals("u")){
                vowel = q; 
                }
            }
                
                String ending = parts[i].substring(0,vowel);
                String thing = (parts[i].substring(vowel, vowel + 1) + parts[i].substring(vowel + 1, parts[i].length()) + ending + "ay");
                newparts[i] = thing;
            }
        
        }
        System.out.println(Arrays.toString(newparts));
        
    }
}
