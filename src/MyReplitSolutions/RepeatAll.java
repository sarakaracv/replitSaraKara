package MyReplitSolutions;

import java.util.*;

public class RepeatAll {
    /*
    Create a static method that:

is called repeatAll
returns ArrayList of Booleans
takes in a single parameter - an ArrayList of Booleans
This method should modify its ArrayList parameter by repeating its ArrayList values.
     */

    //create your method below
    public static void repeatAll(String outcome) {
        ArrayList<String> list = new ArrayList<>();
       // Collection.concat(list,outcome);
        int size= list.size();
        for (int i = 0; i < size; i++) {
            list.add(list.get(i));
        }
        System.out.println();
    }
    // Do not touch below
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }
        //System.out.println(repeatAll(list));

    }

}
