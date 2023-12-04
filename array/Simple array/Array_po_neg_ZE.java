/*
Q3. WAP to replace all the 0’s with 1’s in your array. Your array is 
[12,2,0,6,4,0,9,0,8,7,3,0,4]
*/

import java.util.Scanner;
class Array_Replace{
public static void main(String [] args){

int a[]= {12,-20,0,6,4,10,-9,0,-8,17,3,0,4};

int c1=0;
int c2=0;
int c3=0;
for(int i=0; i<a.length; i++)
{
	if(a[i]>0)	
	{
	 c1++;
	}
	else if(a[i]<0)
	{
	 c2++;
	}
	else if(a[i]==0)
	{
	 c3++;
	}
}
System.out.println("Positive number count is : "+c1);
System.out.println("Negative number count is : "+c2);
System.out.println("Zero number count is : "+c3);

}
}
