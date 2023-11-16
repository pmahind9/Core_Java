import java.util.Scanner;

 class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            // Add even numbers to the sum
            sum += i;
        }

        System.out.println("The sum of even numbers between 1 and " + n + " is: " + sum);
    }
}
