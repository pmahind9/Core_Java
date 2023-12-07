class Maxnum{
public static void main(String[] args){

int a[]={2,4,6,8,7,9,2,4};
	int max=a[0];
	for(int i=0; i<a.length; i++)
	{
	 if(a[i]>max)
	   {
	     max=a[i];
	   }
	}
	 System.out.println("maximum number in an array : " +max);
}
}
