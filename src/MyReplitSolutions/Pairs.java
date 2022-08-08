package MyReplitSolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Pairs {
    /*
    Given a String [] arr, print a pair of items together in one line until all the pairs are printed.
    A pair is a element and the element next to it. Print each item with a comma in between them.
Note: The loop used in the given code is to dynamically create the String array.
You don't need to fully understand this part yet, focus only on having access to an array.
     */
    public static void main(String[] args){
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }
        input.close();
        //WRITE YOUR CODE BELOW:

        for(int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i] + ", " + arr[i+1]);
        }

    }
}
