package MyReplitSolutions;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
    /*
        mergR merges two arrays into one. It gets two int arrays and returns an int array
     */
    public static int[] mergR(int[] a,int[] b) {
int[] array=Arrays.copyOf(a,a.length+b.length);
System.arraycopy(b,0,array,a.length,b.length);
        return array;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums, nums2)));
    }
}
