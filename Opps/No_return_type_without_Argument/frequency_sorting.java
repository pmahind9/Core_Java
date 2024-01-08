	/*No return type without argument*/


import java.util.Arrays;
import java.util.Scanner;
 class frequency_sorting {
	Scanner sc = new Scanner(System.in);
	
	int a[];
	
	public void input()
	{
		System.out.println("Enter your size");
		int n = sc.nextInt();
		
		a = new int[n];
		
		System.out.println("Enter your element");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public void frequency() 
	{
		int lock = -1;
		for (int i = 0; i < a.length; i++) {
			int c=1;
			
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					c++;
					a[j] = lock;
				}
			}
			if (a[i]!=lock) {
				System.out.println(a[i]+ "count is " + c);
				
			}
		}
		
	}
	
	public void sort () {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	

	public static void main(String[] args) {
		frequency_sorting ob = new frequency_sorting();
		ob.input();
		ob.sort();
		ob.frequency();

	}

}
