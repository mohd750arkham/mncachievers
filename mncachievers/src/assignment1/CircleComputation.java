package assignment1;
import java.util.Scanner;
	
    public class CircleComputation {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		
		double radius, diameter, circumference, area;
		
		Scanner in = new Scanner(System.in);
	
		
		System.out.print("Enter the radius: "); 
		 radius = in.nextDouble();
		 
		 diameter = 2.0 * radius; 
		 area = Math.PI * radius * radius; 
		 circumference = 2.0 * Math.PI * radius;
		 
		 System.out.printf("Diameter is: %.2f%n", diameter); 
		 
		 System.out.printf("radius is: %.2f%n", radius);
		 
		 System.out.printf("circumference is: %.2f%n", circumference);
		 
		 System.out.printf("area is: %.2f%n", area);
		 
		 in.close();
	}

}
