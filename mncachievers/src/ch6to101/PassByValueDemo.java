package ch6to101;

public class PassByValueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassByValueDemo obj = new PassByValueDemo();
		obj.met(20);
	}
	public void met (int i) {
		i = i +10;
		System.out.println(i);
		met2("hello",i);
		
	}
	public void met2(String s, int i) {
		System.out.println(s+":"+i);
	}
	public static void sMet() {
		
	}
}
