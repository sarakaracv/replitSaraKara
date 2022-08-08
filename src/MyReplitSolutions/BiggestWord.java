package MyReplitSolutions;

import java.util.Scanner;

public class BiggestWord {
    /*
    Given a String [] words, find and print the longest word in the array.
    You can assume the elements will have different lengths.
Note: The loop used in the given code is to dynamically create the String array.
You don't need to fully understand this part yet, focus only on having access to an array.
     */
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();

        }
        System.out.println(getLongestString(words));
    }

    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }

            //WRITE YOUR CODE BELOW
        }return longestString;
    }
}