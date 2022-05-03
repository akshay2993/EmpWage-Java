package com.bridgelabz.EmployeeWage;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		final int IS_FULL_TIME = 1;
		final int IS_PART_TIME = 2;
		final int WAGE_PER_HOUR = 20;
		int empHrs = 0;
		int dailyWage = 0;
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

		dailyWage += empHrs*WAGE_PER_HOUR ;
		System.out.println("Employee's salary today: "+ dailyWage +" $");
		}
	}
