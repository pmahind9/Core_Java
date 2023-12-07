class Minnum{
public static void main(String[] args){
int a[]={2,4,6,8,7,9,2,4};
	int min=a[0];

	for(int i=0; i<a.length; i++)
	{
	 if(a[i]<min)
	   {
	     min=a[i];
	   }
	}
	 System.out.println("Minimum number in an array : " +min);
}
}
