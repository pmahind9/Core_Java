class Duplicate_array{
public static void main(String[] args){
int a[]={1,3,2,4,5,1,3,5,6};

	for(int i=0; i<a.length; i++)
 	{
	 int c=0;
	  for(int j=i+1; j<a.length; j++)
	   {
		if(a[i]==a[j])
		{
 		 c++;
		}
	   }
		if(c!=0)
		{
		 System.out.println(a[i]+ " ");
		}
	} 
}


}
