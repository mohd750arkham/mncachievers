package mnc;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Type Casting
		
				//AUTOMATIC TYPE PROMOTION
				
				byte b=20; //- 8 bits
				int i=b;//b byte is automatically promoted to int  - auto type promotion
				byte c=2;
				
				//all arithmetic operations result in a integer
				//byte result=b%c;//auto type promotion is happening - byte is converted to int
				
				//two solutions for the above problem
				int result=b*c;//accept the result in int
				byte bresult=(byte)(b*c);//casting the result int into byte - the result 32 bit is reduced to 8 bit
				
				//Both type promotion and demotion is possible only with compatible types
				//byte,short,int,long,float,double are compatible types
				//boolean - not compatible with any
				//char and int are compatible
				//String - not compatible with any
				//you cannot cast uncompatible types
				
				boolean boo=true;
				//int iboo=(int)boo;//int and boolean are incompatible types - cannot be casted...
				
				String str="hello world";
				//int istr=(int)str;//string and int are also incompatible types
				//int x=100;
				//str=(String)x;//incompatible
				
				char ch='a';
				char cc=97;
				int ic=ch;//a char can be given to a int without casting
				//char ci=ic;//a int cannot be given to char without casting
				char ci=(char)ic;
				
				//what happens when the data is incompatible
				
				int n=257;
				byte bn=(byte)258;
				
				//when the data is incompatible then the data is divided by the size of the data type
				//it will give you the reminder as the resultant value - so you basically loose the precision
				System.out.println(bn);
	}

}
