package assignment1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variables
		String inStr; // input String
		 int inStrLen; // length of the input String
		 
			// Extract and drop the "last" digit repeatably 
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter a String: "); 
		 inStr = in.next(); // use next() to read a String
		 inStrLen = inStr.length(); 
		 //System.out.println("length of string:" +inStrLen);
		 
		// Use inStr.charAt(index) in a loop to extract each character
		 // The String's index begins at 0 from the left. 
		 // Process the String from the right

		 for (int c = inStrLen - 1; c >= 0; --c) {
			 System.out.print(inStr.charAt(c));
			 
		 }
	}

}
