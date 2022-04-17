import java.util.Scanner;
public class Assignment3B {
    public static void main(String [] args){
        int month,year;
        Scanner sc=new Scanner (System.in);
        System.out.print("What month of the year is it?:");
        month=sc.nextInt();

        switch (month){
            case 1:
                System.out.println("That is the month of January.");
                System.out.print("That month has 30 days in it!");
                break;
            case 2:
                System.out.println("That is the month of February.");
                System.out.print("What year is it?:");
                year=sc.nextInt();
                if(year%4==0){
                    System.out.print("In a leap year, that month has 29 days in it!");
                }
                else{
                    System.out.print("In a normal year, that month has 28 days in it!");
                }
                break;
            case 3:
                System.out.println("That is the month of March.");
                System.out.print("That month has 30 days in it!");
                break;
            case 4:
                System.out.println("That is the month of April.");
                System.out.print("That month has 31 days in it!");
                break;
            case 5:
                System.out.println("That is the month of May.");
                System.out.print("That month has 30 days in it!");
                break;
            case 6:
                System.out.println("That is the month of June.");
                System.out.print("That month has 31 days in it!");
                break;
            case 7:
                System.out.println("That is the month of July.");
                System.out.print("That month has 30 days in it!");
                break;
            case 8:
                System.out.println("That is the month of August.");
                System.out.print("That month has 30 days in it!");
                break;
            case 9:
                System.out.println("That is the month of September.");
                System.out.print("That month has 31 days in it!");
                break;
            case 10:
                System.out.println("That is the month of October.");
                System.out.print("That month has 30 days in it!");
                break;
            case 11:
                System.out.println("That is the month of November.");
                System.out.print("That month has 31 days in it!");
            case 12:
                System.out.println("That is the month of December.");
                System.out.print("That month has 30 days in it!");

        }
    }
}
