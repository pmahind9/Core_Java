import java.util.Scanner; //IF ELSE
class Q4
{
   public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
int num;
num=sc.nextInt();



if(num>=1000 )
{ 
  System.out.println("10% Discount");
}

else if(num>=500 && num<=999)
{ 
  System.out.println("5% Discount");
}
else if(num<500)
{ 
  System.out.println("No discount");
}




}

}