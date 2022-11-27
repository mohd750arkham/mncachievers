package ch6;

public class ConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dress mydress = new Dress();
	} 

}
class Dress{
	public Dress() {
		System.out.println("before the dress object is ready..this method is called");
	}
}
/* so it seems an object when created it calls the method or constructor(special cons) 
 *  also we can create an object by just "new Dress()" instead of Dress mydress = new Dress(); 
 *  java by default has a non-parameterized cons , actually obj can't be created without calling cons 
 *  cons is a must for object creation 
 */
