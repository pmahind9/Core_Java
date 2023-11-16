/*

*/



import java.util.Scanner;

class Twonumber
{

	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter first and last number:");
	  int first=sc.nextInt();
	  int last=sc.nextInt();
	  
	for(int i=first;i<=last;i++) //or (;first<=last;first++)
		{
		
		 int c=0,j;
			for (j=2;j<i;j++)
			 {
			 if(i%j==0)
			  {
			    c++;
			    break;
			  }
			 }
			if(c==0 && i!=1)
			{
			 System.out.println(i);
			}
		 
		}
}
}