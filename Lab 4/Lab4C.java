/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 4C
*/
import java.util.Scanner;
public class Lab4C {
    public static void main(String [] args) {
        double numbers;
        int options;
        Scanner sc= new Scanner (System.in);

        System.out.println("Welcome!");
        System.out.print("Please input a number:");
        numbers=sc.nextDouble();
        System.out.print("What would you like to do to this number:\n" +
                "0- Get the additive inverse of the number\n" +
                "1- Get the reciprocal of the number\n" +
                "2- Square the number\n" +
                "3- Cube the number\n" +
                "4- Exit the program " +
                "");
        options=sc.nextInt();

        switch (options){
            case 0:
                System.out.print("The additive inverse of "+numbers+" is "+numbers*-1);
                break;
            case 1:
                System.out.print( "The reciprocal of "+numbers+" is "+1/numbers);
                break;
            case 2:
                System.out.print("The square of "+numbers+" is "+numbers*numbers);
                break;
            case 3:
                System.out.print("The cube of "+numbers+" is "+numbers*numbers*numbers);
                break;
            case 4:
                System.out.print("Thank you, goodbye!”.");
                break;
            default:
                System.out.print("Invalid input, please try again!");
        }

    }
}
