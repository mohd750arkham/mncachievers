package ch6to101;

public class ConsDemo1 {
	public ConsDemo1() {
		System.out.println("cons with default called...");
	}
	public ConsDemo1(int i) {
		System.out.println("cons with i value called ..."+ i);
	}
	public ConsDemo1(Employee e) {
		System.out.println("employee cons called...."+e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConsDemo1();
		new ConsDemo1(1);
		new ConsDemo1(new Employee());
	}

}
class Employee{}