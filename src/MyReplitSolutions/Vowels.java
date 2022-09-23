package MyReplitSolutions;

import java.util.Scanner;

public class Vowels {
    /*
    Use a loop to print each vowel( a, e, i, o, u) from the given word
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

Ex:
  Input:
    howdyho

  Output:
    oo
Ex:
  Input:
    java

  Output:
    aa
    Ex:
  Input:
    apple

  Output:
    ae
     */
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW
        String vowel = "aeiuo";
        for (int i = 0; i < word.length(); i++) {
            if (vowel.contains(String.valueOf(word.charAt(i)))) {
                System.out.print(word.charAt(i));
            }
        }
    }
}
