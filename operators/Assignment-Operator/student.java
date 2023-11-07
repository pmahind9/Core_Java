// IF Else

import java.util.Scanner; 
class Student
{
   public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter mark");
int mark=sc.nextInt();


   if (mark>=90)
	{
	 System.out.println("A");
            
         }
	else if(mark>=80 && mark<=89)
	{
	 System.out.println("B");
	}
	else if(mark>=70 && mark<=79)
	{
	 System.out.println("C");
	}
	else if(mark>=60 && mark<=69)
	{
	 System.out.println("D");
	}
	else if (mark<60)
	    {
	 	 System.out.println("F");
	    }

}

}