//alpha pattern4

class Alphapatterna{
  public static void main(String[] args){
	int num=64;
	for(int i=6; i>1; i--){
	  for (int j=1; j<=i; j++){
		System.out.print((char)(num+j) + " ");
	   }
		System.out.println();
	}

		for(int i=1; i<=6; i++){
	 
	  for (int j=1; j<=i; j++){

		System.out.print((char)(num+j) + " ");
	   }
		System.out.println();
	}

  }
}

 
