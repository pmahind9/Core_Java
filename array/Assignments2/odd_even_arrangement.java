import java.util.Scanner;
class Odd_even_Arrangement {
    public static void main(String[] args) {
        int a[] = {1,0,6,9,11,8,9,34,7,5,12,};
        int b[] = new int[a.length];
	int x=0;
        for (int i = 0; i < a.length ; i++) 
	{
           if(a[i]%2==0)
	   {
		b[x]=a[i];
		x++;
	
	   }
        }
 	for (int i = 0; i < a.length ; i++) 
	{
           if(a[i]%2!=0)
	   {
		b[x]=a[i];
		x++;
	
	   }
        }
	

        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
