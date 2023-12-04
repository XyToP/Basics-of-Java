package Lessons;
//import java.math.*;

import java.util.Random;

public class HomeWork_2 {
    static int test (int testval, int target){
        if (testval>target) return + 1;
        if (testval<target) return - 1;
        return 0;
    }
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
            //return
        System.out.println(test(5,5));
        //break and continue
        for (int i=0; i < 100; i++){
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
        //SWITCH
        char Switch='B';
        switch(Switch){
            case 'A':
                System.out.println("A"); break;
            case 'B':
                System.out.println("B"); break;
            case 'C':
                System.out.println("C"); break;
            default:
                System.out.println("Default");
        }
            //Create a program that calculates the factorial of an integer value n
        int число = 5;

        int fact=1;

        for (int i = 1; i <=число; i++){
            fact=i*fact;
            System.out.println("factorial of "+число+"="+fact);
        }

        //7
        int[] array10 = {10, 2, 2, 2, 2, 2, 2, 2, 2, 10};
        int sum=0;
        for (int i=1; i<array10.length-1; i++){
             sum+=array10[i];
        }
        System.out.println("summa= " + sum);

    }


}
