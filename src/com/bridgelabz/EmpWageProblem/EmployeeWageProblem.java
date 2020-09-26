package com.bridgelabz.EmpWageProblem;

public class EmployeeWageProblem{

    public static  final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMPLOYEE_WAGE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public  static  final int TOTAL_WORKING_HOURS = 100;

    public static void main(String[] args) {

        int empHrs = 0, totalEmpHrs = 0;
        int empWage = 0, totalEmpWage = 0;
        int days = 0;

        System.out.println("Welcome to Employee Wage Computation Program");

        while(days<NUM_OF_WORKING_DAYS && totalEmpHrs<=TOTAL_WORKING_HOURS)
        {
            int empCheck = (int) Math.floor(Math.random() * 10) %3;

            /*if(empCheck == IS_FULL_TIME)
                System.out.println("Employee is Present");
            else
                System.out.println("Employee is Absent");*/

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
            //System.out.println("Employee wage is: "+ empWage);
            totalEmpWage+=empWage;
            totalEmpHrs+=empHrs;
            days++;
        }


        System.out.println("Employee total wage is: "+ totalEmpWage);
        System.out.println("Employee total hours is: "+ totalEmpHrs);
        System.out.println("Total Days worked By the Employee:" + days);
        }

    }