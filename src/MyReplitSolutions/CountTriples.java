package MyReplitSolutions;

import java.util.Scanner;

public class CountTriples {
    /*
    Use a loop to count the number of triples in the given str.
     A triple is when the same character appears three times in a row. So if there is a specific character
     that is repeated three times, that will be counted as one triple. Print the total number of triples found in the String.
     The triples may overlap.
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

Ex:
  Input:
    abcXXXabc

  Output:
    1
Ex:
  Input:
    xxxabyyyycd

  Output:
    3
     */
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW
        int count=0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
