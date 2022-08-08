package MyReplitSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShortestWords {
    /*
    Given a String str, find and print the shortest words.
    The String will have multiple words separated by commas and spaces.
    If there is words that have the same length, they should all be displayed at the end.
     Print all the shortest words in the following format:
Input: word1, word2, word3, word4, etc...

Output: [short1, short2, short3, etc...]

Hint: Think about what comes between each word in the sentence
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //WRITE YOUR CODE BELOW

        // girildigi gibiymis ben sorted dedim

        String[] words = str.split(", ");
        Arrays.sort(words);
        String shortest = words[0];
        String count = "";

        for (int i = 0; i < words.length ; i++) {
            if(shortest.length() <= words[i].length() && words[i].length() == shortest.length()){
                shortest = words[i];
                count += shortest+", ";
            }
        }
        if(count.length() > 0){
            count = count.replaceAll(", $", "");
List<String> list=new ArrayList<>(Arrays.asList(count));
list.stream().sorted();
;
            System.out.print("["+list+"]");
        }
    }
}

