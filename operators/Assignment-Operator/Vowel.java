import java.util.Scanner; //IF ELSE
class Vowel
{
   public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number");
char alphabet= sc.next().charAt(0);



if(alphabet=='a')
{ 
  System.out.println("Input is Vowel" );
}

else if(alphabet=='e')
{
System.out.println("Input is Vowel" );
}

else if(alphabet=='i')
{
System.out.println("Input is Vowel");
}

else if(alphabet=='o')
{
System.out.println("Input is Vowel");
}
else if(alphabet=='u')
{
System.out.println("Input is Vowel");
}
else
{
System.out.println("Input is consunant");
}

}

}