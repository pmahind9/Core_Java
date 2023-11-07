import java.util.Scanner;

public class positive {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number");
	int num;
	 num= sc.nextInt();
	 
	

	String pass=(num>=0)? ((num==0)? "Number is Zero": "Positive" )  : "Negative ";
		System.out.println(pass);
    }
}
