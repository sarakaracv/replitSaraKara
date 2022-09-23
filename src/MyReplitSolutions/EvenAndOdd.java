package MyReplitSolutions;

public class EvenAndOdd {
    /*
    Use a loop to print all the even numbers from 1 to 20. Print each number on the same line, with spaces between each
Use another loop to print all the odd numbers from 1 to 20. Print each number on the same line, with spaces between each
Note: In the end there will be two lines. First the line to show all the even numbers and then another line to show all the odd numbers
Main topics: loops, primitive datatypes, if statement, operators

Example Flow:

2 4 6 .... 18 20
1 3 5 .... 17 19
     */
    public static void main(String[] args) {

        for(int i=2; i<20; i+=2){
            System.out.print(i+" ");
        }System.out.print(20);
        System.out.println();
        for(int i=1; i<18; i+=2){
            System.out.print(i+" ");
        }System.out.print(19);


//     for(int i=1;i<=20; i+=2){
//       i=((i%2==1))? i+1:i;
//       System.out.print(i+" ");
//     }
// System.out.println();

    }
}
