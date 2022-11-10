package PractDay02_PractQue;

public class NumberToWord {
    public static void main(String args[]){
        int n = 1101001000;
        int th,h,t,u; /// Thousands,hundreds,tens,units

        u=n%10; //n%10 means modulus of 10.
        t=(n/10)%10;
        h=(n/100)%10;
        th=(n/1000)%10;

        System.out.printf("Thousands = %d , Hundreds = %d , Tens = %d , Units = %d\n",th,h,t,u);
        //%d decimal number

    }
}
