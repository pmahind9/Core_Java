class Secmin{
public static void main(String[] args){
int a[]={5,4,6,8,7,9,3,4};
	int min = a[0];
	int secmin = a[1];

	for(int i=0; i<a.length; i++)
	{
	 if(a[i]<min)
	   {
	     secmin=min;
	     min=a[i];
	   }
	   else if(a[i]<secmin)
	   {
	    secmin= a[i];
	   }
	}
	 System.out.println("Minimum number in an array : " +min);
	 System.out.println("second min number in an array : " +secmin);
}


}
