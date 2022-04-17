/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 11A
*/
import java.util.Scanner;
public class Lab11A {
    public static int max(int x,int y){
        int max;
        if(x>y){
            max=x;
        }
        else {
            max=y;
        }
        return max;
    }
    public static int min(int x,int y){
        int min;
        if(x<y){
            min=x;
        }
        else{
            min=y;
        }
        return min;
    }
    public static double average(int x,int y){
        double average=(double)(x+y)/2;
        if(average % 1 == 0){
            int averInt= (int)average;
            System.out.print("Average is "+averInt);
     }return average;
    }
    public static void main(String []args){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        x=sc.nextInt();
        System.out.print("Enter number 2: ");
        y=sc.nextInt();
        System.out.println("Min is "+min(x,y));
        System.out.println("Max is "+max(x,y));
        if(average(x,y)% 1 != 0){
        System.out.print("Average is "+average(x,y));}
    }
}