package MyReplitSolutions;

import java.util.Scanner;

public class Lame {
    /*
    A database (DB) is an organized collection of data. In other words, a database is used by an organization as a method of storing, managing and retrieving information.

Implement the lameDb() method

This method has 4 String parameters and returns a String

db: information in database. Each item is separated by a #. Each element will also have a number in the beginning about which element it is.
op: action that will be taken on database (add, edit, or remove)
id: The id number that will be manipulated
data: extra data that will be used alongside operation
The method returns the modifed database

Examples:

m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")

returns:  1etsy#2wooden#3spoon#4aaa
m.lameDb("1etsy#2wooden#3spoon","add","1","bbb")

returns:  1bbb#2etsy#3wooden#4spoon
m.lameDb("1test#2bla#3foo","edit","2","bbb")

returns:  1test#2bbb#3foo
m.lameDb("1tst#2bla#3foo","delete","1","")

returns:  2bla#3foo
Hint: use arrays
     */

    public static String lameDb(String db, String op, String id, String data) {
        String[] arr = db.split("#");
        String result = "";
        int index = Integer.parseInt(id) - 1;
        switch (op) {
            case "add":
                String[] s1 = new String[arr.length + 1];
                s1[index] = data;
                for (int i = 0; i < index; i++) {
                    s1[i] = arr[i].substring(1);
                }
                for (int i = index + 1; i < s1.length; i++) {
                    s1[i] = arr[i - 1].substring(1);
                }
                int k = 1;
                for (String s : s1) {
                    result += k + s + "#";
                    k++;
                }
                break;
            case "edit":
                arr[index] = arr[index].replace(arr[index].substring(1), data);
                for (String s : arr) {
                    result += s + "#";
                }
                break;
            case "delete":
                arr[index] = null;
                for (String s : arr) {
                    if (s != null) result += s + "#";
                }
                break;
        }
        return result.substring(0, result.length() - 1);


    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

}
