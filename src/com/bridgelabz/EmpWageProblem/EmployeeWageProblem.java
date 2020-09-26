package com.bridgelabz.EmpWageProblem;
import java.util.*;

	

class  EmployeeWageProblem{

	  public static final int IS_PART_TIME = 1;
	  public static final int IS_FULL_TIME = 2;

	  private int numOfCompany = 0;
	  //private CompanyEmpWage[] CompanyWageArray;
	  public ArrayList<CompanyEmpWage> CompanyWageArrayList;

	  public EmployeeWageProblem(){
	    CompanyWageArrayList = new ArrayList<CompanyEmpWage>();
	  }

	  private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){

	    //CompanyWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
	    CompanyEmpWage c =new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		CompanyWageArrayList.add(c);
		numOfCompany++;

	  }
	  private void computeEmpWage() {
		  for(int i=0;i < numOfCompany;i++) {
			  CompanyWageArrayList.get(i).setTotalEmpWage(this.computeEmpWage(CompanyWageArrayList.get(i)));
			  System.out.println(CompanyWageArrayList.get(i));
		  }
		  
		  
	  }

	  private int computeEmpWage(CompanyEmpWage companyEmpWage){

	     int empHrs = 0, empWage = 0, totalEmpWage = 0, totalEmpHrs = 0,totalWorkingDays = 0;

	      while(totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays){

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
	        empWage = empHrs * companyEmpWage.empRatePerHour;
	        totalEmpWage += empWage;
	        //System.out.println("Emp Wage: "+empWage);
	        System.out.println("Days: "+ totalWorkingDays + "  Hrs: " + totalEmpHrs);

	      }

	      return totalEmpHrs*companyEmpWage.empRatePerHour;


	  }
	  
	    

	  public static void main(String[] args){

	    EmployeeWageProblem empWageBuilder = new EmployeeWageProblem();
	    empWageBuilder.addCompanyEmpWage("DMart",20,2,10);
	    empWageBuilder.addCompanyEmpWage("Reliance",20,2,10);
	    empWageBuilder.computeEmpWage();
	  }
	}
