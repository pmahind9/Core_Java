import java.util.Scanner;

 class leap {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	int num;
	 num= sc.nextInt();
	 
	

	String pass=((num%4)==0)? "Its Leap Year" : "Its Not a Leap Year ";
		System.out.println(pass);
    }
}
