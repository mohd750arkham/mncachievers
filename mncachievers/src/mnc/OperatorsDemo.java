package mnc;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OPERATORS - ARITHMETIC OPERATOR/RELATIONAL OPERATOR/LOGICAL OPERATORS
		
				//ARITHMETIC OPERATORS
				//+ - * / %
				
				int n1=10;
				int n2=2;
				
				System.out.println("Addition..:"+n1+n2);
				System.out.println("Substraction..:"+(n1-n2));
				System.out.println("Multiplication..:"+(n1*n2));
				System.out.println("Division..Quotient..:"+(n1/n2));
				System.out.println("Mod...Reminder..:"+(n1%n2));
				
				//Arithmetic - Increment and Decrement
				
				n1=n1+1;//n1++  - increment
				n1=n1-1;//n1--  - decrement
				
				n1=10;
				System.out.println(n1++);//post increment - prints first and then increments -10
				System.out.println(n1); //-11
				n1=10;
				System.out.println(++n1);//pre increment - increments first and then prints - 11
				System.out.println(n1);//-11
				
				n1=10;
				System.out.println(n1--);//post decrement - prints first and then decrements -10 ;
				System.out.println(n1);//9
				
				n1=10;
				System.out.println(--n1);//pre decrement - decrements first and prints - 9
				System.out.println(n1);
				
				n1=10;
				n1=n1+10;//n1+=10;
				
				n1=10;
				n1+=10;
				System.out.println(n1);//20
				
				n1=10;
				n1-=5;
				System.out.println(n1);//5
				
				n1=10;
				n1*=2;
				System.out.println(n1);//20
				
				n1=10;
				n1/=5;
				System.out.println(n1);//2
				
				n1=10;
				n1%=3;
				System.out.println(n1);//1
	}

}
