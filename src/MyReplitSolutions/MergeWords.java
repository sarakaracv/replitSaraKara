package MyReplitSolutions;

import java.util.Scanner;

public class MergeWords {
    /*
    Use String methods and if statements to combine the two given String variables, word1 and word2 together,
    but only combine them if the Strings are only three character long. If either String is not three characters long,
    do not merge them together and instead print cannot merge. If both Strings are three characters long then merge them
    together in the following format and print the merged String:
The Strings will be merged by taking the first character of the first word,
then the first character of the second word, then the second character of the first word, etc...
Hint: Concatenating any type with a String, converts the type to a String
     */
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        if (word2.length() == 3 && word1.length() == 3) {
            System.out.println(word1.substring(0,1) + word2.substring(0,1) + word1.substring(1,2)  + word2.substring(1,2)  +
                    word1.substring(2,3)  + word2.substring(2,3) );
        } else {
            System.out.println("cannot merge");
        }
    }
}
