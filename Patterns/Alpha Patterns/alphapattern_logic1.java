//alpha pattern1.... logic 1
class Alphapattern1{
  public static void main(String[] args){
	int num=64;
	for(int i=1; i<=5; i++){
	  for (int j=1; j<=i; j++){
		System.out.print((char)(num+i));
	   }
		System.out.println();
	}
  }
}
