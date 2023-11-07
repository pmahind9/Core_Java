

import java.util.Scanner; 
class Nestedter
{
   public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter three Number");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();

int larg=(n1>=n2)?((n1>=n3)?n1:n2):((n2>=n3)? n2:n3);
System.out.println("largest number between 3 number is:"+larg );


  
	


}

}