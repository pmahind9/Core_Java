/*alpha pattern8

F
F E
F E D
F E D C
F E D C B
F E D C B A

*/

class Alphapattern8{
  public static void main(String[] args){
	int num=71;
	for(int i=1; i<=6; i++){
	  for (int j=1; j<=i; j++){
		 System.out.print((char)(num-j)+" " );
	   }
	    System.out.println();
	}
    }
}
