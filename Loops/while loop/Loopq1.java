//Loop


import java.util.Scanner;
class Loop
{

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  int sum=0;
	  int num;
 	  int i=1;      
                   
	  while(i<=10)	
				   
		{
		 num=sc.nextInt();
		 System.out.print(i);  
		  sum=sum+num;
		  	i++;		   
		}
		 
		System.out.println("Sum of numbers="+sum);
	}

}