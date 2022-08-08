package MyReplitSolutions;

import java.util.Scanner;

public class Email {
    /*
    Use String methods to divide the given email into separate parts. The email will always be in this format:
firstName_lastName@domain.com
Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper capitalization format - The first letter of each word is uppercase and the rest are lowercase. Output in the following format:

First name: $first name
Last name: $last name
Domain: $domain
Hint: Think about how to use substring and indexOf together
     */
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        //firstName_lastName@domain.com
        String name=email.substring(0,1).toUpperCase()+email.substring(1,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("@")+2).toUpperCase()+email.substring((email.indexOf("@")+2), (email.indexOf(".")));

        System.out.println("First Name: " + name
                + "\nLast Name: " + lastName
                + "\nDomain: " + domain);
    }
}
