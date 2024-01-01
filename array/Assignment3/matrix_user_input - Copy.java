
import java.util.Scanner;
class Matrix_user_input{
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter your Row size");
	int row=sc.nextInt();

	System.out.println("Enter your COlumn size");
	int colm=sc.nextInt();

	System.out.println("Enter your Matrix Element");
	int a[][] = new int [row][colm];
	


	for (int i=0; i < row ; i++)
	{
	 for(int j=0; j < colm; j++)
	  {
	   a[i][j] = sc.nextInt();
	  }
	 }
	 System.out.println("Enter Your Second matrix element");

	int b[][] = new int[row][colm];

	for (int i=0; i<a.length; i++)
	{
	 for (int j=0; j<a[i].length; j++)
	  {
	   b[i][j] = sc.nextInt();
	  }
	}
	
	for(int i=0; i<a.length; i++)
	{
	 for(int j=0; j<a[i].length; j++)
	  {
	   System.out.print(b[i][j] + " " );
	  }
	  System.out.println();
	}

}
}
