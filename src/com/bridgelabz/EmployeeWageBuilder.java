package com.bridgelabz;

//import java.util.Random;

import java.util.Random;

public class EmployeeWageBuilder {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME=1;
    public static final int EMP_RATE_PER_HOUR = 20;

    public static void main(String args[])  {
        System.out.println("Welcome to Employee Wage Computation");

        int empHours = 0;
        int empWage = 0;
       Random random = new Random();
        int empCheck = random.nextInt(2);
        switch (empCheck){
            case IS_FULL_TIME:
                empHours = 8;
                break;
            case IS_PART_TIME:
                empHours = 4;
                break;
            default:
                empHours = 0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("The daily wages of an employee is : " + empWage);

    }
}
