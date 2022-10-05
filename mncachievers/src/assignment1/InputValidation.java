package assignment1;
import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variables
		 int inNumber; // to be input
		 boolean isValid; // boolean flag to control the loop
	// Use a do-while loop controlled by a boolean flag
		  // to repeatably read the input until a valid input is entered

		  isValid = false; // default assuming input is not valid 
		  do { 
			  Scanner s = new Scanner(System.in);
				 System.out.print("Enter a number between 0-10 or 90-100: ");
				  inNumber = s.nextInt();
			// Prompt and read input
			
				if(inNumber >=0 && inNumber <=10) {
					isValid = true;
				System.out.println("You have entered : " + inNumber  );
				}
				
				else if (inNumber >= 90 && inNumber <= 100) {
					isValid = true;
					System.out.println("You have entered : " + inNumber  );
					
				}
				else {					
					System.out.println("InValid input try again "   );
					isValid = false;
				
				
					
		  }
		  } while(!isValid); 
	}  
	}

