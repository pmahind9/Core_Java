/*
Write a java program to input  a number and check it is palindrome or not USING FOR-LOOPS
*/

import java.util.Scanner;
class Palin{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int num = sc.nextInt();

int rem;
int rev=0;


for(int temp=num;temp!=0;temp=temp/10)
	{
	 rem = temp%10;
	rev = rev*10+rem;
	}
	if (num == rev){
System.out.println("Palindrome");
}else{
System.out.println("not Palindrome");

}

}

}