import java.util.Scanner;

class RowSum {
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

        for (int i = 0; i < row; i++) {
            int sum = 0;

            for (int j = 0; j < colm; j++) {
                sum = sum + a[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }
}
