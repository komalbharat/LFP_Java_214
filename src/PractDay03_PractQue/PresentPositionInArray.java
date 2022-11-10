package PractDay03_PractQue;
//Java Program to print the elements of an array present on an even position
//INITIALIZE arr[] = {1, 2, 3, 4, 5},PRINT "Elements of given array present on even position:",REPEAT STEP 5 for(i=1; i< arr.length; i= i+2),PRINT arr[i]


public class PresentPositionInArray {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,6,3,4};
        System.out.println("Elements of given array present");
        for(int i=1; i<arr.length;i=i+2){
            System.out.println(arr[i]);// elements of an array present on an even position which is divided by 2
        }
    }
}
