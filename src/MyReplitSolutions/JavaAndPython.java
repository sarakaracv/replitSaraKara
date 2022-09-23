package MyReplitSolutions;

import java.util.Scanner;

public class JavaAndPython {
    /*
    Use a loop to count how many times the characters java and python are found in the given String sentence. Output true if java and python appear the same number of times, otherwise output false.
Note: Case sensitivity should be considered. We are looking for the lowercase character versions of both Strings
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

Ex:
  Input:
    We study java not python

  Output:
    true
    Ex:
  Input:
    What's the difference between java, javascript and python?

  Output:
    false

  -> the 'java' characters appear 2 times in the String but the 'python' characters appear only 1 time.

     */
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW
        int countJava=0;
        int countPython=0;

        for(int i=0; i<sentence.length()-3; i++){

            if(sentence.substring(i, i+4).equals("java")){
                countJava++;
            }
        }
        for(int i=0; i<sentence.length()-5; i++){
            if (sentence.substring(i, i+6).equals("python")) {
                countPython++;
            }
        }

        if(countJava==countPython){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
