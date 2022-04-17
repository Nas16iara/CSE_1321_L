/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 1B
*/
import java.util.Scanner;
public class Lab2A {
    public static void main (String [] args){
        String name1, name2, verb, adverb;

        System.out.print("Enter a name: ");
        Scanner sc= new Scanner(System.in);
        name1=sc.nextLine();

        System.out.print("Enter another name: ");
        name2=sc.nextLine();

        System.out.print("Enter a verb: ");
        verb=sc.nextLine();

        System.out.print("Enter an adverb: ");
        adverb=sc.nextLine();
        System.out.print("Once upon a time, there was a person named "+name1+" who had a child named " +
                name2+". This child would "+verb+ " "+adverb+" while singing to strangers.");
    }
}
