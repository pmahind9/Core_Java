/*
Q14..WAP to add multiple  number, ask user to take  input as their need. 
   press 0 to terminate inputting after that calculate sum of that inputted number.
*/
import java.util.Scanner;

 class SumOfMultipleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter numbers (enter 0 to calculate sum):");

        do {
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Sum of the inputted numbers: " + sum);
    }
}
