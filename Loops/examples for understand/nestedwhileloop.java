//Nested-Loop

import java.util.Scanner;

class Nestedloop
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter First & Last number");
	 
	int first=sc.nextInt();
	int last=sc.nextInt();
	 
	while(first<=last)
	{
	
		int i=1;
		while(i<=10)
		{
		System.out.println(first*i);
		i++;
		}


	first++;
	}
	

		
		
	}
}