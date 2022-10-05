package secondlabpractice;
import java.util.Scanner; 

public class FindAreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter side of Square :");
		Scanner s = new Scanner(System.in);
		double side = s.nextDouble();
		double area = side*side;
		System.out.println("Area of Square is :" + area);
	}

}
