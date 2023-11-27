package Lessons;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] myArray = {10, 20, 30, 40, 50, 40, 10, 20, 30, 40, 50, 40};
        int firstelement = array[1];
        int lengthofarray = myArray.length;
        double[] doublesArray = {1.1, 1.2, 1.3, 1.4, 1.5};
        double firsetelementDouble = doublesArray[0];
        double secondelementDouble = doublesArray[doublesArray.length - 1];


        System.out.println(firsetelementDouble);
        System.out.println(secondelementDouble);
    }
}
