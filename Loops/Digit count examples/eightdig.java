/*
Q11.Write a program to input an 8-digit number and find the product of odd  digits.
*/

import java.util.Scanner;

class Eightdigit{
public static void main(String[] args){

	Scanner ref=new Scanner(System.in);
	System.out.println("Enter n 8-n-digit");
	int num=ref.nextInt();
	int i=num,pro=1;

	while(i!=0)
		{
		 int rem=i%10;
		 if(rem%2==1)
		  {
			System.out.println(rem);
			pro=pro*rem;
		  }
		   i=i/10;
		}
	  System.out.println("Odd number:"+pro);
}

}
