package com.bridgelabz.EmpWageProblem;

class  EmployeeWageProblem{

	  public static final int IS_PART_TIME = 1;
	  public static final int IS_FULL_TIME = 2;

	  private String company;
	  private int empRatePerHour;
	  private int NumOfWorkingDays;
	  private int MaxHrsPerMonth;
	  

	  public EmployeeWageProblem(String company, int empRatePerHour,
	  int NumOfWorkingDays, int MaxHrsPerMonth) {
	      this.company = company;
	      this.empRatePerHour = empRatePerHour;
	      this.NumOfWorkingDays = NumOfWorkingDays;
	      this.MaxHrsPerMonth = MaxHrsPerMonth;
	  }
	  public void computeEmpWage(){
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

	      
	      System.out.println("Total Emp Wage for "+company+": "+totalEmpWage);
	      

	  }
	    

	  public static void main(String[] args){

	    EmployeeWageProblem dMart = new EmployeeWageProblem("DMart",20,2,10);
	    EmployeeWageProblem reliance = new EmployeeWageProblem("Reliance",10,4,20);
	    dMart.computeEmpWage();
	    reliance.computeEmpWage();
	  }
	}