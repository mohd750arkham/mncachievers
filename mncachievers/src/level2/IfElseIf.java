package level2;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//conditional branching is done through 3 ways
				//1. if-else-if 2. ternary operator 3. switch case
				boolean married=false;
				boolean earning=true;
				
				//Student Selection
			 if(married) {//if the value inside the bracket is true then the block gets executed
					System.out.println("you are ok");
 				 if(earning) {
						System.out.println("you are selected...");
 				}
				}
				
				if(married || earning) {
					System.out.println("you are ok and you are selected..");
			}
			else {
					System.out.println("you are not eligible..");
			}
				int n1=0;
				Scanner scan=new Scanner(System.in);
				System.out.println("enter a number..:");
				n1=scan.nextInt();
				if(n1%2==0) {
				System.out.println("even number....");
			}
				else {
					System.out.println("odd number.....");
				}
				
				if(n1==0) {
					System.out.println("sunday...");
				}
				else if(n1==1) {
					System.out.println("monday...");
				}
				else if(n1==2) {
					System.out.println("tuesday...");
				}
				else {
					System.out.println("enough....");
				}
			}
		}
