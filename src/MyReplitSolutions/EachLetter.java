package MyReplitSolutions;

import java.util.Scanner;

public class EachLetter {
    /*
    Use a loop to print each letter of the given word on a separate line
Main topics: loops, primitive datatypes, operators, Scanner, String

Ex:
  Input:
    hello

  Output:
    h
    e
    l
    l
    o
     */
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW

        for(int i=0;i<word.length();i++){

            System.out.println(word.charAt(i));}
    }
}
