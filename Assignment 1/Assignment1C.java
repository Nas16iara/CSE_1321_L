/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 1B
*/

import java.util.Scanner;
public class Assignment1C {
    public static void main(String [] args) {
        String street,color,food;

        System.out.print ("Enter the name of the street you live on: ");
        Scanner sc= new Scanner(System.in);
        street=sc.nextLine();
        System.out.print("Enter the name of your favorite color: ");
        color=sc.nextLine();
        System.out.print ("Enter the name of your favorite food: ");
        food=sc.nextLine();

        System.out.print("Your stage name is "+street+" "+color+" "+food+" !");
    }
}
