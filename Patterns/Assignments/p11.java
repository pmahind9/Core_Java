/*alpha pattern11

A
B A
C B A
D C B A
E D C B A
F E D C B A

*/

class Alphapattern11{
  public static void main(String[] args){

	int num=64;

	for(int i=1; i<=6; i++){
	 
	  for (int j=i; j>=1; j--){

		 System.out.print((char)(num+j)+" " );

	   }
	    
	    System.out.println();

	}

}

}
