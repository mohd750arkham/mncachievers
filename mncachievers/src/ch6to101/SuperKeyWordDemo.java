package ch6to101;

public class SuperKeyWordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medium obj = new Medium();
		obj.topmet();
	}

}
abstract class TopTopStar{
	public void topmet() {
		System.out.println("top top met method called...");
	}
}

abstract class TopStar extends TopTopStar{
	public void topmet() {
		System.out.println("topstar met method called...");
	}
}

abstract class Top extends TopStar{
	public void topmet() {
		System.out.println("top met method called...");
	}
}

class Medium extends Top{
	
}