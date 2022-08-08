package MyReplitSolutions;

import java.util.Locale;
import java.util.Scanner;

public class ShoppingList {
    /*
Create a program that will maintain a shopping list. This shopping list will have the name of the items,
the price of the items, and the quantity of items that will be purchased. The program will ask the user to enter the name,
 price, and quantity of each item and the program will then ask if they want to add another item.
 Repeat for any number of times the user wants, but when the user is done adding to
  the shopping list print a receipt for the user with a total cost of this shopping trip. Follow the steps below
Create a Scanner object
Ask the user to enter the name of the item with the message: Enter the name of item x where x is an
item number starting from 1, 2, etc
Ask the user to enter the price of the item using the message: Enter the price of the $itemName,
where itemName is the same asked in the previous step
Ask the user to enter the quantity they will buy using the message: How many $itemName will you buy?,
where itemName is the same asked in the second step
Build the total receipt of this item and add it to the final shopping list.
Also add the total cost of the item to the total cost of the shopping trip. Use this format to create each items' receipt:
  $itemName x $quantity - $totalPriceOfThisItem
  Where:
  itemName: the name of the item
  quantity: the total number of this item being bought
  totalPriceOfThisItem: the total cost of this item which is calculated as the (quantity * price)
Ask the user if they want to add more items to the list using the message, Do you want to add more items to the shopping list?
If the user says yes then repeat all of the steps above, starting from step 2
If the user says no then stop asking for items and print out the total shopping list and
 the total cost of the shopping trip in the following format:
 SHOPPING LIST:
  receipt item 1
  receipt item 2
  receipt item 3
  ... etc
  Total cost: $totalCostOfTrip

Enter the name of item 1
Enter the price of the Lemons
How many Lemons will you buy?
Do you want to add more items to the shopping list?
Enter the name of item 2
Enter the price of the Oranges
How many Oranges will you buy?
Do you want to add more items to the shopping list?
SHOPPING LIST:
Lemons x 2 - $4.6
Oranges x 3 - $15.0
Total cost: $19.6
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String addMore = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter the name of item "+count);
            item = scan.next();
            System.out.printf("Enter the price of the "+item);
            price = scan.nextDouble();
            System.out.println("\nHow many "+item+" will you buy?");
            int itemMany= scan.nextInt();
            count++;
            totalPrice += price*itemMany;

            shoppingListReport += (item+" x "+ itemMany + " - $" + totalPrice +"\n");

            System.out.println("Do you want to add more items to the shopping list?");
            addMore = scan.next();

        } while (addMore.equalsIgnoreCase("yes"));
        System.out.println("SHOPPING LIST:");
        System.out.println(shoppingListReport.substring(0, shoppingListReport.length()-1));
        System.out.println("Total cost: $" + totalPrice);





    }
}
