import java.util.Scanner;

public class pass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	int num;
	 num= sc.nextInt();
	 
	

	String pass=(num>=60)? "Pass" : "Fail ";
		System.out.println(pass);
    }
}
