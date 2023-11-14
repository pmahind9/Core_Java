/* 
wap to input n digit no. and find the sum and count of even number from n-digit number.
*/




import java.util.Scanner;
 class Dowhile {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	
	int n = sc.nextInt();
	if (n<=0)
	{
	 System.out.println("Enter number");
	}
	int sum=0;
	int c=0;
	
	while(n>0)
	{
	 int dig=n%10;
	 sum +=dig;
	 if (dig % 2==0)
	{
	 c++;	
	}
	 n/=10;
	}
	 System.out.println("sum of digits:"+sum);
	 System.out.println("count of even digits:"+c);
    }
}
