package com.bridgelabz.EmpWageProblem;

public class EmployeeWageProblem{

    public static  final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMPLOYEE_WAGE_PER_HOUR = 20;

    public static void main(String[] args) {

        int empHrs = 0;
        int empWage = 0;

        System.out.println("Welcome to Employee Wage Computation Program"); 

        int empCheck = (int) Math.floor(Math.random() * 10) %3;

        if(empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent"); 

        switch(empCheck){
            
            case IS_PART_TIME:
                empHrs = 4;
                break;

            case  IS_FULL_TIME:
                empHrs = 8;
                break;

            default:
                empHrs = 0;
        }

        empWage = empHrs * EMPLOYEE_WAGE_PER_HOUR ;
        System.out.println("Employee wage is: "+ empWage);
    }

}