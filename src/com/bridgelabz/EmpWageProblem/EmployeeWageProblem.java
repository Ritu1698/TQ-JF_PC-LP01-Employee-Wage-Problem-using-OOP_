package com.bridgelabz.EmpWageProblem;

public class EmployeeWageProblem{

    public static  final int IS_FULL_TIME = 1;
    public static final int EMPLOYEE_WAGE_PER_HOUR = 20;

    public static void main(String[] args) {

        int empHrs = 0;
        int empWage = 0;

        System.out.println("Welcome to Employee Wage Computation Program"); 

        double empCheck = Math.floor(Math.random() * 10) %2;

        if(empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent"); 

        if(empCheck == IS_FULL_TIME)
            empHrs = 8;

        empWage = empHrs * EMPLOYEE_WAGE_PER_HOUR ;
        System.out.println("Employee wage is: "+ empWage);
    }

}