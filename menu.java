//Menu Case

import java.util.Scanner; 
class Menu
{
   public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	System.out.println("1. Add");
	System.out.println("2.Sub");
	System.out.println("3.Mul");
	System.out.println("4.Div");

System.out.println("Enter your Choice");
int choice=sc.nextInt();
int num1,num2;

	switch(choice)
	{
	 case 1:
 	 System.out.println("Your choice is addition");
	 System.out.println("Enter number for addition");
	 num1=sc.nextInt();
	 num2=sc.nextInt();
	 int sum=num1+num2;
	 System.out.println("Sum of two number is="+sum);
	 break;
	
	case 2:
 	 System.out.println("Your choice is Substraction");
	 System.out.println("Enter number for Substraction");
	 num1=sc.nextInt();
	 num2=sc.nextInt();
	int sub=num1-num2;
	 System.out.println("sub of two number is="+sub);
	 break;
	
	case 3:
 	 System.out.println("Your choice is Multiplication");
	 System.out.println("Enter number for Multiplication");
	 num1=sc.nextInt();
	 num2=sc.nextInt();
	 int mul=num1*num2;
	 System.out.println("mul of two number is="+mul);
	 break;
	
	case 4:
 	 System.out.println("Your choice is division");
	 System.out.println("Enter number for division");
	 num1=sc.nextInt();
	 num2=sc.nextInt();
	int div=num1/num2;
	 System.out.println("div of two number is="+div);
	 break;

	 default :
	 System.out.println("your choice is wrong");
	 
}	
}
}