class Star7{
public static void main(String args[]){

int col=9;	
	for(int i=1; i<=9; i++){
		
	for (int j=i; j<col; j++){

		System.out.print(" ");

	}
	for (int k=1; k<=i; k++){

	System.out.print("* ");
	}
	  System.out.println();
	
	}


	for(int i=col; i>=1; i--){
		
	for (int j=i; j<col; j++){

		System.out.print(" ");

	}
	for (int k=1; k<=i; k++){

	System.out.print("* ");
	}
	  System.out.println();
	
	}

}
}
