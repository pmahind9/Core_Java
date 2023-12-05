/*
hyamde x=0 & y=1 ghetal ahe karn 


9     1     3      5      6     => x ha index 0, 2, 4, 6, 8 asha gharat yenr x+2 ahe tithe

  11     22    66     10     9  => y ha index 1, 3, 5, 7, 9  asha ghrt yenr karn y+2 ahe



*/

class Merge_of_arrays{
public static void main(String[] args){

int a[]={9,1,3,5,6,};
int b[]={11,22,66,10,19};
int c[]=new int[a.length + b.length];


	int x=0;
	for(int i=0; i<a.length; i++)
	 {
		
		c[x]=a[i];
		x=x+2;

	 }


	int y=1;
	for(int i=0; i<b.length; i++)
	{
	
		c[y]=b[i];
		y=y+2;
	}

	 for(int i=0; i<c.length; i++)
	{
		System.out.println(c[i]+ " ");
	}

}
}