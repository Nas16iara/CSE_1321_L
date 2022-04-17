/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 11B
*/
import java.util.Scanner;
public class Lab11B {
    public static boolean isValid(double width,double height){
        boolean valid=false;
        if((width+height)>30){
            valid=true;
        }
        return valid;
    }
    public static double area(double width,double height){
        double area=(width*height);
        return area;
    }
    public static double perimeter(double width,double height){
        double perimeter=(2*(width*height));
        return perimeter;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double width,height;
        char goAgain='n';
        do {
            System.out.print("Enter width:");
            width = sc.nextDouble();
            System.out.print("Enter height:");
            height = sc.nextDouble();
            if (!isValid(width, height)) {
                System.out.println("This is an invalid rectangle");
            }
            else {
                System.out.println("This is a valid rectangle");
                System.out.println("The area is: " + area(width, height));
                System.out.print("The perimeter is: " + perimeter(width, height));
            }
            System.out.print("\nDo you want to enter another width and height (Y/N)? : ");
            goAgain=sc.next().charAt(0);
        }while(goAgain=='y'||goAgain=='Y');
        System.out.print("Program Ends");
    }
}
