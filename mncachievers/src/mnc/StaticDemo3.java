package mnc;

public class StaticDemo3 {
	 // Q4. how can we create objects if the constructor is private
	 int age;

	 
	 static {
		 StaticDemo3 obj1 = new StaticDemo3();
	 }
	 
	 public static int create() {
		 StaticDemo3 obj1 = new StaticDemo3();
		 obj1.age = 45;
		 return obj1.age ;

 
	 }
	  
	 private StaticDemo3() {
		  age = 40;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		StaticDemo3 obj = new StaticDemo3();
		System.out.println(obj.age);

	}

}
