//BUBBLE SORTING
class SortingAssending{
public static void main(String[] args){

int a[]={2,1,6,3,4,9,5,7,8};

	for(int i=0; i<a.length; i++)
	 {
		for(int j=i+1; j<a.length; j++)
		{
		if(a[i]>a[j])
		
		  {
		   int temp=a[i];
		   a[i]=a[j];
		   a[j]=temp;
		  }
		}	

	 }
	 for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]+ " ");
	}

}
}
