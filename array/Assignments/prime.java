/*
wap to find prime no in an array

*/

class PrimeNum{
public static void main(String[] args){

   int a[]= {17,11,15,23,19,9,25};

	for(int i=1; i<a.length; i++)
	{

	 int c=0;
	
	for(int j=2; j<a.length; j++)
	{
	 if(a[i]%j==0)
	  {
	   c++;
	   break;
     	   }
	 }
	
	 if(c==0)
	 {
	  System.out.println(a[i]);
	 }
        }
}
}