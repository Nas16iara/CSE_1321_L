/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 3C
*/
import java.util.Scanner;
class Lab3C {
  public static void main(String[] args) {

    final int CONVERSION= 100;

    System.out.print("Enter the number of quarters: ");
    Scanner sc=new Scanner(System.in);
    int quarters=sc.nextInt();

    System.out.print("Enter the number of dimes: ");
    int dimes=sc.nextInt();

    System.out.print("Enter the number of nickels: ");
    int nickels=sc.nextInt();

    System.out.print("Enter the number of pennies: ");
    int pennies=sc.nextInt();

    System.out.println("You entered "+quarters+ " quarters.");
    System.out.println("You entered "+dimes+ " dimes.");
    System.out.println("You entered "+nickels+ " nickels.");
    System.out.println("You entered "+pennies+ " pennies.");

    quarters= quarters*25; //25= amount of cents
    dimes= dimes*10; //10= amount of cents
    nickels= nickels*5; //5 is the amount of cents
    pennies=pennies*1; // 1 is the amount of cents

    int dollars= (quarters+dimes+nickels+pennies)/CONVERSION;
    int cents= (quarters+dimes+nickels+pennies)%CONVERSION;
    
    System.out.println("Your total is "+dollars +" dollars and "+cents+" cents.");
  }
}