//Loop

import java.util.Scanner;

class Table
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Sum of");
	  
 	  
	    int f=sc.nextInt(); 
	    int l=sc.nextInt(); 
	    int sum=0;
	    int count=0;
	                        
	  while(f<=l){
	     if (f%2==0)			   
		{
		 System.out.println(f);  
		  sum+=f;
		  count++; 			   
		}
		 f++;

	}
		System.out.println("sum is:" +sum);
		System.out.println("count is:" +count);
}
}