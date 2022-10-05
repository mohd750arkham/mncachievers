package assignment1;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; 
		int LOWERBOUND = 1;
		int UPPERBOUND = 100;
		int number = LOWERBOUND; // declare and init loop index variable
		 do { 
		 sum += number; 
		 ++number; // update
		 } while (number <= UPPERBOUND); 
		 System.out.println(sum);
	}

}
