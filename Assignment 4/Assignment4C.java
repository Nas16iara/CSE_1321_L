/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 4C
*/
import java.util.Random;
import java.util.Scanner;
public class Assignment4C {
    public static void main(String[] args) {
        int c, heads=0, tails=0;
        float hPercent, tPercent;
        Scanner sc=new Scanner(System.in);
        Random rand= new Random();

        System.out.print("How many times do you want to flip the coin?: ");
        c=sc.nextInt();

        for(int i=0; i<c;i++){
            if(rand.nextInt(2)==0){
                heads=heads+1;
            }
            else{
                tails=tails+1;
            }
        }
        hPercent= (float) heads/c;
        tPercent=(float) tails/c;

        System.out.println("Heads – "+heads +" times ("+(hPercent)+"%)");
        System.out.println("Tails – "+tails+" times ("+(tPercent)+"%)");
        if(heads>tails){
            System.out.println("The coin lands on heads more often than tails!");
        }
        else if(heads<tails){
            System.out.println("The coin lands on tails more often than heads!");
        }
        else if(heads==tails){
            System.out.println("The coin is perfectly fair!");
        }
   }
}
