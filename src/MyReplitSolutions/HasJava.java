package MyReplitSolutions;

import java.util.Scanner;

public class HasJava {
    /*
    Use String methods to check if the given word contains the text java, but not anywhere in the String.
    The java text must be in either position 0 or position 1 of the String. If the text java appears in any other position
    it is not valid and is not considered to be found in the String. Output a boolean value, true or false.
Note: You won't be able to just use contains method
     */
    public static void main (String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.contains("java")) {
            if (word.startsWith("j") || word.substring(1, 2).contains("j")) {
                System.out.println(true);
            } else {
                System.out.println(exists);
            }
        }else{
            System.out.println(exists);
        }
    }
}
