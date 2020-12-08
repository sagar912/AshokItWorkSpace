package ArrayPrograms;

import java.util.Arrays;

public class SumOfUniqueElementsInArray {
    
	public static void main(String[] args) {
		
		int[] a = { 1, 6, 4, 3, 2, 2, 3, 8, 1};
    
		    Arrays.sort(a); 
	        int sum = a[0]; 
	        for (int i = 0; i < a.length-1; i++) { 
	            if (a[i] != a[i + 1]) { 
	                sum = sum + a[i+1]; 
	            } 
	        } 
	        System.out.println("Sum of Uniques Elements are ===>"+ sum);
	}


}
