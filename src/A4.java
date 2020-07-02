import java.util.*;

public class A4 {

    public static void main(String[] args) {

        Scanner inn = new Scanner(System.in);

        System.out.println("Enter the number you want to sum: ");
        int nr1 = inn.nextInt();
        System.out.println("You entered: " + nr1);


        int totalsum= 0;

        for (int nr2 = 1; nr2 <= nr1; nr2++ ){
            totalsum += nr2;

        }System.out.println("Sum is: " +totalsum);
    }
}
