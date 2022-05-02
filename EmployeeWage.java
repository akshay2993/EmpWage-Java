package com.bridgelabz.EmployeeWage;
import java.lang.Math;

class EmployeeWage {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program in JAVA!");
		double empCheck = Math.floor(Math.random()*2);
		if(empCheck == 0)
			System.out.println("Employee is present!");
		else
			System.out.println("Employee is absent!");
		
		
	
	}
}
