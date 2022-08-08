package MyReplitSolutions;

import java.util.Scanner;

/*
First ask the user about the screen size
Select screen size:
For a screen size of 13.3, add $200 to the total price
For a screen size of 15.0, add 300 to the total price
For screen size of 17.3, add $400 to the total price

Then ask the user about the CPU

Select CPU type:

For a CPU of i3, add $150 to the total price
For a CPU of i5, add $250 to the total price
For a CPU of i7, add $350 to the total price

Then ask the user about the RAM size

Select RAM size:

Add $50 to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4
Then ask the user about the storage type and amount

Select storage type:

Select storage size:

For HDD, add $50 to the total price for every 500GB
For SSD, add $100 to the total price for every 500GB
Then ask the user about the screen resolution

Select screen resolution:

For FULLHD, add $100 to the total price
For 4K, add $200 to the total price
** At the end display the total price of the custom computer**

Laptop price is: $amount

 */

public class computerBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice=0;
        System.out.println("Select screen size:");
        double screenSize= scanner.nextDouble();

        if (screenSize == 13.30) {
            totalPrice += 200;
        }  if (screenSize == 15.0) {
            totalPrice += 300;
        }  if (screenSize == 17.30) {
            totalPrice += 400;
        }


        System.out.println("Select CPU type:");
            String cpu = scanner.next();
            if (cpu.equals("i3")) {
                totalPrice += 150;
            }  if (cpu.equals("i5")) {
                    totalPrice += 250;
                }  if (cpu.equals("i7")) {
                        totalPrice += 350;
                 }

            System.out.println("Select RAM size:");
            int gb= scanner.nextInt();

            if (gb%4==0){
                double result= (gb/4)*50;
                totalPrice+=result;

           return; }

            System.out.println("Select storage type:");
            String storageType= scanner.next();
        System.out.println("Select storage size:");
        int storageSize= scanner.nextInt();
            if (storageType.equalsIgnoreCase("HDD")){
                if (storageSize % 500 == 0) {
                    totalPrice+=(storageSize/500)*50;
               }
            }
            if (storageType.equalsIgnoreCase("SSD")){
            if (storageSize % 500 == 0) {
                totalPrice+=(storageSize/500)*100;
            }
        }

            System.out.println("Select screen resolution:");
            String resolution= scanner.next();
            if (resolution.equalsIgnoreCase("FULLHD")){
                totalPrice+=100;
            } if (resolution.equalsIgnoreCase("4K")) {
                totalPrice += 200;
            }

            System.out.println("Final price is: $"+totalPrice);
            scanner.close();
    }
}
