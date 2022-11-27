package ch6;

public class ConsDemosubpart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dreass mydress = new Dreass(1,"hi");
	}

}
class Dreass{
	public Dreass(int i) {
		System.out.println("int param cons called..");
	}
	public Dreass(int i,String s) {
		System.out.println("overloaded cons callled...");
		}// overloading of constructor 
}
