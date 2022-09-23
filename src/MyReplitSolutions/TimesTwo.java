package MyReplitSolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {
    /*
    Create a method that:

- is called `timesTwo`
- returns an `ArrayList` of Integers
- takes in a single parameter - an `ArrayList` of `Integers` called `nums`

This method should take the ArrayList parameter and multiply every value by two.
     */
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> num1){
        ArrayList<Integer> num2= new ArrayList<>();
        for(int i=0; i<num1.size(); i++){
            num2.add(num1.get(i)*2);

        }
        return num2;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }
}
