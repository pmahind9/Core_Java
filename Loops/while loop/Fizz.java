//Loop

import java.util.Scanner;

class Fizz
{

	public static void main(String[] args)
	{
	 
	  
	int n=1;
	 while (n<=25){
        if(n%3==0 && n%5==0)
	{
	System.out.println("FizzBuzz");
	}

	else if(n%3==0 )
	{ System.out.println("Fizz");
	}

	else if(n%5==0 )
	{ System.out.println(" Fizz");
	}else{
		System.out.println(n);
	     }n++;
		}	
}
}