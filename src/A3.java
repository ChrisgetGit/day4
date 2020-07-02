import java.util.*;

public class A3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int s = in.nextInt();
        System.out.println("You entered: " + s);
        System.out.println("Enter second number: ");
        int i = in.nextInt();
        System.out.println("You entered: " + i);

        System.out.println("odd numbers are: ");



        for (; s < i; s = s + 2) {
            if (s % 2 ==1) {
                System.out.print(s + " ");
            }
            else if (s % 2 == 0) {
                System.out.print(s + 1 +" ");
            }
        }
    }
}
