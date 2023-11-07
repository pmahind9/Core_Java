import java.util.Scanner;

 class Loopq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int l = sc.nextInt();
        int c = 0;
        int sum = 0;

        while (f <= 1) {
            if (f % 2 != 0) {
                System.out.println(f);
                sum = sum + f;
                c++;
            }
            f++; // Increment f to avoid an infinite loop
        }

        System.out.println("Sum from 1 to n = " + sum);
    }
}
