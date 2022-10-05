package assignment1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3; // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
		
		int fn1 ;   // F(n) to be computed
		int fnMinus1 = 1;   // F(n-1), init to F(2)
		int fnMinus2 = 1;    // F(n-2), init to F(1)
		int nMax = 20;     // maximum n, inclusive
	//	int fn = fnMinus1 + fnMinus2 ;   // Need sum to compute average
		double average;
		//int sum = 1;
		
		
		System.out.println("The first " + nMax + " Fibonacci numbers are:");
					
		
	
		while(n <= nMax) {   // n starts from 3
			// n = 3, 4, 5, ..., nMax
			// Compute F(n), print it and add to sum
			
			// Increment the index n and shift the numbers for the next iteration

		
			int fn1  =   fnMinus1  + fnMinus2;

			
			
			fnMinus1 = fnMinus2; 
			 fnMinus2 = fn1; 
			 System.out.print(  "  " + fn1) ;
			 ++n;
		}
		int fn1;
		average = (fn1 / nMax) ;
		System.out.println(average);
		
	}

}
