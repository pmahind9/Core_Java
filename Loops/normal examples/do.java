//Factorial sathi

import java.util.Scanner;

 class Dowhile {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int fact=1;
	int i=1;
	
	do
	  {
	    fact=fact*i;
		System.out.println(fact+ " * " + i + " = " +fact);

		i++; //he kel nsl tr infinite loop hoto

	   } while(i<=n);
	     System.out.println("Factorial of all Number"+n+""+fact);
    }
}
