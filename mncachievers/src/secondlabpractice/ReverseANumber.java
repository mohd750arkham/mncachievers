package secondlabpractice;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int reversenum = 0;
		System.out.println("Input your number and press enter :");
		
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		
		while(num != 0 )
		{
			reversenum = reversenum * 10;
			reversenum = reversenum * num%10;
			num = num/10;
		}
		 System.out.println("Reverse of input number is: "+reversenum); 

	}

}
