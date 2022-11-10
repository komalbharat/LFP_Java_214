package PractDay02_PractQue;

public class ReverceIntNum {
    public static void main(String[] args) {

        int num = 231, reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;//231%10=3
            reversed = reversed * 10 + digit;
            //0 * 10 + 4 = 0 + 4 = 4
            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
