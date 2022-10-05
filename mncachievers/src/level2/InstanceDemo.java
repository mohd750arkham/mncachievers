package level2;

public class InstanceDemo {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		TrainingRoom tr141=new TrainingRoom();
		TrainingRoom tr142=new TrainingRoom();
		
		
		System.out.println(tr141.sulab);//for all instances same object will be used - class variable
		System.out.println(tr141.computertable);//for every instance one object will be created - instance variable
		
		System.out.println(tr142.sulab);
		System.out.println(tr142.computertable);
		
		
	}
}
class TrainingRoom{
	static Toilet sulab=new Toilet();//class variable
	Table computertable=new Table();//instance variable
}
class Toilet{
	
}
class Table{
	
}
	
