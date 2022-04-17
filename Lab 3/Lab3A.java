/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 3A
*/
import java.util.Scanner;
class Lab3A {
  public static void main(String[] args) {
    float amountOwe, apr, precentageRate, minPayment;
    final float MONTH= 12;

    System.out.print("Amount owed: $");
    Scanner sc=new Scanner(System.in);
    amountOwe=sc.nextFloat();

    System.out.print("APR: ");
    apr=sc.nextFloat();

    precentageRate=apr/MONTH;
    System.out.println("Monthly percentage rate: "+precentageRate);

    apr=apr/100;
    minPayment=amountOwe*apr/MONTH;
    System.out.println("Minimum payment: $"+minPayment);
  }
}
