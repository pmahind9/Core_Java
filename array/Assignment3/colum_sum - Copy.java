			/* COLUMN SUM */


import java.util.Scanner;

class ColumnSum {
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

        for (int j = 0; j < colm; j++) {
            int sum = 0;

            for (int i = 0; i < row; i++) {
                sum = sum + a[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + ": " + sum);
        }
    }
}
