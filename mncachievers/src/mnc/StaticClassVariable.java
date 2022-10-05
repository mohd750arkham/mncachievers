package mnc;

public class StaticClassVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseMember.income=10000;//since income is a class variable, it has nothing to do with object creation
		
		HouseMember father=new HouseMember();
		father.expense=5000;
		
		HouseMember mother=new HouseMember();
		mother.expense=2000;
		
		HouseMember child=new HouseMember();
		child.expense=100;
		
		System.out.println(child.expense);
		father.income=4000;
		System.out.println(HouseMember.income);
	}
}
class HouseMember{
	static int income;//class variable
	int expense;//instance variable
	

}
