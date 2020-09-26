package com.bridgelabz.EmpWageProblem;

class  EmployeeWageProblem{

	  public static final int IS_PART_TIME = 1;
	  public static final int IS_FULL_TIME = 2;
	  public static final int EMP_RATE_PER_HOUR = 20;
	  public static final int NUM_OF_WORKING_DAYS = 20;
	  public static final int MAX_HRS_IN_MONTH = 100;

	  public static int computeEmpWage() {
	      //Variables
	      int empHrs = 0, empWage = 0, totalEmpWage = 0, totalEmpHrs = 0,totalWorkingDays = 0;

	      while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){

	        int empCheck = (int)Math.floor(Math.random()*10)%3;
	        totalWorkingDays++;
	        
	        switch(empCheck){

	          case IS_PART_TIME:
	            //System.out.println("Employee is Present");
	            empHrs = 4;
	            break;

	          case IS_FULL_TIME:
	            //System.out.println("Employee is Present");
	            empHrs = 8;
	            break;

	          default:
	            empHrs = 0;
	        }
	        totalEmpHrs += empHrs;
	        empWage = empHrs * EMP_RATE_PER_HOUR;
	        totalEmpWage += empWage;
	        //System.out.println("Emp Wage: "+empWage);
	        System.out.println("Days: "+ totalWorkingDays + "  Hrs: " + totalEmpHrs);

	      }

	      
	      //System.out.println("Total Emp Wage: "+totalEmpWage);
	      return totalEmpWage;
	       
	  }

	  public static void main(String[] args){

	    int totalWage = computeEmpWage( );
	    System.out.println("Total Emp Wage: "+totalWage);
	  }
	}