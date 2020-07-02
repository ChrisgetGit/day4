import java.util.*;

public class A7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int length = 10;
        int [] myArray = new int[length];
        System.out.println("Enter 10 elements for reversing:");

        for(int i=0; i<length; i++ ) {
            myArray[i] = s.nextInt();
        }

        for (int rev = myArray.length-1; rev >= 0; rev--) {
            System.out.print(myArray[rev] + " ");


        }
    }

}
