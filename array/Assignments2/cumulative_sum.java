/*
Write a Java program to find the cumulative sum of an array. 
Example1:-
Array = {9, 8, 7, 0, -2, 5}
Cumulative sum = [9, 17, 24, 24, 22, 27]

The cumulative sum is calculated as:- sum = sum + array[i]
Assume array = {9, 8, 7, 0, -2, 5}
sum = 0;
sum = 0 + 9 = 9
sum = 9 +8 = 17
sum = 17 +7 = 24
sum = 24 + 0 = 24
sum = 24 – 2 = 22
sum = 22 + 5 = 27
*/

class CumulativeSum {
    public static void main(String[] args) {
        int[] a = {9, 8, 7, 0, -2, 5};
        
        int sum = 0;

            for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];
            
            System.out.print(sum + " ");
}
}
}
