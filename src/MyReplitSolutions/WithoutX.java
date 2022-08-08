package MyReplitSolutions;

import java.util.Scanner;

public class WithoutX {
    /*
    Use String methods to modify the given word based on the following rules:
If word starts with or ends with x or X print the String without those x characters
If there is no x or X as the first or last character print the word untouched
     */
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        if (word.contains("x")||word.contains("X")) {
            if ((word.startsWith("x") || word.startsWith("X")) && (word.endsWith("x") || word.endsWith("X"))) {
                System.out.println(word.substring(word.indexOf("x") + 1, word.lastIndexOf("x")));
            }
            if (!(word.startsWith("x") || word.startsWith("X")) && (word.endsWith("x") || word.endsWith("X"))) {
                System.out.println(word.substring(0, word.lastIndexOf("x")));
            }
            if ((word.startsWith("x") || word.startsWith("X")) && !(word.endsWith("x") || word.endsWith("X"))) {
                System.out.println(word.substring(word.indexOf("x") + 1));
            }
        }  if (!(word.contains("x") )||!(word.startsWith("x") || word.startsWith("X")) || !(word.endsWith("x") || word.endsWith("X"))){
            System.out.println(word);// sonuncu gecmiyor??

        }
    }
}
