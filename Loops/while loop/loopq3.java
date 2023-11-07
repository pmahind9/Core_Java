
import java.util.Scanner;
class Loopq3
{

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	 
	  int sum=0;
	  int num;
 	  int i=1; 
	  int n=sc.nextInt();
	     
                   
	  while(i<=n)	
				   
		{
		 num=sc.nextInt();
		 System.out.print(i);  
		  sum=sum+num;
		  	i++;		   
		}
		 
		System.out.println("Sum of numbers="+sum);
	}

}