package MyReplitSolutions;

import java.util.Scanner;

public class HalfTwice {
    /*
Use String methods to print the first half of the given word, twice. Find the beginning half of the
 String and concatenation it twice.
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    java

  Output:
    jaja
Ex:
  Input:
    unity

  Output:
    unun
     */
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE
        String twice = word.substring(0, (word.length()/2));
        System.out.println(twice.repeat(2));

    }
}
