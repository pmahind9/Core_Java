/*alpha pattern6
     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F

*/

class Alphapattern6{
  public static void main(String[] args){

	int num=64;

	for(int i=1; i<=6; i++){
	 
	  for (int j=6; j>i; j--){

		System.out.print(" ");

	   }
	    for (int j=1; j<=i; j++){

			System.out.print((char)(num+j)+" " );
		}

		System.out.println();

	}

}

}
