package com.bridgelabz.EmployeeWage;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		final int NUM_OF_WORKING_DAYS = 20;
		final int MAX_MONTHLY_HRS = 100;
		int empHrs = 0;
		int dailyWage = 0;
		int totalWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		//for(int day = 1; day <= NUM_OF_WORKING_DAYS; day++) 
		while (totalEmpHrs <= MAX_MONTHLY_HRS && totalWorkingDays <= NUM_OF_WORKING_DAYS ) {
			totalWorkingDays++;
			int empCheck = (int)Math.floor(Math.random()*3);
			
			switch (empCheck) {
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day No.:"+ totalWorkingDays + " Employee Hrs: " + empHrs);

			dailyWage = empHrs*WAGE_PER_HOUR ;
			totalWage += dailyWage ; 
			System.out.println("Employee's salary today: "+ dailyWage +" $");
		}
		System.out.println("Employee's total monthly salary: "+ totalWage +" $");
		}
	}
