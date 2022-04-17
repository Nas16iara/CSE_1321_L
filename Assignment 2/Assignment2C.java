/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 2C
*/
import java.util.Scanner;
public class Assignment2C {
        public static void main(String[] args) {
            final double BRITISH_POUND = 0.73;
            final double BISON_DOLLAR= 5;

            System.out.println("Welcome to Bisonica!");

            System.out.print("How many US dollars do you have?");
            Scanner sc= new Scanner(System.in);
            int usDollars= sc.nextInt();

            double britishPounds= (double)(usDollars*BRITISH_POUND);
            double bisonDollar= (britishPounds/BISON_DOLLAR);
            System.out.print(usDollars+" US Dollar(s) is "+ britishPounds+" British Pound(s),which is "+bisonDollar +" Bison Dollar(s)!");

        }
    }