//Armstrong number
//original number + prattek num cha cube chi addition equal ali tr 
//Armstrong number asto.
/*
143=27+64+1  nhi
153=27+125+1 ahe 
*/

import java.util.Scanner;

 class Dowhile {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	
	int n = 153;
	int temp=n;
	int sum = 0,rem;  //1
	
	 while(temp!=0){

		rem=temp%10; // 3 5 1

		sum=sum+(rem*rem*rem); //27, 27+125 = sum = 152  +1=153

		temp=temp/10;

	}
	    if (n==sum)
		{
		 System.out.println("it is Armstrong");
		}
		else{
		 System.out.println("not Armstrong");
		}
    }
}
