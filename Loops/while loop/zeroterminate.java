import java.util.Scanner;

 class Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //hyamule user kdun I/p milato
	
        int sum=0;
	int num=1;

        while (num!=0) {
	   System.out.println("Sum from Number");
            num = sc.nextInt();
	    if(num==0)
		{
		 break;
		} else
		{
		 sum=sum+num;
        }
}
        System.out.println("Sum from Numbers = " + sum);
    }
}
