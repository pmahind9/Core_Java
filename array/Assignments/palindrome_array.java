/*
wap to find palindrome no in an array
*/

class Palindrome_Array{
public static void main(String[] args){
  
  int a[]= {15,42,61,35,79,99,11,9};

	for(int i=0; i<a.length; i++)
	{
	 int rem,rev=0;

	 for(int j=a[i]; j!=0; j/=10)
	  {
		rem = j % 10;
		rev = rev * 10 + rem;
	  }
	 if(rev==a[i])
	 {
	   System.out.println("Palidrome no. is :" + a[i]+ " ");
	 }

	}

}

}
