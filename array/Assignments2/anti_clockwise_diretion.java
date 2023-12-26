import java.util.Scanner;
class Anti_clockwiseDirection {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int x=2;
        for (int i = 0; i < x; i++) 
	{
           int n=a[a.length-1];

		for(int j=a.length-1; j>0; j--)
		{
		 a[j]=a[j-1];
		}
		   a[0] = n; 
        }

        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
