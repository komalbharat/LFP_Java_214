package PractDay03_PractQue;

public class LargestElememtArray {
    public static void main(String[] args){
        int[] arr=new int[] {25,11,7,74,90};
        int max = arr[0];
        for (int i=0; i<arr.length; i++){ //i less than arr length for int length
            if(arr[i]> max) //i grater than max
                max =arr[i];

        }
        System.out.println("Largest element present in given array:" + max);
    }

}
