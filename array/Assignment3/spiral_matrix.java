

import java.util.Iterator;

 class spiral_matrix {

	public static void main(String[] args) {
		int row = 3;
		int colm = 3;
		int a[][] = {
					{1,2,3},
				    {5,6,7},
				    { 9,10,11}
			   	};
		
		int top = 0;
		int bottom = colm-1;
		int left = 0;
		int right = row-1;

		
		
		while (left <= right && top <= bottom)
		{
			for (int i = left; i <= right; i++) {
				System.out.print(a[top][i]+ " ");
	    	}
			
			top++;
			for (int i = top; i <= bottom; i++) {
				System.out.print(a[i][right]+ " ");
			}
			
			right--;
			if (top <= right) {
				for (int i = right; i >= left; i--) {
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
				
		    if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(a[i][left]+ " ");
				}
				left++;
			}
			}
		}
	}

}
