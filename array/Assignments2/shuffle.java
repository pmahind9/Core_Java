import java.util.Random;
class Shuffle{
public static void main(String[] args){
	Random rc=new Random();
	int a[]= {1,2,3,4,5,6};
	for(int i=0; i<a.length; i++)
	{
	 int j= rc.nextInt(a.length);
	int temp= a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	for (int i=1; i<a.length; i++)
	{
	  System.out.print(a[i]+ " " );
	}
    }
}
