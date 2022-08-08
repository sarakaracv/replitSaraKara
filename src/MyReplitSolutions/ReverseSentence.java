package MyReplitSolutions;

import java.util.Scanner;

public class ReverseSentence {
    /*
Given a String sentence print a version with the words reversed.
The order of the words is changed, not the letters.
Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, concatenation, index, primitive dataypes
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String[] sentence2 = sentence.split(" ");
        String reversed = "";
        for (int i = sentence2.length - 1; i >= 0; i--) {
            reversed += sentence2[i] + " ";
        }
        System.out.println(reversed.trim());
    }
}
