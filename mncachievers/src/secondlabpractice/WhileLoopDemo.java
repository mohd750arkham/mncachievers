package secondlabpractice;
import java.util.Scanner;
public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, sum = 0;
		Scanner s = new Scanner (System.in);
		
	System.out.println("Please Enter any integer value below 10:");	
	number = s.nextInt();
	
	while (number <= 10) {
		sum = sum + number;
		number++;
	}
	System.out.format("Sum of the Numbers from the while loop is :%d",sum);
	s.close();

	}

}
