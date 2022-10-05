package assignment1;

import java.util.Scanner;
//https://www.javatpoint.com/sum-of-digits-of-a-number-in-java#:~:text=Steps%20to%20Find%20the%20Sum%20of%20Digits%20of,to%205%29%20until%20the%20number%20%28N%29%20becomes%200.
public class SumOfDigitsInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// Declare variables
				 int inNumber; // to be input
				 int inDigit; // each digit
				 int sum=0;
				 
				// Extract and drop the "last" digit repeatably 
				 //using a whileloop with modulus/divide operations
				
				 
				 Scanner in = new Scanner(System.in);
				 System.out.print("Enter a positive integer:" );
				  inNumber = in.nextInt();



				 while (inNumber > 0) { 
					 inDigit = inNumber % 10;  // extract the "last" digit
					System.out.print(inDigit);// Print this digit (which is extracted in reverse order)
					sum  +=  inDigit;
					inNumber /= 10; // drop "last" digit and repeat,(inNumber / 10)
					
				 }
				 System.out.println("The sum of all digits is : " + sum);
	}

}
