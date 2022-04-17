/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 9A
*/
import java.util.Scanner;
public class Lab9C {
    public static void main(String [] args){
        int row,col,rowCol,i=0,j=0;
        Scanner sc=new Scanner (System.in);
        //asking user to input stuff and telling them what they input
        System.out.print("Please enter the number of rows: ");
        row=sc.nextInt();
        System.out.print("Please enter the number of columns: ");
        col=sc.nextInt();
        rowCol=row*col;
        System.out.println("I have "+row+" rows and "+col+" columns. I need to fill-up "+(rowCol)+" spaces.");
        System.out.println("The "+row+"x"+col +" array:");
        //2d not flatten
        int[][]nbyn=new int[row][col];
        for(i=0;i<row;i++) {
            for( j=0;j<col;j+=1){
                nbyn[i][j]=(i*col)+j+1;
                System.out.print(nbyn[i][j]+"|");
            }
            System.out.println("");
        }
        //2d array flatten
        int[]rC=new int[rowCol];
        System.out.println("The "+row+"x"+col +" 2-D array flattened into a "+(rowCol)+" cell 1-D array:");
        for(int h=0;i<(rC.length);h++) {
            if (h == rowCol) {
                break;
            }
            rC[h] = (h + 1);
            System.out.print(rC[h] + "|");
        }
    }
}