package mnc;

public class Main {
	
	public int addNumbers(int a,int b) {
	int sum =  a +  b;
	return sum;
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int num1 = 25;
		int num2 = 15;
		
		Main obj = new Main();
		int result = obj.addNumbers(num1, num2);
	System.out.println("the sum is :"  + result);
	}

}
