package assignment1;

public class Fibonacci1 {
	public static void main(String[] args) {
		int n = 3;
		int fn;
		int f1 =1;
		int f2 =1;
		int nMax = 20;
		int sum = f1 + f2;
		double average;
		System.out.println("the first"+ nMax+"Fibonacci numbers are : "+f1+"\t"+f2);
		while (n <= nMax) {
			fn=f1+f2;
			System.out.print("\t"+fn);
			sum+=fn;
			++n;
			f2 = f1;
			f1=fn;
		}
		average=(double)sum/nMax;
		System.out.println();
		System.out.println("The average is :"+average);
		
	}

}
