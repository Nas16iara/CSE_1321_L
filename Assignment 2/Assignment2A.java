/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 2A
*/
import java.util.Scanner;
class Assignment2A {
    public static void main(String[] args) {
        int seconds, minutes,hours, second;
        final int CONVERTING=60;

        System.out.print("How much time has passed (in seconds)?:");
        Scanner sc= new Scanner(System.in);
        seconds=sc.nextInt();
        System.out.println("Now converting...");

        hours=(seconds/CONVERTING)/CONVERTING;
        minutes=(seconds/CONVERTING)%CONVERTING;
        second=seconds%CONVERTING;

        System.out.print(seconds+" seconds is "+hours+ " hour(s)," +minutes+ " minute(s), and "+second+" second(s).");


    }
}
