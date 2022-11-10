package PractDay06_PractQue;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        long n,  sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Any Number");
        n=sc.nextLong();  //its take input as a long

        int i=1;

        while (i<= n/2){               //here while check i less than n &  n/2
            if (n % i==0){             //if condition is true
                sum = sum +i;          // it will do addition
            }
            i++;
        }
        if(sum==n){                      // its will check ans sum=i means n/2 it should be match with sum
            System.out.printf(n + " is perfect number ");
        }
        else {
            System.out.printf(n + " is not perfect number");
        }
    }
}
