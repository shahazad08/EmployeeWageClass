package com.bridgelabz;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String args[])  {
        System.out.println("Welcome to Employee Wage Computation");
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHours = 0;
        int empWage = 0;
       Random random = new Random();
        int empCheck = random.nextInt(2);
        if (empCheck == IS_FULL_TIME){
            System.out.println("Employee is Present");
            empHours = 8;
        }
        else {
            System.out.println("Employee is Absent");
            empHours=0;
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("The daily wages of an employee is : " + empWage);

    }
}
