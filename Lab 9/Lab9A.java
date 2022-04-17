/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 9A
*/
import java.util.Scanner;
public class Lab9A {
    public static void main(String [] args){
        int row,col,j=0,i=0;
        Scanner sc=new Scanner (System.in);
        System.out.print("Please enter the number of rows:");//First I want to ask the user how many rows and column
        row=sc.nextInt();
        System.out.print("Please enter the number of columns:");//Next I want to be able to read them in
        col=sc.nextInt();
        col=col;
        System.out.println("I have "+row+" rows and "+col+" columns. I need to fill-up "+(row*col)+" spaces.");
        System.out.println("The "+row+"x"+col +" array:");
        int[][]nbyn=new int[row][col];
        for( i=0;i<row;i++) {// After that I want to be able to read the row we enter
            for( j=0;j<col;j+=1){
                nbyn[i][j]=(i*col)+j+1;
                System.out.print(nbyn[i][j]+"|");

        }
            System.out.println("");
        }
    }
}