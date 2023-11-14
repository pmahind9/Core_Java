//Fibonacchi using While Loop
/*
0   1    2     3     4
n1  n2   n3  
    n1   n2    n3
         n1    n2    n3
*/

import java.util.Scanner;

 class Fibonacchi {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	
	int n1=0,n2=1,n3;
	int term=8;

	System.out.print(n1+" "+n2);
	int j=2;

	while(j<=term)
	{
	 n3=n1+n2;
	 System.out.print(" "+n3);
	n1=n2;
	n2=n3;
	j++;
	 
	}
	
    }
}
