package com.bridgelabz.EmpWageProblem;

class  EmployeeWageProblem{

	  public static final int IS_PART_TIME = 1;
	  public static final int IS_FULL_TIME = 2;
	  

	  public static int computeEmpWage1(String company, int empRatePerHour,
	  int NumOfWorkingDays, int MaxHrsPerMonth) {
	      //Variables
	      int empHrs = 0, empWage = 0, totalEmpWage = 0, totalEmpHrs = 0,totalWorkingDays = 0;

	      while(totalEmpHrs <= MaxHrsPerMonth && totalWorkingDays <= NumOfWorkingDays){

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
	            empCheck = 0;
	        }
	        totalEmpHrs += empHrs;
	        empWage = empHrs * empRatePerHour;
	        totalEmpWage += empWage;
	        //System.out.println("Emp Wage: "+empWage);
	        System.out.println("Days: "+ totalWorkingDays + "  Hrs: " + totalEmpHrs);

	      }

	      
	      //System.out.println("Total Emp Wage: "+totalEmpWage);
	      return totalEmpWage;
	       
	  }

	  public static void main(String[] args){

	    int totalWage = computeEmpWage1("DMart",20,2,10);
	    System.out.println("Total Emp Wage for DMart: "+totalWage);
	    int totalWage1 = computeEmpWage1("Reliance",10,4,20);
	    System.out.println("Total Emp Wage for Reliance: "+totalWage1);
	  }
	}