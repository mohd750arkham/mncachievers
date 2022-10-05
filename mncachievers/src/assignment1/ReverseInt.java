package assignment1;
import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variables
		 int inNumber; // to be input
		 int inDigit; // each digit

		// Extract and drop the "last" digit repeatably 
		 //using a whileloop with modulus/divide operations
		
		 
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter a positive integer:" );
		  inNumber = in.nextInt();



		 while (inNumber > 0) { 
			 inDigit = inNumber % 10;  // extract the "last" digit
			System.out.print(inDigit); // Print this digit (which is extracted in reverse order)
			 inNumber /= 10; // drop "last" digit and repeat,(inNumber / 10)
		 }
	}

}

