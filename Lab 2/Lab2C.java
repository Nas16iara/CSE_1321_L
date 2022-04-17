/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 1B
*/
import java.util.Scanner;
public class Lab2C {
    public static void main(String [] args){
        int width, height, perimeter, area;

        System.out.print("Enter a width: ");
        Scanner sc= new Scanner(System.in);
        width=sc.nextInt();

        System.out.print("Enter a height: ");
        height=sc.nextInt();

        area= width*height;
        System.out.println("The area is "+area);
        perimeter= 2*(width+height);
        System.out.print("The perimeter is "+perimeter);

    }
}
