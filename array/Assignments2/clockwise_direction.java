
import java.util.Scanner;
class ClockwiseDirection {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int n = a[a.length - 1]; 
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = n; 
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
