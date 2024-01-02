		/* Two matrix Addition */ 
import java.util.Scanner;
class Two_Matrix_Addition {
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
	System.out.println("Enter second matrix element");
        int b[][] = new int[row][colm];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[row][colm];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
