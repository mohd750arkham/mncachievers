package ch6to101;

public class ThisDemo2 {
	String s;
	public ThisDemo2(String s) {
		this.s=s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo2 obj = new ThisDemo2("some value...");
		obj.printS("aaaa");
	}
	public void printS(String s) {
		System.out.println(this.s);
	}
}
