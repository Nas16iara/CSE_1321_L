/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 2B
*/
import java.util.Scanner;
class Assignment2B {
        public static void main(String[] args) {

            System.out.print("Enter the hit box top-left X coordinate: ");
            Scanner sc= new Scanner(System.in);
            int topLX= sc.nextInt();

            System.out.print("Enter the hit box top-left Y coordinate: ");
            int topLY= sc.nextInt();

            System.out.print("Enter the width of the hit box:");
            int width= sc.nextInt();

            System.out.print("Enter the height of the hit box: ");
            int height= sc.nextInt();

            System.out.println("[Hit Box Coordinates]");

            System.out.println("Top-Left: "+topLX+ ","+topLY);

            System.out.println("Bottom-Left: "+topLX+ ","+(height-topLY));

            System.out.println("Top-Right: "+width+","+height);

            System.out.print("Bottom-Right: "+(width-topLX)+","+(height-topLY));



        }
    }