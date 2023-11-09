//Swap

import java.util.Scanner;

 class Swap {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	int a= 10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);

	
    }
}
