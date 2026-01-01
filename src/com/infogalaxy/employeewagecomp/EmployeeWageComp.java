package com.infogalaxy.employeewagecomp;

import java.util.Random;


public class EmployeeWageComp {

	public static void main(String[] args) {
		
		int attendance = 0;
		int dailywage = 0;
		final int  WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8;
		final int PART_TIME_HR = 4;
		int employee_type = 0;
		
		
		//Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		//Code For Generate Random Number With Range of Nine 
		Random random = new Random();
		attendance = random.nextInt(9)%2;
		
		
		//System.out.println("Attendance:-"+attendance);
		
		//attendance=scanner.nextInt();
		if (attendance==0) 
		{
			System.out.println("Employee Is Absent");
		}
		else 
		{
			System.out.println("Employee Is Present");
			employee_type = random.nextInt(9)%2;
			
			
				if (employee_type==0) 
				{
					System.out.println("Employee Is PartTime:");
					dailywage = WAGE_PER_HR*PART_TIME_HR;
				}
				else
				{
					System.out.println("Employee Is FullTime :");
					dailywage = WAGE_PER_HR*FULL_DAY_HR;
				}
				
				System.out.println("Employee Wage Is :="+dailywage);
			
			
		}
		
		
	}

}
