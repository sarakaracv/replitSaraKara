package MyReplitSolutions;

import java.util.Scanner;

public class ShoppingList2 {

        public static void main(String[] args) {

                    //WRITE YOUR CODE HERE:

                Scanner input = new Scanner(System.in);
                System.out.println("Enter the name of item 1");
                String item = input.next();
                System.out.println("Enter the price of the " + item);
                double price = input.nextDouble();
                System.out.println("How many " + item + " will you buy?");
                int quantity = input.nextInt();
                double totalPrice = price * quantity;
                String shopingList = item + " x " + quantity + " - $" + quantity * price;
                System.out.println("Do you want to add more items to the shopping list?");
                String yesOrNo = input.next();
                int itemNumber = 1;
                while (!(yesOrNo.equals("yes") || yesOrNo.equals("no"))) {
                    System.out.println("Invalid entery, please re-enter. \nDo you want to add more items to the shopping list? ");
                    yesOrNo = input.next();
                }
                while (yesOrNo.equals("yes")) {
                    itemNumber++;
                    System.out.println("Enter the name of item " + itemNumber);
                    item = input.next();
                    System.out.println("Enter the price of the " + item);
                    price = input.nextDouble();
                    System.out.println("How many " + item + " will you buy?");
                    quantity = input.nextInt();
                    totalPrice += price * quantity;
                    shopingList += "\n" + item + " x " + quantity + " - $" + quantity * price;
                    System.out.println("Do you want to add more items to the shopping list?");
                    yesOrNo = input.next();

                    if (yesOrNo.equals("no")) {
                        return;

                    }
                }
            }}


