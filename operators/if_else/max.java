import java.util.Scanner;

public class max {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	int num1,num2;
	 num1= sc.nextInt();
	 num2= sc.nextInt();
	

	String max=(num1>num2)? "1st num is greater than 2nd " : " 2nd num is greater than 1nd ";
		System.out.println(max);
    }
}
