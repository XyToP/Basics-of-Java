package Lessons;
//import java.math.*;

import java.util.Random;

public class HomeWork_2 {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        int r=5;
        int c=a+b;

        System.out.println(c);
        int z=a-b;
        System.out.println(z);
        double v=a%b;
        System.out.println(v);
        int n=a*b;
        System.out.println(n);
        double squareRectangle = Math.sqrt(c);

        //Create a simple program that calculates and prints the square of a rectangle and a circle. Import and use Math class.
        System.out.println("squareRectangle " + squareRectangle);
        double areaofcyrcle = Math.sqrt(Math.PI)*r;
        System.out.println("areaofcyrcle "+ areaofcyrcle);
//Create an array of 10 integers. Fill this array using for-loop with random numbers.
// Print all the elements of this array to the console. Each element from the new line.
        int[] array = new int[10];
        Random random = new Random();

        for (int i=0; i < 10; i++){
            array[i]= random.nextInt(100);
        }
        System.out.println("array:");
        for (int number : array){
            System.out.println(number + " ");
        }

        //Create an array of 10 integers. Find the square root of each element and put the to result array.
        // Print the result array to the console.
        int[] array2 ={123,4123,123,523,123,12351,123,132,2332,523523,411431,124};
        System.out.println("array Square:");
        for (int number2 : array2) {
            System.out.println(Math.sqrt(number2) + " ");
        }
            //boolean

            int min = (a<b) ? a : b;
            System.out.println("min :"+min);

            //Create a program that calculates the factorial of an integer value n
    }


}
