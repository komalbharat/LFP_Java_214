package EmployeeWageProblem;

public class EmpWage_UC2 {
    public static void main(String[] args) {
        System.out.printf("Welcome to Employee wage" +"\n");
        int wage = 0;
        int WagePerHrs = 20;
        int employeeHr =(int) (Math.random()*3);

        if(employeeHr == 8){
            System.out.printf("The Employee is Present" +"\n");
        }
        else if (employeeHr == 4){
            System.out.printf("The Employee is Part Time" +"\n");
        }
        else {
            System.out.printf("The Employee is Absent" + "\n");
        }
        wage = employeeHr * WagePerHrs;
        System.out.printf("The Employee wage is " + wage);
    }
}
