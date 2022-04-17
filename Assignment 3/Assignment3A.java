import java.util.Scanner;
class Assignment3A {
    public static void main(String[] args) {
        int s;
        double a; //S stands for Scrappy doll and a for amount//
        String answer; //answer is yes or no//

        System.out.println("Welcome to the KSU Bookstore!");
        Scanner sc=new Scanner(System.in);
        System.out.print("Do you want to purchase Scrappy dolls?:");
        answer= sc.nextLine();

        if(answer.equalsIgnoreCase("yes")){
            System.out.print("How many Scrappy dolls do you want to buy?:");
            s=sc.nextInt();
            if(s>=1 && s<5){
                System.out.print(s+ " Scrappy dolls cost $"+2*s+".00. Thank you!\n"+"Have a nice day!\n");
                a=sc.nextDouble();
            }
            else if (s>5){
                System.out.println("You earned a 10% discount for buying in bulk!");
                System.out.print(s+ " Scrappy dolls cost $"+(2*s-(2*s*0.1))+ "0. Thank you!\n"+"Have a nice day!\n");
                a=sc.nextDouble();
            }
            else{
                System.out.print("Have a nice day!");
            }
        }
        else{
            System.out.print("Have a nice day!");
        }

    }
}
