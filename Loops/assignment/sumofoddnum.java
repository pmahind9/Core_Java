import java.util.Scanner;
 class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Check if i is an odd number
                sum += i;
            }
        }

        System.out.println("The sum of odd numbers between 1 and " + n + " is: " + sum);
    }
}
