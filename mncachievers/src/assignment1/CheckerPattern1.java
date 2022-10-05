package assignment1;

import java.util.Scanner;

public class CheckerPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int row,col,
		int size;
		 
		// TODO Auto-generated method stub
		 Scanner s = new Scanner (System.in);
		 System.out.print( "Enter the size: " ); 
		 size = s.nextInt();
		 // Outer loop to print each of the rows
		 for (int row = 1; row <= size ; row++)
		  			 
		 {
			 if ((row % 2) == 0) {
				 System.out.print("  # "); 

			 }
			 
			 for (int col = 1; col <= size; col++)		
		 {
			
			  
			 System.out.print(" # "); 
}
		 System.out.print(" \n");
		 
		 s.close();
		 }
	}

}
