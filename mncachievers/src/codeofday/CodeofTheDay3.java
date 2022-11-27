package codeofday;

public class CodeofTheDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secondTriangle();
	}
 public static void secondTriangle() {
	 int noOfRows=5;
	 int rowCount = noOfRows;
	 for(int i=0;i<noOfRows;i++) {
		 
		 for(int j=1;j<=i*2;j++)
	 {
		 System.out.print(" ");
	 }
	 for(int j=1;j<=rowCount;j++)
	 {
		 System.out.print(j+" ");
	 }
	 //Printing j where j value will be from rowCount -1 to 1  
	 for (int j=rowCount-1;j>=1;j--) {
		 System.out.print(j+" ");
	 }
 
	 System.out.println();
	 rowCount--;
	 }
	 }
	 
}
