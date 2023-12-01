class Array {
public static void main(String[] args){


int a[]={1,2,3,4,5,6,7,8,9,10};

int count=0, sum=0;

for (int i=0; i< a.length; i++)
{
	if(a[i]%2==1)
	{
	 sum = sum+ a[i];
	 count++;
	}
}
	System.out.println("sum of odd num: " +sum);
}
}