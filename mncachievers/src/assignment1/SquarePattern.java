package assignment1;
import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		int i,j,side;
		 
		// TODO Auto-generated method stub
		 Scanner s = new Scanner (System.in);
		 System.out.print( "Enter any side of a Square: " ); 
		  side = s.nextInt();
		 // Outer loop to print each of the rows
		 for (int row = 1; row <= side ; row++) 
		 {
		 for (int col = 1; col <= side; col++) 
		 {
			 System.out.print(" # "); 
}
		 System.out.print("\n"); 
		 }
	}	
	
}
