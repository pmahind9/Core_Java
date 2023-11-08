//armstrong using dowhile

import java.util.Scanner;

 class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0, rem;

        do {
            rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        } while (temp != 0);

        if (n == sum) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
