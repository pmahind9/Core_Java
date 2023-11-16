/*
Q13.Wap take input first and last no and display all even numbers between them and find sum and find sum an count.
*/

import java.util.Scanner;

 class Oddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        System.out.print("Enter the last number: ");
        int last = sc.nextInt();

        int sum = 0;
        int count = 0;

        System.out.println("Odd numbers between " + first + " and " + last + ":");

        for (int num = first; num <= last; num++) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                sum += num;
                count++;
            }
        }

        System.out.println("\nSum of odd numbers: " + sum);
        System.out.println("Count of odd numbers: " + count);
    }
}
