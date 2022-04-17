/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 1B
*/
import java.util.Scanner;
public class Assignment1B {
    public static void main(String [] args){
        int SUB_FEE, CUSTOMER,week,year;
        final int WEEK = 52;

        System.out.print("Enter the weekly subscription:");
        Scanner sc = new Scanner(System.in);
        SUB_FEE=sc.nextInt();
        System.out.print("Enter the number of customer: ");
        CUSTOMER=sc.nextInt();

        year= (SUB_FEE*CUSTOMER);
        week= (SUB_FEE*CUSTOMER*WEEK);

        System.out.println("This company earns $"+year+" each year.");
        System.out.print("This company earns $"+week+" each week.");
    }

}
