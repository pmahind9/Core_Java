			/* Second Minimum */ 
import java.util.Scanner;
class Matrix_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Row size");
        int row = sc.nextInt();
        System.out.println("Enter your Column size");
        int colm = sc.nextInt();
        System.out.println("Enter your Matrix Element");
        int a[][] = new int[row][colm];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int min = a[0][0];
	int secmin = a[0][1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < min) 
		{
                   secmin = min;
		   min = a[i][j];
                }
		else if(a[i][j] < secmin  &&  a[i][j] != min)
		{
		   secmin = a[i][j];
		}
            }
        }
        System.out.println("Second minimum number in the array: " + secmin);
    }
}
