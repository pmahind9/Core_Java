import java.util.Scanner;

 class oddeven {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
	int num1= sc.nextInt();
	int num2= sc.nextInt();

	int largest=(num1>=num2)? num1:num2;
		System.out.println("biggest number in between this is :"+largest);
    }
}
