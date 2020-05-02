package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String  J = scan.next();
        String S = scan.next();
        scan.close();
        int numJewelsInStones = numJewelsInStones(J, S);
        System.out.println("\nInput J: " + J + "\nInput S: " + S +" \nOutput: " + numJewelsInStones);
  
    }

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