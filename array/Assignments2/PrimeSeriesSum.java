/*
2. Write a Java program to generate the prime numbers between 50 and 80, but only consider the prime numbers that end with a digit greater than 5. Print the list of those prime numbers."
*/
class PrimeSeriesSum3{
public static void main(String[] args){
	int f=50;
	int l=80;
	int b[]=new int[50];
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
	 if(b[i]%10>5)
	 {
	   System.out.print(b[i]+ " " );
	 }
	}

}
}
