//Loop

import java.util.Scanner;

class Loops
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter no");
	  
	int n=sc.nextInt();
	 if (n%2==1)
	{
	System.out.println("Wierd");
	}
	else if(n%2==0 && n>=2 && n<=20)
	{ System.out.println("Not Wierd");
	}
	else if(n%2==0 && n>=2 && n<=5)
	{ System.out.println(" Wierd");
	}
	else if(n%2==0 && n>=20)
	{ System.out.println("Not Wierd");
	}		
}
}