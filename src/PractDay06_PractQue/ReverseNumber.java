package PractDay06_PractQue;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=232, reverse=0 ;
        while (number!=0){
            int remainder = number%10;
            reverse = reverse*10+remainder;
            number = number/10;
        }
        System.out.printf(" The Reverse Number Of Given Number"  + reverse);

    }
}
