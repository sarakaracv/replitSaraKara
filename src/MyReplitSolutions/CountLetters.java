package MyReplitSolutions;

import java.util.Scanner;

public class CountLetters {
    /*
    Write a method countLetters that can count letters in a given string and return a new string in the given format:

number of letters + letter
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){
        String count = "";
        while (str.length() > 0) {
            count += str.length() - str.replaceAll(str.substring(0, 1), "").length() + str.substring(0, 1);
            str = str.replaceAll(str.substring(0, 1), "");
        }
        return count;

    }
}
