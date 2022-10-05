package assignment1;

import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				// Declare constants first (variables may use these constants)
				 // The keyword "final" marked these as constant (i.e., cannot be changed). 
				 // Use uppercase words joined with underscore to name constants
				final double TAX_RATE_ABOVE_20K = 0.1; 
				 final double TAX_RATE_ABOVE_40K = 0.2; 
				 final double TAX_RATE_ABOVE_60K = 0.3; 
				 
				 
				 Scanner in = new Scanner(System.in);
				// Declare variables
				 int taxableIncome; 
				 double taxPayable; 
				 
				 System.out.print("Enter taxableIncome: " );
					
				 taxableIncome = in.nextInt();
				 
				// System.out.print("Enter taxPayable: " );
					
				 //taxPayable = in.nextInt();
			while(taxableIncome!=-1) {
				 if (taxableIncome <= 20000) { // [0, 20000]
					 taxPayable = 0.0 * taxableIncome ; 
					 } 
				 
				 
				 else if (taxableIncome <= 20000) { // [0, 20000]
					 taxPayable = 0.0 * taxableIncome ; 
					 } 
				 else if (taxableIncome <= 40000) { // [20001, 40000]
					 taxPayable = (taxableIncome-20000)*TAX_RATE_ABOVE_20K; 
					 }
				 else if (taxableIncome <= 60000) { // [40001, 60000]
					 taxPayable = (40000-20000)*TAX_RATE_ABOVE_20K+(taxableIncome -40000)*TAX_RATE_ABOVE_40K; 
					 } 
				 else { // [60001, ]
					 taxPayable = (40000-20000)*TAX_RATE_ABOVE_20K+(60000-40000)*TAX_RATE_ABOVE_40K+(taxableIncome-60000)*TAX_RATE_ABOVE_60K; 
					 } 
				 System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
				 
				 System.out.println("Enter taxableIncome: ");
				 taxableIncome = in.nextInt();
			}
			
		System.out.println("Bye..!");
	}

}
