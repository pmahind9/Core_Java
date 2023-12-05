class Secmax{
public static void main(String[] args){

int a[]={2,4,6,8,7,9,2,4};
	int max = a[0];
	int secmax = a[1];

	for(int i=0; i<a.length; i++)
	{
	 if(a[i]>max)
	   {
	     secmax=max;
	     max=a[i];
	   }
	   else if(a[i]>secmax)
	   {
	    secmax= a[i];
	   }
	}
	 System.out.println("maximum number in an array : " +max);
	 System.out.println("second max number in an array : " +secmax);
}


}