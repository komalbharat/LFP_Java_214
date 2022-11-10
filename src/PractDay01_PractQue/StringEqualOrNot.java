package PractDay01_PractQue;

public class StringEqualOrNot {
    public static void main(String args[]){
        String s1="komal";
        String s2="komal";
        String s3=new String("Avinash");
        String s4="komal";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
    }
}
