package assignment1;

import java.util.Scanner;

public class TriangularPattern2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size:");
	int size=s.nextInt();
	String a="*";
	for(int i=size;i>=1;i--) {
		for(int j=i;j>=1;j--) {
				System.out.print(a);
		}
		
				System.out.println();
			
		}
	}
}

