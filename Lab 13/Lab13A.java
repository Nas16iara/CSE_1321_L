import java.util.Scanner;
public class Lab13A {
    public static void main(String []args){
        int n;
        String m;
        boolean r;
        Scanner sc=new Scanner(System.in);
        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        n=sc.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        r=sc.nextBoolean();
        System.out.print("What is your chair made of: ");
        m= sc.next();
        String roller;
        Chair yourChair= new Chair(n,m,r);
        if(yourChair.rolling){
            roller="rolling";
        }
        else {
            roller="not rolling";
        }
        System.out.println("Your chair has "+ yourChair.numOfLegs +" legs, is "+roller+", and is made of "+yourChair.material+".");
        System.out.println("This program is going to change that.");
        yourChair.numOfLegs=4;
        yourChair.rolling=false;
        yourChair.material="wood";
        if(!yourChair.rolling){
            roller="not rolling";
        }
        else {
            roller="rolling";
        }
        System.out.println("Your chair has "+ yourChair.numOfLegs +" legs, is "+roller+", and is made of "+yourChair.material+".");


    }
}