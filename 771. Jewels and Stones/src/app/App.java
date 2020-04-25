package app;

import java.util.Scanner;
/**
You're given strings J representing the types of stones that are jewels, 
and S representing the stones you have.  
Each character in S is a type of stone you have.  
You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3

Example 2:

Input: J = "z", S = "ZZ"
Output: 0

Note:

    S and J will consist of letters and have length at most 50.
    The characters in J are distinct.

 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String  J = scan.next();
        String S = scan.next();
        scan.close();
        int numJewelsInStones = numJewelsInStones(J, S);
        System.out.println("\nInput J: " + J + "\nInput S: " + S +" \nOutput: " + numJewelsInStones);
    }

    /*public static int numJewelsInStones(String J, String S) {
        int number = 0;
        char[] jewels = J.toCharArray();
        for(int i=0; i< jewels.length; i++){
            char letter = jewels[i];
            number+=S.chars().filter(ch -> ch == letter).count();
        }
        return number;
        
    }*/

    public static int numJewelsInStones(String J, String S) {
        int number = 0;
        for(char c: S.toCharArray()) {
            if(J.indexOf(c) != -1) {
                number++;
            }
        }
        return number;
        
    }
}