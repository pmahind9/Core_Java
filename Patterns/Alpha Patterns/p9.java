/*alpha pattern9

A B C D E F
A B C D E
A B C D
A B C
A B
A

*/


class Alphapattern9{
  public static void main(String[] args){

	int num=64;

	for(int i=6; i>=1; i--){
	 
	  for (int j=1; j<=i; j++){

		 System.out.print((char)(num+j)+" " );
	   }
	    System.out.println();
	}
    }

}
