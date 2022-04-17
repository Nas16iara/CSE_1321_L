/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 7A
*/
import java.util.Scanner;
public class Lab7A {
    public static void main(String[] args) {
        int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a value for the size: ");
            n = sc.nextInt();
            System.out.println("This is the requested "+n+"x"+n+" box:");
            for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

                System.out.print("*");}
                System.out.println("");
            }
        }
    }