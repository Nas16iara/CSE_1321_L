/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 12A
*/
import java.util.Scanner;
public class Lab12A {
    public static void helloWorld() {
        System.out.println("Hello!");
    }
    public static void goodbyeMoon() {
        System.out.println("Ok, bye.");
    }
    public static void walkingOnSunshine() {
        System.out.println("WHOA!");
    }
    public static void userChoice(int userChoice){
        if (userChoice == 0) {
            helloWorld();
        } else if (userChoice == 1) {
            goodbyeMoon();
        } else if(userChoice==2) {
            walkingOnSunshine();
        }
    }
    public static void menu(){
        System.out.print("\nMenu\n"+
                    "0 – Hello World\n"+
                    "1 – Goodbye Moon\n"+
                    "2 – Walking on Sunshine\n");
        System.out.print("What would you like to do: ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yes;
        do {
            menu();
            userChoice(sc.nextInt());
            System.out.print("Type “Yes” to rerun.");
            yes = sc.next();
        } while (yes.equalsIgnoreCase("yes"));
        System.out.println("\nProgram Ends");
    }
}
