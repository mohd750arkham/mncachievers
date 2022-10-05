package assignment1;

public class WhileDoLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; 
		int LOWERBOUND = 1;
		int UPPERBOUND = 100;
		 int number = LOWERBOUND; // declare and init loop index variable
		while (number <= UPPERBOUND) { // test
		 sum += number; 
		 ++number; // update
		 } 
		System.out.println(sum);
		
	}

}
