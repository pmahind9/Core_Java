			/* Matrix Secondary Daigonal*/ 

import java.util.Scanner;

class Matrix_Secondary_Diagonal {
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

        System.out.println("Print Secondary diagonal:");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((i+j)==a.length-1)
	        {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
