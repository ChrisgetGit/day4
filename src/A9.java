//A9. Write a Java program to find the index of an array element.

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {

        int[] myArray = {1, 3, 4, 5, 6, 7, 8, 9, 12};

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Index to find: ");
        int targetIndex = in.nextInt();



        for (int i = 0; i < myArray.length; i++) {
            if (i == targetIndex) {
                System.out.println("At index " + targetIndex +" is number "+ myArray[i]);
            }


        }
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter Element to find: ");
        int targetElement = in2.nextInt();

        for (int i = 0; i < myArray.length; i++) {
            if (targetElement == myArray[i]) {
                System.out.println("Target element is at index " +i);
            }
//            else {
//                System.out.println("Element is not inside the array");
        }


    }
}
