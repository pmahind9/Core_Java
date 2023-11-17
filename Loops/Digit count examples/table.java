/*
Q7.Write a program to print the multiplication table of a given number using a for loop.
*/

import java.util.Scanner;

 class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Multiplication table for " + number + ":");
        
        int i = 1;
        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
    }
}

