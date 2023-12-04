import java.util.Scanner; 
class Array{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("ENter size of array");
int n = sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array Element");
for(int i=0; i<n; i++)
{
   a[i]=sc.nextInt();
}
//Traverse array or Printing array
for (int i=0; i<n; i++)
{
	if (i==5)
 	{
	 a[i]= a[i]*25;
	}
}
	for (int i=0; i<a.length; i++){
System.out.print(a[i]+" ");
}
}
}
