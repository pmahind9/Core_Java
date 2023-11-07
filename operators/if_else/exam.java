


import java.util.Scanner; 
class Exam
{
   public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter a Number of Classes Held");
int total=sc.nextInt();

System.out.println("Enter a Number of Classes Attended");
int attend=sc.nextInt();

System.out.println("Enter a Number of Classes Held :" + total);
System.out.println("Enter a Number of Classes Attended :" + attend);

double percentage=attend*100/total;


   if (percentage>=75)
	{
	 System.out.println("Student is allowed to seat in exam");        
         }
   else{
       	System.out.println("Student is not allowed to sit in exam");
       }
	


}

}