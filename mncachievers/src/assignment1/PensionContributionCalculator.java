package assignment1;
import java.util.Scanner;

public class PensionContributionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare constants
		 final int SALARY_CEILING = 6000; 
		 final double EMPLOYEE_RATE_55_AND_BELOW = 0.2; 
		 final double EMPLOYER_RATE_55_AND_BELOW = 0.17; 
		 final double EMPLOYEE_RATE_55_TO_60 = 0.13; 
		 final double EMPLOYER_RATE_55_TO_60 = 0.13; 
		 final double EMPLOYEE_RATE_60_TO_65 = 0.075; 
		 final double EMPLOYER_RATE_60_TO_65 = 0.09; 
		 final double EMPLOYEE_RATE_65_ABOVE = 0.05; 
		 final double EMPLOYER_RATE_65_ABOVE = 0.075;
		 
		 
		 Scanner in = new Scanner(System.in);

		 // Declare variables
		 int salary  ;
		 int age ; // to be input
		 int contributableSalary  ; 
		 double employeeContribution, employerContribution, totalContribution; 
		// Check the contribution cap
		 
		 
		 
		 
		 System.out.println("Enter the monthly salary: " );
		 contributableSalary  = in.nextInt();
		  
			 System.out.print("Enter the age : " );
			 age = in.nextInt();
		 
		// while (contributableSalary < 6000) {

		// Compute various contributions in "double" using a nested-if  to handle 4 cases
		 if ( age <= 55) { // 55 and below
			 employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
			 employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
			 totalContribution = employeeContribution + employerContribution;
			 
			 } else if (age <= 60) { // (60, 65]
				 employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
				 employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
				 totalContribution = employeeContribution + employerContribution;
			  
			 } else if (age <= 65) { // (55, 60]
				 employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
				 employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
				 totalContribution = employeeContribution + employerContribution;
				 
			 } else { // above 65
				 employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
				 employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
				 totalContribution = employeeContribution + employerContribution;
				 
			 } 
		  System.out.println("Enter the monthly salary: " +contributableSalary);
		  
			 System.out.println("Enter the age : " + age);

			 System.out.println("the employee's contribution :" + employeeContribution);
			 
			 System.out.println("the employer's contribution :" + employerContribution);
			 
			 System.out.println("the total contribution is  :" + totalContribution);



}
	}
//}
