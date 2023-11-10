//armstrong using dowhile

import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
  
        int sum = 0;

        for (int i= n; i!= 0; i=i/10) {
            

	    int rem=i%10;
            sum = sum + (rem * rem * rem);
        }

        if (n == sum) {
            System.out.println(n + " is  Armstrong number.");
        } else {
            System.out.println(n + " is not  Armstrong number.");
        }
    }
}

