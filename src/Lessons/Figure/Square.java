package Lessons.Figure;

public class Square {
    public static void main(String[] args) {
        int height = 8; // Height of the rectangle
        int width = 8;  // Width of the rectangle

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
