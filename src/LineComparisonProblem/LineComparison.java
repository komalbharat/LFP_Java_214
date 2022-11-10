package LineComparisonProblem;
import java.util.Scanner;
/*As a fan of geometry, I want to model a line based on a point consisting of (x, y)
co-ordinates using the Cartesian system, So that I can calculate its length. - A Length as*/

public class LineComparison {
    public static void main(String[] args) {
        System.out.printf(" Welcome To Line Comparison " + "\n");


        Scanner Sc = new Scanner(System.in);

        // input co=ordinate of line 1
        System.out.println("Enter the value of X1 in line 1");
        int x1 = Sc.nextInt();
        System.out.println("Enter the value of Y1 in line 1");
        int y1 = Sc.nextInt();
        System.out.println("Enter the value of X2 in line 1");
        int x2 = Sc.nextInt();
        System.out.println("Enter the value of Y2 in line 1");
        int y2 = Sc.nextInt();

        // input co=ordinate of line 1
        System.out.println("Enter the value of X1 in line 2");
        int a1 = Sc.nextInt();
        System.out.println("Enter the value of Y1 in line 2");
        int b1 = Sc.nextInt();
        System.out.println("Enter the value of X2 in line 2");
        int a2 = Sc.nextInt();
        System.out.println("Enter the value of Y2 in line 2");
        int b2 = Sc.nextInt();

        double length1 = Math.sqrt((double)((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("The line length 1 is :" + length1);
        double length2 = Math.sqrt((double)((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1)));
        System.out.println("The line length 2 is :" + length2);


        if(length1==length2){
            System.out.println("The length of line 1 (" +length1+ ") is equal to length 2 (" +length2+ ")");
        }else {
            System.out.println("The length of line 1 (" +length1+ ") is not equal to length 2 (" +length2+ ")");
        }
        if (length1 > length2) {
            System.out.println(" Line 1 is grater than line 2");
        } else if (length1 < length2) {
            System.out.println("Line 1 is shorter than line 2");
        } else {
            System.out.println("Both lines are equal ");
        }

    }
}
