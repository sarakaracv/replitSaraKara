package MyReplitSolutions;

import java.util.Scanner;

public class CatsAndDogs {
    /*
    Use a loop to count how many times the characters cat and dog are found in the given String str. Output true if cat and dog appear the same number of times, otherwise output false
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

Ex:
  Input:
    catdog

  Output:
    true
Ex:
  Input:
    catcat

  Output:
    false
     */
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
        int catCount=0;
        int dogCount=0;
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i, i+3).equals("cat"))
                catCount+=1;
            if(str.substring(i, i+3).equals("dog"))
                dogCount+=1;

        }

        if (catCount!=dogCount)
            System.out.println("false");
        else System.out.println("true");


    }
}
