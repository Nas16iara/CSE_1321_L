/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 4B
*/
import java.util.Scanner;
public class Lab4B {
    public static void main(String [] args){
        String day;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the day:");
        day=sc.nextLine();

        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Wednesday")){
            System.out.print("I have class today!");
        }
        else if(day.equalsIgnoreCase("Friday")){
            System.out.print("It’s Friday! Friday! Gotta get down on Friday! ");
        }
        else {
            System.out.print("I should use this time to do my homework.");
        }
    }


}

