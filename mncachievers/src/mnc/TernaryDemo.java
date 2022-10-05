package mnc;

public class TernaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ternary operator - ?
				int a=10;
				int b=20;
				//String result=(a<b)?"a is lesser than b":"a is not lesser than b";
				
				//boolean result=(a>b)?true:false;
				
				//int result=(a>b)?100:200;
				
				boolean result=(a<b)?(a!=10)?true:false:false;
				
				System.out.println(result);
	}

}
