/*
Wap sort half array in accending and half in decending order
    input= int [] a={9,1,3,5,6,11,22,66,10,19}.
    output={1,3,5,6,9,10,66,22,19,11,10},
*/

class Half_Sorting{
public static void main(String[] args){
int a[]={9,1,3,5,6,11,22,66,10,19};

	for(int i=0; i<a.length/2; i++)     //index no. 0 psun a.length/2 mhnje nimmya prynt
	 {
		for(int j=i+1; j<a.length/2; j++)
		{
		if(a[i]>a[j])
		
		  {
		   int temp = a[i];
		   a[i] = a[j];
		   a[j] = temp;
		  }
		}	
	 }
	for(int i=a.length/2; i<a.length; i++)   // a.length/2 psun start TE a.length prynt 
	 {
		for(int j=i+1; j<a.length; j++)
		{
		if(a[i]<a[j])
		
		  {
		   int temp = a[i];
		   a[i] = a[j];
		   a[j] = temp;
		  }
		}	

	 }
	 for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]+ " ");
	}

}
}
