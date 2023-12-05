/*
wap to find Armstrong no in an array
*/

class Armstrong_Array{
public static void main(String[] args){
  
  int a[]= {15,153,61,35,121,99,370,9};

	for(int i=0; i<a.length; i++)
	{
	 int sum=0;

	 for(int j=a[i]; j!=0; j/=10)
	  {
		int rem = j % 10;
		sum = sum+(rem * rem * rem);
	  }
	 if(sum==a[i])
	 {
	   System.out.println(a[i]+ " ");
	 }

	}
}

}
