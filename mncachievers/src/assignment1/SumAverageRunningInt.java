package assignment1;

public class SumAverageRunningInt {

	public static void main (String[] args) { 
		 // Define variables
		 int sum = 0; // The accumulated sum, init to 0
		 double average; // average in double
		 final int LOWERBOUND = 1; 		
		 final int UPPERBOUND = 100; 
		 // Use a for-loop to sum from lowerbound to upperbound 
		 for (int number = LOWERBOUND; number <= UPPERBOUND;  ++number) 
		{ 
		 // The loop index variable number = 1, 2, 3, ..., 99, 100
		sum += number; // same as "sum = sum + number"
		System.out.println(sum);
		 } 
		// Compute average in double. Beware that int / int produces  int!

		average = (sum/UPPERBOUND);
				
		
		 System.out.println(average);
  
  }
 
  
 
}
 

