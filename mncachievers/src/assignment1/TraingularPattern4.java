package assignment1;

import java.util.Scanner;

public class TraingularPattern4 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size:");
	int size=s.nextInt();
	String a="* ";
	String b=" ";
	int x=size*2;
	for(int i=1;i<=size;i++) {
		System.out.print(b.repeat(x-=2));
		for(int j=1;j<=i;j++) {
				System.out.print(a);
			}
			
				System.out.println();
			
		}
	}
}

