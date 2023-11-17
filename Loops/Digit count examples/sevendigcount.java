/*
Q10.Write a program to input a 7-digit number and count the number of even digits in it.
*/

import java.util.Scanner;
class Sevendigit{
public static void main(String[] args){

	Scanner ref=new Scanner(System.in);
	System.out.println("Enter 7-n-digit");
	int num=ref.nextInt();
	int i=num,pro=1;
	int c=0;
	while(i!=0)
		{
		 int rem=i%10;
		 if(rem%2==1)
		  {
			System.out.println("even number:"+rem);
			c++;
		  }
		   i=i/10;
		}
	  System.out.println("count of even digit:"+c);
}

}
