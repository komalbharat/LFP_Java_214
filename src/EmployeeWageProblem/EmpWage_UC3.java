package EmployeeWageProblem;

public class EmpWage_UC3 {
    static final int Is_Full_Time = 1;
    static final int Is_Part_Time = 2;
    static final int Emp_Wage_Hrs = 20;

    public static void main(String[] args) {
        System.out.printf("Welcome Employee Wage Program");

        int wage = 0;
        int empHrs = 0;
        int monthlyWage = 0;

        for(int i = 0; i<20; i++) {

            int empCheck = (int)(Math.random() * 3);

            switch (empCheck) {
                case Is_Full_Time:
                    System.out.println("The Employee is Working full time"+"\n");
                    empHrs = 8;
                    break;
                case Is_Part_Time:
                    System.out.println("Employee is Working part time"+"\n");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent" +"\n");
                    empHrs = 0;
            }

            wage = empHrs * Emp_Wage_Hrs;
            System.out.println("The employee wage is  " + wage);


            monthlyWage += wage;
        }
        System.out.println(monthlyWage);
    }}
