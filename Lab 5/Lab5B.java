import java.util.Scanner;
public class Lab5B {
    public static void main(String [] args){
        int integer;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer:");
        integer=sc.nextInt();

        if (integer%2==0){
            System.out.print("This number is divisible by 2");
        }
        else if(integer%3==0) {
            System.out.print("This number is divisible by 3");
        }
        else if(integer%5==0) {
            System.out.print("This number is divisible by 5");
        }
        else{
            System.out.print("This number is undetermined");
        }
        }

        }

