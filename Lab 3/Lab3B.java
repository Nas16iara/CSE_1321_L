/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 3B
*/
import java.util.Scanner;
class Lab3B {
  public static void main(String[] args) {
    
    System.out.print("Course 1 hours: ");
    Scanner sc=new Scanner(System.in);
    float hour1=sc.nextFloat();

    System.out.print("Grade for course 1: ");
    float grade1=sc.nextFloat();

    System.out.print("Course 2 hours: ");
    float hour2= sc.nextFloat();

    System.out.print("Grade for course 2: ");
    float grade2= sc.nextFloat();

    System.out.print("Course 3 hours: ");
    float hour3= sc.nextFloat();

    System.out.print("Grade for course 3: ");
    float grade3= sc.nextFloat();

    
    System.out.print("Course 4 hours: ");
    float hour4= sc.nextFloat();

    System.out.print("Grade for course 4: ");
    float grade4= sc.nextFloat();

    float totalHours= hour1+hour2+hour3+hour4;
    System.out.println("Total hours is: "+totalHours);

    float QP=(grade1*hour1)+(grade2*hour2)+(grade3*hour3)+(grade4*hour4);
    System.out.println("Total Quality points is: "+QP);

    float gpa= QP/totalHours;
    System.out.print("Your GPA for this semester is "+gpa);



  }
}