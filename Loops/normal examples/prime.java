//Prime sathi

import java.util.Scanner;

 class Dowhile {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int c=0;
	
	int j=2;
	while(j<n)
	{
	 if (n%j==0)
		{
		 c++;
		break;
		}
	    j++;

	} 
	 if(c==0)
	{
	  System.out.println("Number is prime");
	}
	else
	{
	 System.out.println("Number is not Prime");
	}
	System.out.println("count of number is:"+c);
	
    }
}
