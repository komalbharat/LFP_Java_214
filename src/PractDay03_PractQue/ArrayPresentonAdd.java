package PractDay03_PractQue;

public class ArrayPresentonAdd {
    public static void main(String[] args) {
            //Initialize array
            int [] arr = new int [] {1, 2, 3, 4, 5};
            System.out.println("Elements of given array present on odd position: ");
            //Loop through the array by incrementing value of i by 2
            for (int i = 0; i < arr.length; i = i+2) { //it will give odd number which not divide by 2

                System.out.println(arr[i]);
            }
        }
}
