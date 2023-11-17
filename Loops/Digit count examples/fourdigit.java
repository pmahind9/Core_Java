/*
Q8.Write a program to input a 4-digit number and calculate the sum of its digits.
*/
import java.util.Scanner;

class Four{
public static void main(String[] args){

	
	System.out.println("Enter Number");
	Scanner sc=new Scanner(System.in);

	int num=sc.nextInt();
	int sum=0;
	for(int i=num;i!=0;i=i/10)
	{
	 int rem=i/10;
	 sum=sum+rem;
	}
	  System.out.println(sum);
}

}
