package level2;

public class InstanceAndMethodDemo {
	/*
	 * plan - class
	 * reality - instance - object
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cycle();//this line will create a instance of the class cycle - anonymous instance
		
		//named instance
		
		Cycle hero=new Cycle();//a cycle object is created and assigned to a name hero of type Cycle
		
		Human shoiab=new Human();//a Human object is created and assigned to a name shoiab of type Human
		
		//What is shoiab here? - shoiab is my name and object is human
	}
}
class Cycle{// a class should be a noun
	
}
class Human{
	
}
	


