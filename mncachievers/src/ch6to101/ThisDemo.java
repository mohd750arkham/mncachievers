package ch6to101;

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan khaitan = new Fan();
		khaitan.setup();
	}

}
class Fan{
	public Fan() {
		System.out.println("fan object created..");
	}
	public void on() {
		System.out.println("fan switched on...");
	}
	public void setup() {
	Room myRoom = new Room();
	myRoom.fix(this);
	}
}
class Room{
	public void fix(Fan f) {
		f.on();
	}
}