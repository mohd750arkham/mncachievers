package assignment1;

public class CountRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int count = 0; // Count the number within the range, initialize to 0

		 double average;
		 
		final int LOWERBOUND = 111;
		final int UPPERBOUND = 8899;
		
		 for (int number =LOWERBOUND; number <= UPPERBOUND; ++number ) { 
		
		sum += number;
		
		 ++count; 
		 } 
		 
		 System.out.println(sum);
		 
		 average=(sum/UPPERBOUND);
		 System.out.println(average);
		 System.out.println(count);
	}

}
