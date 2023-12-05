/* ALTERNATIVE REVERSE MERGE
Q3.a[]={10,20,30,40,50}
   b[]={1,2,3,4,5}
 
  output array=c[]={10,5,20,4,30,3,40,2,50,1}
*/

class Merge_of_Reverse_arrays{
public static void main(String[] args){

int a[]={10,20,30,40,50};
int b[]={1,2,3,4,5};
int c[]=new int[a.length + b.length];


	int x=0;
	for(int i=0; i<a.length; i++)
	 {
		
		c[x]=a[i];
		x=x+2;

	 }


	int y=1;
	for(int i=b.length-1; i>=0; i--)   //"-1" nhi kel tr ha error yeto:- Index 10 out of bounds for length 10
	{
	
		c[y]=b[i];
		y=y+2;
	}

	 for(int i=0; i<c.length; i++)
	{
		System.out.print(c[i]+ " ");
	}

}
}







/*
 
*/