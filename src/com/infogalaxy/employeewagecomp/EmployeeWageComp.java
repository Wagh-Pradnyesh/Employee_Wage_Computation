package com.infogalaxy.employeewagecomp;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComp {

	public static void main(String[] args) {
		
		int attendance = 0;
		int dailywage = 0;
		final int  WAGEPERHR = 20;
		final int FULLDAYHR = 8;
		
		
		//Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		//Code For Generate Random Number With Range
		Random random = new Random();
		attendance=random.nextInt(9)%2;
		System.out.println("Attendance:-"+attendance);
		
		//attendance=scanner.nextInt();
		if (attendance==0) {
			System.out.println("Employee Is Absent");
		}
		else {
			System.out.println("Employee Is Present");
			dailywage = WAGEPERHR*FULLDAYHR;
			System.out.println("Employee Wage Is :="+dailywage);
		}
		
		
	}

}
