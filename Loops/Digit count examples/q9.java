/*
Q9.Write a program to input a 5-digit number and find the largest digit in it.
*/
import java.util.Scanner;

class Five{
public static void main(String[] args){

	Scanner ref=new Scanner(System.in);
	System.out.println("Enter Number");
	

	int n=ref.nextInt();
	int temp=n;
	int l=0;
	

	while(temp!=0)
	{
	int rem=temp%10;
	if(rem>l)
	{
	l=rem;
	}
	temp=temp/10;
	}
	System.out.println("max no.in 5 digit is no. is " +l);

}}
