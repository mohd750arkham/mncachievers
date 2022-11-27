package inherdemo;

public class InherDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ibacoicecream iic= new Vanilla();
		System.out.println(iic);
	}

}
class Ibacoicecream {
	
}
class Vanilla extends Ibacoicecream{
	Ibacoicecream iic;
	public Vanilla() {
	}
	public Vanilla(Ibacoicecream iic) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vanilla...:"+iic;
	}
}
