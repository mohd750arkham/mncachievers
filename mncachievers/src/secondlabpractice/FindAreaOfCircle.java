package secondlabpractice;
import java.util.Scanner;
public class FindAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the radius :");
		
		double radius = s.nextDouble();
		
		double area = Math.PI*(radius * radius);
		
		System.out.println("The area of the circle is :" + area);
		
		double circumference = Math.PI * 2*radius ;
		
		System.out.println("The circumference of the circle is :" + circumference);
		
		
	}

}
