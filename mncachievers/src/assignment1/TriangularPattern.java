package assignment1;

import java.util.Scanner;

public class TriangularPattern {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size:");
	int size=s.nextInt();
	String a="#";
	for(int i=1;i<=size;i++) {
		System.out.println(a.repeat(i));
		for(int j=i;j<=i;j++) {
			if(j>5) {
				System.out.println(a.repeat(5));
			}
			else {
				System.out.println(a.repeat(j));
			}
		}
	}
}
}
