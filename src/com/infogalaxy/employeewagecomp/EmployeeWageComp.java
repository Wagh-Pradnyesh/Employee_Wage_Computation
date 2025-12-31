package com.infogalaxy.employeewagecomp;

import java.util.Scanner;

public class EmployeeWageComp {

	public static void main(String[] args) {
		
		int attendance = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		System.out.println("Enter The Attendance :[Absent=0/Present=1]:");
		attendance=scanner.nextInt();
		if (attendance==0) {
			System.out.println("Employee Is Absent");
		}
		else {
			System.out.println("Employee Is Present");
		}
		
		
	}

}
