/*
Q1.Wap enter an array and search any particular element and find the count
*/


import java.util.Scanner;
class ArrayFInd {
public static void main(String[] args){

Scanner sc= new Scanner(System.in);


int a[]={1,12,23,64,85,96,19,28,19,10};
System.out.println("Enter your no to search");

int n= sc.nextInt();

int c=0;

for (int i=0; i< a.length; i++)
{
	if(a[i]==n)
	{
	 c++;
	}
}
	if(c>0)
	{
	 System.out.println("sum of odd num: " +c);
	}
	else
	{
	 System.out.println("element is not found!!");
	}

}
}