/*merging of two array. hyamde C[i]B.LENGTJ ghetal nahi karn pahila a.length che array ahet na tya 0-5 index position la jr direct ts ghetl ast tr te override zale aste mhnun apn 
"A.LENGTH+I" ghetl mhnje ki a.length array pasun pudh array put honr.

*/

class Merge_of_arrays{
public static void main(String[] args){

int a[]={9,1,3,5,6,};
int b[]={11,22,66,10,19};
int c[]=new int[a.length + b.length];

	for(int i=0; i<a.length; i++)
	 {
		c[i]=a[i];

	 }
	for(int i=0; i<b.length; i++)
	{
		c[a.length+i]=b[i];
	}

	 for(int i=0; i<c.length; i++)
	{
		System.out.println(c[i]+ " ");
	}

}
}