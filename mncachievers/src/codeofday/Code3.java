package codeofday;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstTriangle();
	}
public static void firstTriangle () {
	int rowCount=1;
	for(int i=5;i>0;i--)
	{
		//Printing i spaces at the begining of each row
		for (int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		//printing 'j' value at the end of each row
		for (int j=1;j<= rowCount;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();    rowCount++;
	}
}
}
