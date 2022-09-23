package MyReplitSolutions;

import java.util.Scanner;

public class ProfitOrLoss {
    /*
    Finish the method called profit() that will take two int arguments and returns a String saying if there is a profit, a loss, or no loss. The first argument is the buyPrice value and the second argument is the sellPrice value. There is a profit if the sell price is more than the buy price.
This is a return method with two int parameters
Main topics: methods, Scanner, primitive datatypes, operators, if statements

Example:

  profit(100,1500)

output:
  profit
Example:

  profit(20, 5)

output: loss
     */
    public static String profit(int buyPrice,int sellPrice){
        //WRITE YOUR CODE BELOW
        String result="";
        if(buyPrice<sellPrice) result="profit";
        else if (buyPrice>sellPrice) result="loss";
        else result= "no loss";

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }
}
