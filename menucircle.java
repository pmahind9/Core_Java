//Menu Case

import java.util.Scanner; 
class Menu
{
   public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	System.out.println("1. Area of Circle");
	System.out.println("2.Area of Reactangle");
	System.out.println("3.Area of Square");
	System.out.println("4.Area of Triangle");

System.out.println("Enter your Choice");
int choice=sc.nextInt();
int num1,num2;

	switch(choice)
	{
	 case 1:
 	 System.out.println("Your choice is Circle");
	 System.out.println("Enter number for measurements");
	 num1=sc.nextInt();
	 num2=sc.nextInt();
	 num1=3;
	 num2=num2*num2;
	 int sum=num1+num2;
	 System.out.println("Sum of two number is="+sum);
	 break;
	
	case 2:
 	 System.out.println("Your choice is Rectangle");
	 System.out.println("Enter number for Area");
	 int wd=sc.nextInt();
	 int ht=sc.nextInt();
	int rec=wd*ht;
	 System.out.println("area of rectangle is="+rec);
	 break;
	
	case 3:
 	 System.out.println("Your choice is Square");
	 System.out.println("Enter number for Side");
	 num1=sc.nextInt();
	 num2=sc.nextInt();
	 int mul=num1*num2;
	 System.out.println("Area of Square is="+mul);
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