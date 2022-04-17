import java.util.Scanner;
public class Lab6C {
    public static void main(String [] args){
        int accountB=1000, selection=-1,dep, wit; //dep and wit is deposit and withdrawal
        char yN;//yN is yes or no string
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome!\nYou have $1000 in your account.");//welcome
            do {
                System.out.println("Menu\n" +
                        "0 - Make a deposit\n" +
                        "1 - Make a withdrawal\n" +
                        "2 - Display account value\n" +
                        "Please make a selection: ");
                selection = sc.nextInt();// menu selection
                if (selection == 0) {
                    System.out.println("How much would you like to deposit? :");
                    dep = sc.nextInt();
                    accountB = (accountB + dep);
                    System.out.println("Your current balance is $" + accountB);

                    //number 0 is the same thing but instead make a deposit
                } else if (selection == 1) {
                    System.out.println("How much would you like to withdraw? :");
                    wit = sc.nextInt();
                    accountB = (accountB - wit);
                    System.out.println("Your current balance is $" + accountB);
                }// number 1 is selected prompt user t o make a withdrawal and then ask to return to main menu or quit
                else if (selection == 2) {
                    System.out.println("Your current balance is $" + accountB);
                }//number 2 is to display account value
                else {
                    System.out.println("Invalid entry, please try again");
                }// any number more than 2 or less than 0 display error
                System.out.println("Would you like to return to the main menu (Y/N)? :");
                yN = sc.next().charAt(0); //selection menu return
            }while(yN=='y');

        System.out.print("Thank you for banking with us!");// after the user quit exit statement
    }
}
