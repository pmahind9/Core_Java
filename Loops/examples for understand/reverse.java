/*
wap to add 2 on each digit in n digit number  //ha question chuklay mala ala nhi solve kryla
*/
import java.util.Scanner;
class Rev{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

System.out.print("Enter Number");
int n = sc.nextInt();
int rev =0;

for (int i=n; i!=0; i=i/10){
	int rem=i%10;
	rev=rev*10+(rem+2);	
}

for (int i=n; i!=0; i=i/10){
	int rem=i%10;
	rev=rev*10+(rem+2);
}
System.out.println(rev);

}
}	