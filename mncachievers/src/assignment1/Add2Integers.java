package assignment1;

	import java.util.Scanner;
	
public class Add2Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2 , sum ;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first integer:");
		
		number1 = in.nextInt();
		
		System.out.println("Enter second integer:");
		
		number2 = in.nextInt();
		
		in.close();
		
		sum = number1 + number2;
				
			System.out.println("The sum is:" + sum);
			
	}

}
