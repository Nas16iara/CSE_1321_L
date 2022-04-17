/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 1B
*/
import java.util.Scanner;
public class Assignment1A {
    public static void main(String [] args) {
        float red, green, blue, Alpha;
        final float MAX_RGB_VALUE = 255;
        final float MAX_ALPHA_VALUE = 100;

        System.out.print("Enter a red value (0-255): ");
        Scanner sc = new Scanner(System.in);
        red = sc.nextFloat();

        System.out.print("Enter a green value (0-255): ");
        green = sc.nextFloat();

        System.out.print("Enter a blue value (0-255): ");
        blue = sc.nextFloat();

        System.out.print("Enter a Alpha value (0-100): ");
        Alpha = sc.nextFloat();

        red= red/MAX_RGB_VALUE;
        green=green/MAX_RGB_VALUE;
        blue=blue/MAX_RGB_VALUE;
        Alpha=Alpha/MAX_ALPHA_VALUE;

        System.out.print("New color is red="+red+", green="+green+", blue="+blue+", alpha="+Alpha);
    }
}