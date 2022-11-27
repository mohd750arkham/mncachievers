package mnc;

class Box{
	double width;
	double length;
	double height;
}
	class BoxDemo {
	 public static void main(String [] args ) {  
     Box myBox = new Box();
	 double vol;
	
	//now were assigning myBox's instance variables
	
	myBox.width = 5;
	myBox.height = 5;
	myBox.length = 5;

	 //compute vol of box
	vol = myBox.width * myBox.height * myBox.length;
	System.out.println(vol);

	}

	}
