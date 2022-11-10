package PractDay02_PractQue;
//Write a Program to find Palindrome Number
//eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
//eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.
import java.util.Scanner;

public class Palidrome {
    public static void main(String args[])
    {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);//to take input from the user
        System.out.println("Enter a number to check if it is a palindrome");
        original = in.nextLine();//current line and returns the input that was skipped
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered number is a palindrome.");
        else
            System.out.println("Entered number isn't a palindrome.");
    }
}

