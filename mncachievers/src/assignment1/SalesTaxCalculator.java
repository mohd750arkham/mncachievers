package assignment1;

import java.util.Scanner;

public class SalesTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare constants
		 final double SALES_TAX_RATE = 0.070; 
		 final int SENTINEL = -1;    // Terminating value for input
		 
		 
		// Declare variables
		 double price, actualPrice=0.0, salesTax=0.0; // inputs and results
		 double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0; // to accumulate

		 // Read the first input to "seed" the while loop
		 
		 
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter the tax-inclusive price in dollars (or  -1 to end): "); 
				  price = in.nextDouble();
				  
				  while (price != SENTINEL) { 
					  // Compute the tax
					 
					  salesTax= (double) price*SALES_TAX_RATE;
					  actualPrice = (double) price - salesTax;
					  totalPrice += (double) price;
					  totalActualPrice += (double)actualPrice;
					  totalSalesTax += (double)salesTax  ;
					  
					  System.out.println("Actual Price is: " + actualPrice);
					  System.out.println("Sales  Tax is : "  + salesTax);
					  
					  System.out.print("Enter the tax-inclusive price in dollars (or  -1 to end): "); 
					  price = in.nextDouble();
					  
					  

					 
	}
				  System.out.println("Total Price is: " + totalPrice);

				  
				  System.out.println("Total Actual Price is: "  + totalActualPrice);
				  
				  
				  System.out.println("'Total Sales  Tax is : "  + totalSalesTax);
				  
				  totalPrice = actualPrice + salesTax; 
}
}
