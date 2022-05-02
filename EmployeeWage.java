package com.bridgelabz.EmployeeWage;
import java.lang.Math;

class EmployeeWage {
	
	public static void main(String[] args) {
		
		double empCheck = Math.floor(Math.random()*2);
		int IS_ABSENT = 0;
		int IS_PRESENT = 1;
		int WAGE_PER_HOUR = 20;
		int empHrs = 0;
		int dailyWage = 0;
		
		if(empCheck == IS_ABSENT) {
			System.out.println("Employee is absent!");
			dailyWage += empHrs*WAGE_PER_HOUR ;
			System.out.println("Employee's salary today: "+ dailyWage);
			}
		else {
			System.out.println("Employee is present!");
			empHrs = 8;
			dailyWage += empHrs*WAGE_PER_HOUR ;
			System.out.println("Employee salary today: "+ dailyWage);
		}
	}
}
