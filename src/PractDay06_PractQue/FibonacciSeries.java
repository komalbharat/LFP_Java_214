package PractDay06_PractQue;
//Fibonacci series is a special type of series in which the next term is the sum of the
//previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
//the next term will be 1(0+1).


public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10 ,firstTerm=0,secondTerm=1;
        System.out.printf(" Fibonacci Series till " + n + " Terms ");

        for(int i =1 ;i<=n; i++){
            System.out.printf(firstTerm+ " ,");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
