/*alpha pattern10

A
B C
D E F
G H I J
K L M N O
P Q R S T U

*/

class Alphapattern10{
  public static void main(String[] args){

	int num=65;

	for(int i=1; i<=6; i++){
	 
	  for (int j=1; j<=i; j++){

		 System.out.print((char)(num++)+" " );

	   }
	    
	    System.out.println();

	}

}

}
