//Nested-Loop

import java.util.Scanner;

class Ndigit
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter The Number");
	 
	int num=sc.nextInt();
	int rem;
	int max1=0;
	int max2=0;
	 
	while(num>0)
	{
		rem=num%10;
		if(rem>max1)
		{
		max2=max1;
		max1=rem;

		}
		else if (rem>max2 && rem<max1){
		max2=rem;
		}
		 num=num/10;
	}
	System.out.println("second max no. is :" +max2);

		
		
	}
}