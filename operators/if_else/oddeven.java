import java.util.Scanner;

 class oddeven {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	int num= sc.nextInt();
	

	String even=(num/2==0)? "true" : "false";
		System.out.println(even);
    }
}
