
/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 4A
*/
import java.util.Scanner;
public class Lab4A {
    public static void main(String [] args){
        double grade;

        System.out.print("Enter the score of your exam:");
        Scanner sc= new Scanner (System.in);
        grade=sc.nextDouble();

        if(grade>97&&grade<=100){
            System.out.print("Letter grade is: A+");
        }
        else if (grade>94) {
            System.out.print("Letter grade is: A");
        }
        else if (grade>91) {
            System.out.print("Letter grade is: A-");
        }
        else if (grade>88) {
            System.out.print("Letter grade is: B+");
        }
        else if (grade>85) {
            System.out.print("Letter grade is: B");
        }
        else if (grade>82) {
            System.out.print("Letter grade is: B-");
        }
        else if (grade>79) {
            System.out.print("Letter grade is: C+");
        }
        else if (grade>76) {
            System.out.print("Letter grade is: C");
        }
        else if (grade>73) {
            System.out.print("Letter grade is: C-");
        } else if (grade>70) {
            System.out.print("Letter grade is: D+");
        }
        else if (grade>67) {
            System.out.print("Letter grade is: D");
        }
        else if (grade>64) {
            System.out.print("Letter grade is: D-");
        }
        else {
            System.out.print("Letter grade is: F");
        }

    }
        }