/*
Q16.wap to find factorial of given no
*/

import java.util.Scanner;

class Factorial
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter no:");
	  int n=sc.nextInt();
	  
	int fact=1;
	 	  
	for(int i=1; i<=n; i++) {
	 fact*=i;
	}	
System.out.println("Factorial is :" +fact);	
}
}
