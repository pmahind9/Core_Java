/*
Write a Java program to remove odd numbers from an array.
Example1:-
Array = {11, 12, 13, 14, 15}
Array after removing odd numbers:- {12, 14}
*/

class Remove_Array
{
 public static void main(String[] args)
 {

   int a[]={11, 12, 13, 14, 15};

 
  for(int i=0;i<a.length;i++)
  {
   if(a[i]%2==0)
   {
     System.out.print(a[i]+" ");
   }
  }
 
 }
}
