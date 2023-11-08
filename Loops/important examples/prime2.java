//prime number in Do-While Loops

import java.util.Scanner;

class Dowhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int c;

        do {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            c = 0;

            if (n == -1) {
                break; 
            }

            int j = 2;
            while (j < n) {
                if (n % j == 0) {
                    c++;
                    break;
                }
                j++;
            }

            if (c == 0) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not Prime");
            }
            System.out.println("count of number is:" + c);

        } while (true);

        System.out.println("Exiting the program.");
    }
}
