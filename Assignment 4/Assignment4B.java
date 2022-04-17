/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 4B
*/
import java.util.Scanner;
public class Assignment4B {
    public static void main(String[] args) {
        int n;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a width");
            n = sc.nextInt();
            if(n>4) {
                if(n%2==0){
                    n=n+1;
                    System.out.println("To make a diamond, we’ll use "+n+ " as the width instead.");
                }
                n = n / 2 + 1;
                for (int i = 1; i < n; i++) {
                    for (int j = i; j <= n; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j < i; j++) {
                        System.out.print("*");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i; j < n; j++) {
                        System.out.print("*");
                    }
                    for (int j = i; j <= n; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else if(n<2){
                System.out.println("Please enter a width of at least 3.");
                continue;
            }
        }while(n<2);
    }
}



