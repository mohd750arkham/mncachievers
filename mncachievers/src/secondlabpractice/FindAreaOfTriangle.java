package secondlabpractice;
import java.util.Scanner;
public class FindAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the width of the Triangle :" );
		double base = s.nextDouble();
		
		System.out.println("Enter the height of the Triangle :");
		double height = s.nextDouble();
		
		double area = (base * height)/2;
		System.out.println("Area of the Triangle is:" + area);
		
	}

}
