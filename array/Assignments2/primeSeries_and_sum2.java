/*
Q.Write a Java program to find the sum of the prime numbers between 100 and 200, but only consider the prime numbers that have a digit sum greater than 10. Print the sum of those prime numbers.
*/

import java.util.Scanner;
class Prime_Sum {
    public static void main(String[] args) {
        int f = 100;
        int l = 200;
        int b[] = new int[100];
        int x = 0;

        for (int i = f; i <= l; i++) {
            int c = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    c++;
                    break;
                }
            }

            if (c == 0) {
                b[x] = i;
                x++;
            }
        }

        for (int i = 0; i < b.length; i++) 
	{
            int sum = 0;
          
          for(int j=b[i]; j!=0; j=j/10)   
	    {
		int rem=j%10;
		sum= sum+rem;

      	     }
            

            if (sum <= 10 && b[i]!=0) {
                System.out.print(b[i] + " ");
            }
        }
    }
}
