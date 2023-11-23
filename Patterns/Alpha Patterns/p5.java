//alpha pattern5

class Alphapattern5{
  public static void main(String[] args){
	int num=64;
	for(int i=6; i>1; i--){
	  for (int j=i; j>=1; j--){
		System.out.print((char)(num+j) + " ");
	   }
		System.out.println();
	}
		for(int i=1; i<=6; i++){
	 
	  for (int j=i; j>=1; j--){

		System.out.print((char)(num+j) + " ");

	   }

		System.out.println();

	}

  }
}

 
