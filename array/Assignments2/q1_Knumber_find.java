/*
Q1.Given an array of N integers. Find the first element that occurs at least K number of times.
 
Example 1:
Input :
N = 7, K = 2
A[] = {1, 7, 4, 3, 4, 8, 7}
Output :
7
*/

class Find{
public static void main(String[] args){

	int a[] =  {1, 7, 4, 3, 4, 8, 7};
	int x = 7;
	int k = 2;
	int c = 0;

	for(int i=0; i<a.length; i++)
	{
		if(a[i]==x)
		{
		 c++;
		}
		
		if(c==k)
		{
		 System.out.print(a[i]+ " ");
		}
	}

}
}