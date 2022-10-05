package level2;

public class DataTypes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz obj=new Xyz();
		Xyz obj2=new Xyz();
		
		obj.y=50;
		obj2.y=100;
		
		System.out.println(obj.x);
		System.out.println(obj.y);		
		
		System.out.println(obj2.x);
		System.out.println(obj2.y);
	}
}
class Xyz{
	static int x=10;//class variable
	int y=20;//instance variable
}

	


