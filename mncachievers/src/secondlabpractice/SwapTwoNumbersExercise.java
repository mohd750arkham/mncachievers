package secondlabpractice;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float first = 2.5f, second = 4.50f;
		
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		
		float temporary = first;
		
		first = second;
		
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}

}
