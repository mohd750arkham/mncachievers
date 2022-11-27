package ch6;

public class ConsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz.met();
		Xyz.met();
		Xyz.met1(11);

	}

}
// methods can be accessed from static classes without creation of objects 
// and also constructors cannot get called in static blocks and methods since there is no object creation
// hence when there is a need to pass arguments , static method's parenthesis can be used to pass arguments
//static block is used when the .class file is loaded into the jvm , and it has nothing to do with object creation
//static block doesnt have arguments passing ,hence parameters can be passed in static methods	

class Xyz {
	public Xyz(){
		System.out.println("constructor gets called only in nonStatic classes");
	}
	
	static {
		System.out.println("initialization code...");
	}
	
	public static void met( ) {
		System.out.println("met method is called");
	}
	
	public static void met1(int i) {
		System.out.println("met method is called" + " " + i);
		
	}
}