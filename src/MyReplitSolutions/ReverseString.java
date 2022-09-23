package MyReplitSolutions;

import java.util.Scanner;

public class ReverseString {
    /*
    Finish the method called reverse() that will take a String input argument and returns a reversed version of input. Reverse the String meaning the characters in the end will be changed to the characters in the beginning and vice versa. The reverse() method is already called in the main method with an argument.
This is a return method with a String parameter
Main topics: methods, Scanner, loops, String, concatenation

Example:

  reverse("java")

output:
  avaj
     */
    public static String reverse(String input){
        //WRITE YOUR CODE BELOW:
        String result="";
        for(int i=input.length()-1; i>=0; i--){
            result+=input.substring(i,i+1);
        }return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
