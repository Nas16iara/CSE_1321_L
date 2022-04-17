import java.util.Scanner;
public class Assignment3C {
    public static void main(String[] args) {
        String indoorOutdoor;
        double dues;
        Scanner sc = new Scanner(System.in);
        System.out.println("[KSU Club Suggestions]");

        System.out.print("Do you want an indoor or outdoor club?: ");
        indoorOutdoor = sc.nextLine();
        if (indoorOutdoor.equalsIgnoreCase("neither")){
            System.out.print("Sorry, that’s not a valid option.");}
        else {
            System.out.print("How much are you willing to pay in dues?:");
            dues = sc.nextDouble();
            if (indoorOutdoor.equalsIgnoreCase("Indoor") && dues <= 5) {
                System.out.print("You could join the Chess club!");}
            else if (indoorOutdoor.equalsIgnoreCase("Indoor") && dues <= 15) {
                    System.out.print("You could join the Virtual Reality club!");
                }
            else if(indoorOutdoor.equalsIgnoreCase("outdoor") && dues <= 5) {
                    System.out.print("You could join the Running club!");
                }
            else if(indoorOutdoor.equalsIgnoreCase("outdoor") && dues <= 25) {
                    System.out.print("You could join the Medieval Combat Sports club!");
                }
            }
        }

        }

