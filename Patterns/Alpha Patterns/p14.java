/*alpha pattern14

A
A
B A
C B A
D C B A
E D C B A

*/

class Alphapattern14{
  public static void main(String[] args){
	int num=64;
	for(int i=1; i<=6; i++){
	  for (int j=i; j<=1; j++){
		 System.out.print((char)(num+j)+" " );
	   }
		for(int j=i-1; j>=1; j--){
			System.out.print((char)(num+j)+" " );
		}
	    System.out.println();
	}
    }
}
