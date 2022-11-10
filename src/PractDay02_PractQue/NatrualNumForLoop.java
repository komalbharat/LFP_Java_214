package PractDay02_PractQue;

public class NatrualNumForLoop {
    public static void main(String[] args)
    {
        int i, num = 5, sum = 0;
//executes until the condition returns true
        for(i = 1; i <= num; ++i)//it will check i less than 5
        {
//adding the value of i into sum variable //sum=sum+1 1+2+3+4+5
            sum = sum + i;
        }
//prints the sum
        System.out.println("Sum of First 5 Natural Numbers is = " + sum);//15
    }
}
