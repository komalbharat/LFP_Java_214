package PractDay02_PractQue;
import java.util.*;

public class CheckConts {
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("\n Enter Character: ");
        char c=((inp.nextLine()).charAt(0));//charAt it will start index with 0
        char z=Character.toUpperCase(c); //Changing Value to UpperCase for uniformity.

        switch(z) //Checking Vowel Character using Switch Case
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println(c+" is a Vowel.");
                break;

            default: System.out.println(c+" is a Not-Vowel");
        }

    }

}
