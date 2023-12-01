package Lessons.Figure;

public class Piramida {
    public static void main(String[] args) {

        int rows = 5; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the asterisks
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print asterisks for each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

}
