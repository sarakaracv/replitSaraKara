package MyReplitSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineArray {
    /*
    Finish the combineRs method to combine the two given String arrays into one arraylist and return the arraylist.

for example:

combineRs(["f","o","o"],[" b","a","r"])

returns [f, o, o, b, a, r]
combineRs(["1","2","3"],["4"])

returns [1, 2, 3, 4]
     */
    public static ArrayList<String> combineRs(String[] r1, String[] r2){

    ArrayList<String>list1= new ArrayList<>(Arrays.asList(r1));
    ArrayList<String>list2= new ArrayList<>(Arrays.asList(r2));
    list1.addAll(list2);

        // your code here


        return list1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combineRs(strs,strs2));

    }

}