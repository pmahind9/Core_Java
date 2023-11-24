/*alpha pattern7

F E D C B A
F E D C B
F E D C
F E D
F E
F

*/


class Alphapattern7{
  public static void main(String[] args){

	int num=71;

	for(int i=6; i>=1; i--){
	 
	  for (int j=1; j<=i; j++){

		 System.out.print((char)(num-j)+" " );

	   }
	    
	    System.out.println();

	}

}

}