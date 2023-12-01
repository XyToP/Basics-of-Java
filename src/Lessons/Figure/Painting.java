package Lessons.Figure;

public class Painting {
    public static void main(String[] args) {

            int height = 6; // Height of the figure
            int width = 8;  // Width of the figure

            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    // Print asterisks for the first and last rows, and for the first and last columns
                    if (i == 1 || i == height || j == 1 || j == width) {
                        System.out.print("*");
                    } else {
                        // Print spaces for the inner part of the figure
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Move to the next line after printing each row
            }
        }
    }
        /*//a
        String z="*";
        String s=" ";
        int y=1;
//        for (int j = 0; j < 8; j++){
//            System.out.println();
//        for (int i = 0; i < 8; i++) {
//            System.out.print(z);
//        }}
        //b

while (y<5){

    y++;
        for (int j = 0; j < 8; j++){
            if (j>0 && j<7){
                System.out.print(s);
        }
else System.out.print(z);
        }System.out.println();}}*/


