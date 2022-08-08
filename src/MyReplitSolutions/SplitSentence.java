package MyReplitSolutions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SplitSentence {
    /*
    Given a String sentence use the split() method to divide each word from the sentence and print them in separate lines
Hint: Think about what comes between each word in the sentence

Main topics: arrays, String
     */
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] arrOfStr = sentence.split(" ", 5);

        for (String each : arrOfStr)
            System.out.println(each);

        }}


