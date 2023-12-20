/*
Write a Java program to get the difference between the largest and smallest values in an array of integers
*/

class Diff_Max_Min{
public static void main(String[] args){
int a[]= {5,9,8,3,2,4,7};

int max=a[0];
int min=a[0];
for(int i=1; i<a.length; i++)
{
if (a[i]>max)
{
	max=a[i];
}
}
for (int i=0; i<a.length; i++)
{
if(min>a[i])
{
	min=a[i];

}
}
int diff=max-min;

System.out.println("minimum number is:"+min);

System.out.println("Maximum number is:"+max);

System.out.println("Difference is:"+diff);


}

}
