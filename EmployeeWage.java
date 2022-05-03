package com.bridgelabz.EmployeeWage;
import java.lang.Math;

public class EmployeeWage {
	
	public static void main(String[] args) {
		
		int IS_ABSENT = 0;
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR = 20;
		int empHrs = 0;
		int dailyWage = 0;
		double empCheck = Math.floor(Math.random()*3);
		
		if(empCheck == IS_ABSENT)
			empHrs = 0;
		else if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else 
			empHrs = 4;
		
		dailyWage += empHrs*WAGE_PER_HOUR ;
		System.out.println("Employee's salary today: "+ dailyWage +" $");
		}
	}
