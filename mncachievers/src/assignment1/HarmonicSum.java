/** 
* Compute the sum of harmonics series from left
to-left. 
*/
package assignment1;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define variables
		final int MAX_DENOMINATOR = 50000; // Use a more meaningful name instead of n
	
		 double sumL2R = 0.0;  // Sum from left-to-right
		 double sumR2L = 0.0;  // Sum from Right-to-left
		 double absDiff;     // Absolute difference between the two sums
		 
		 for (int denominator = 1; denominator <= MAX_DENOMINATOR ; ++denominator  ) {
			 if (denominator<= 50000) { 
				  sumL2R += denominator; 
				 }
		 System.out.println("The sum from left-to-right is:"  + sumL2R);
	
		 

		 
		
		 for (int denominator1 = MAX_DENOMINATOR ;denominator1 >= 1; --denominator1  ) {
			 if (denominator1 >= 1) { 
				  sumR2L += denominator1; 
			 }	  
		 System.out.println("The sum from right-to-left is:"  + sumR2L);
 	 	 		
		 if (sumL2R > sumR2L) 
		 System.out.println(0);
		 else 
			 System.out.println(1);
		 }
		 }
	}
}
		

	

	
