import java.util.Scanner; 
 class Max_no_return_type_without_argument {
	public void maximum_element() {
		int a[] = {1,2,13,14,15,6,17,9,8,21,2,8,4};	
		int max = a [0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
	public static void main (String[] args) {
		Max_no_return_type_without_argument ob = new Max_no_return_type_without_argument();
		ob.maximum_element();
	}
}
