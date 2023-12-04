/*
Q3. WAP to replace all the 0’s with 1’s in your array. Your array is 
[12,2,0,6,4,0,9,0,8,7,3,0,4]
*/
class Array_Replace{
public static void main(String [] args){
int n[]= {12,2,0,6,4,0,9,0,8,7,3,0,4};

for(int i=0; i<n.length; i++)
{
 if(n[i]==0)
  {
   n[i]=1;
  }
}
for(int i=0; i<n.length; i++)
  {
   System.out.println(n[i]+ " ");
  }
}
}
