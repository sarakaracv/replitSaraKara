package MyReplitSolutions;

import java.util.Scanner;

public class MethodOverloading1 {
    /*
    In this task, you need to write 2 overloaded methods findMax()
    that will find a maximum number in the array. First version should work with array of integers (int[])
     and return int, and second method should work with an array of doubles (double[]) and return double as a result.

Methods must have the same name and different parameters.
     */
    // Write your code here
    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int each : arr) {
            max = Math.max(each, max);
        }
        return max;
    }

    private static double findMax(double[] arr) {
        double max = Double.MIN_VALUE;
        for (double each : arr) {
            max = Math.max(each, max);
        }
        return max;

    }











// DO NOT TOUCH THE MAIN METHOD

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if(runInt) {
            int [] arr = new int[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else {
            double [] arr = new double[size];
            for(int i=0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            System.out.println(findMax(arr));
        }

    }
}
