/*
wap to take n digit number from user and if the digit is even then add 1 or digit is odd then add 2 in digit
input 
int n=12345

output

33557
*/

import java.util.Scanner;

class ModifyNumberWithForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an n-digit number: ");
        int n = sc.nextInt();
        int result = 0;
        int power = 1;

        for (; n > 0; n /= 10, power *= 10) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                digit += 1; // Add 1 to even digits
            } else {
                digit += 2; // Add 2 to odd digits
            }

            result += digit * power;
        }

        System.out.println("Modified number: " + result);
    }
}
