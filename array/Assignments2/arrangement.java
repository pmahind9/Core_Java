import java.util.Scanner;
class Arrangement{
    public static void main(String[] args) {
        int a[] = {1,0,1,0,0,1,-3,1,0,-4,1,0,-2,0};

        int b[] = new int[a.length];
	int x=0;
        for (int i = 0; i < a.length ; i++) 
	{
           if(a[i]==0)
	   {
		b[x]=a[i];
		x++;
	
	   }
        }
 	for (int i = 0; i < a.length ; i++) 
	{
           if(a[i]<0)
	   {
		b[x]=a[i];
		x++;
	
	   }
        }
	for (int i = 0; i < a.length ; i++) 
	{
           if(a[i]==1)
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
