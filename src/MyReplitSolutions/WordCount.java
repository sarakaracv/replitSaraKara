package MyReplitSolutions;

import java.util.Scanner;

public class WordCount {
    /*
    Finish the method called wordCount() that will take a String words argument and return an int for the number of words in the given words variable. The words are seperated by a space. The wordCount() method is already called in the main method with an argument.
This is a return method with a String parameter
Main topics: methods, Scanner, String, loops

Example:

  wordCount("one two three")

output:
  3
Example:

  wordCount("foo bar")

output:
  2
     */
    public static int wordCount(String words) {
        // your code
        return words.length()- words.replaceAll(" ", "").length()+1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
