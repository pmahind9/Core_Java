 class Numberpatter6 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println(); // Move to the next line
        }
    }
}
