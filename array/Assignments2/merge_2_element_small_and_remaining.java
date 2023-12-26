/*

Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. 
 fill A with first p smallest elements and fill B with remaining elements.   
Example:
Input :
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]

*/

class Sorted {
    public static void main(String[] args) {
        int[] a = { 1, 5, 6, 7, 8, 10 };
        int[] b = { 2, 4, 9 };
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        System.out.print("Sorted Arrays A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        System.out.print("Sorted Arrays B: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(c[i + a.length] + " ");
        }
    }
}
