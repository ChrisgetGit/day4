public class A8 {

    public static void main(String[] args) {

        double[] myArray = {1, 3, 4, 5, 6, 7, 8, 9, 12};

        double newi = 0;
        for (int i = 0; i < myArray.length; i++) {
            newi += myArray[i];
        }
        System.out.println("The mean of this array is " + newi/myArray.length);


    }
}
