import java.util.Scanner;
class Prime_Sum {
    public static void main(String[] args) {
        int f = 100;
        int l = 200;
        int b[] = new int[100];
        int x = 0;
        for (int i = f; i <= l; i++) {
            int c = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                b[x] = i;
                x++;
            }
        }

        for (int i = 0; i < x; i++) {
            int sum = 0;
            int temp = b[i];

            while (temp != 0) {
                int rem = temp % 10;
                sum = sum + rem;
                temp = temp / 10;
            }

            if (sum <= 5) {
                System.out.print(b[i] + " ");
            }
        }
    }
}
