package assignment1;

public class ProductFactorial {
	//https://www.programiz.com/java-programming/examples/factorial
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long product = 1; // The accumulated sum, initialize to 0
		 final int LOWERBOUND = 1; 		
		 final int UPPERBOUND = 13; 
		 
		 for (int number = LOWERBOUND; number <= UPPERBOUND;  ++number) 

		 { 
			 // The loop index variable number = 1, 2, 3, ...
			product *= number; // same as "sum = sum + number"
			System.out.print(product+"\t");
			 }
		 
		 
	}

}

