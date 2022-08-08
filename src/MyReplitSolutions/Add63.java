package MyReplitSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Add63 {
    /*
    We will be manipulating elements of an ArrayList by using List methods.

The first List method we will learn is .add()

The following code will take an ArrayList of Strings called strs and add "Hello" to it.

strs.add("Hello");
The syntax is:

arraylistvariable.add(data_to_add);
Add three names (any names) to the ArrayList called names.
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Hello","Hello", "Hello"));

        ArrayList<String> strs = names;
        strs.add("Hello");
        strs.add("Hello");
        strs.add("Hello");

        // Your code here




        // Do not touch below
        System.out.println(names.size());
    }
}
