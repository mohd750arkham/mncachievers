package assignment1;

public class AbsDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOdd = 0; // Accumulating sum of odd numbers
		 int sumEven = 0; // Acumulating sum of even numbers
		 int absDiff; // Absolute difference between the two sums	
		 
		 int LOWERBOUND = 0;
		 int UPPERBOUND = 100;
		
		// Compute sums
	     for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) { 
		  if ( number% 2 != 0 ) { 
		  sumOdd += number; 
		  } 
		  else 
		  { 
		 sumEven += number; 
		  } 
		  } 
		 
	  // Compute Absolute Difference
	      if (sumOdd > sumEven) { 
	      absDiff = 0 ;
	      } else { 
	      absDiff = 1;
	      }  
		 
		 System.out.println(absDiff);
	}

}
