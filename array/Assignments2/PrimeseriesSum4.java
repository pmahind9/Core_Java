/*
3. Write a Java program to generate the prime numbers between 500 and 600, but only consider the prime numbers where the sum of their digits is a multiple of 5. Print the list of those prime numbers.
*/
class PrimeSeriesSum4{
public static void main(String[] args){
	int f=500;
	int l=600;

	int b[]=new int[100];
	int x=0;

	for(int i=f; i<l; i++)
	{
		int c=0;
		for(int j=2; j<i; j++)
		{
		   if(i%j==0)
		   {
		     c++;
		     break;
   		    }
		}
		
		if(c==0)
		{
  		 b[x]=i;
		  x++;
		}
	}
	for(int i=0; i<b.length; i++)
	{

	int rem;
	int sum=0;	
	
	  for(int j=b[i]; j!=0; j=j/10){
		rem=j%10;
		sum=sum+rem;
	}
	
	 if(sum%5==0 && b[i]!=0)
	 {
	   System.out.print(b[i]+ " " );
	 }
	}

}
}
