package EmployeeWageProblem;

public class EmpWage_UC4 {
    static final int Is_Full_Time = 1;
    static final int Is_Part_Time = 2;
    static final int Emp_Wage_Hrs = 20;

    public static void main(String[] args) {
        System.out.printf("Welcome Employee Wage Program");

        int wage = 0;
        int empHrs = 0;
        int monthlyWage = 0;
        int totalHrs = 0;
        int workingDays = 0;

        while(totalHrs<100 && workingDays<20)  {

            int empCheck = (int)(Math.random() * 3);

            switch (empCheck) {
                case Is_Full_Time:
                    System.out.println("The Employee is Working full time"+"\n");
                    empHrs = 8;
                    workingDays++;
                    break;
                case Is_Part_Time:
                    System.out.println("Employee is Working part time"+"\n");
                    empHrs = 4;
                    workingDays++;
                    break;
                default:
                    System.out.println("Employee is Absent" +"\n");
                    empHrs = 0;
                    workingDays++;
            }

            wage = empHrs * Emp_Wage_Hrs;
            totalHrs = totalHrs + empHrs;
            monthlyWage = monthlyWage + wage;

            System.out.println("The employee wage is  " + wage + "\n");
        }
        System.out.printf("Employee Total Working Hrs is" + totalHrs + "\n");
        System.out.println("Employee Monthly Wage is" + monthlyWage + "\n");
    }}
