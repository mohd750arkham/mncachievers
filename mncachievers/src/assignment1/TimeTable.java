package assignment1;

import java.util.Scanner;

public class TimeTable {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size:");
	int a=s.nextInt();
	String b="--";
	System.out.println("* |");
	for(int i=1;i<=a;i++) {
		System.out.printf("%4d",i);
	}
	System.out.println();
	System.out.print("----");
	System.out.println(b.repeat(a*2));
		for(int i=1;i<=a;i++) {
			System.out.print(i+ " |");
			for(int j=1;j<=a;j++) {
				System.out.printf("%4d" ,i*j);
			}
				System.out.println();
			}
		}
	
}

