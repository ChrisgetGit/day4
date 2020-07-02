// A10. Write a Java program to remove a specific element from an array.

import java.util.Scanner;

public class A10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] intArr = {1, 2, 5, 12, 7, 3, 8};
        int[] newArr = null;
        System.out.print("Enter element to be deleted : ");
        int elem = in.nextInt();

        for(int i = 0; i < intArr.length; i++){
            if(intArr[i] == elem){
                newArr = new int[intArr.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = intArr[index];
                }
                for(int j = i; j < intArr.length - 1; j++){
                    newArr[j] = intArr[j+1];
                }
                break;
            }
        }
        System.out.println("remaining 5elements" );
        for(int i = 0; i < newArr.length; i++){
            System.out.print(" " + newArr[i]);
        }
    }
}