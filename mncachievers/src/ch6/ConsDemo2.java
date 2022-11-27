package ch6;

public class ConsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Hotel{
	public void makefood() {
		Food food = new  Food();
	}
}
class Food{
public Food() {
	System.out.println("normal food object created...");
}
	private Food (String taste) {
		System.out.println("tasty food created ...");
	}
		public Food(String taste,int money) {
			if(money>10)
			System.out.println("t");
		}
	
}
