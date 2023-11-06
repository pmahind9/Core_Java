

import java.util.Scanner; 
class Age
{
   public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int num=sc.nextInt();


   if (num>=60)
	{
	 System.out.println("Senior Citizen");
            
         }
	else if(num>=20 && num<=59)
	{
	 System.out.println("Adult");
	}
	else if(num>=13 && num<=19)
	{
	 System.out.println("Teenager");
	}
	else if(num>=0 && num<=12)
	{
	 System.out.println("Child");
	}
	


}

}