//Loop

import java.util.Scanner;

class Cube
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter no");
	  int n=sc.nextInt();
	  
	int cube=1;
	int i=1;
 	  
	 
	                        
	  while(i<=n){
	    cube=i*i*i;
	    System.out.println("Cube of "+i+" is : "+cube);
	   i++;
	  
	}
System.out.println(cube);
		
		
}
}