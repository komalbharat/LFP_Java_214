package EmployeeWageProblem;

/*Check Employee is Present or Absent Use ((RANDOM)) for Attendance Check*/

import java.lang.Math;

public class EmpWage_UC1 {
    public static void main(String[] args) {

        System.out.printf(" Welcome to Employee Wage Computation" + "\n" );

        int employeeHrs = (int) (Math.random()*2); // generating random num which Mul by 3

        if (employeeHrs == 1) {
            System.out.printf("The Employee is Present");
        } else {
            System.out.printf("The Employee is Absent ");
        }}

}