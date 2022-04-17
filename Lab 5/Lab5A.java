import java.util.Scanner;
public class Lab5A {
    public static void main(String [] args){
        String drivingLicense, drivingPermit;
        Scanner sc= new Scanner(System.in);

        System.out.print("Do you have a driving permit (Y/N)?");
        drivingPermit=sc.nextLine();

        if(drivingPermit.equalsIgnoreCase("n")) {
            System.out.print("Driving permit is a prerequisite to purchase a vehicle!");
        }
        else if(drivingPermit.equalsIgnoreCase("y")) {
            System.out.print("Do you have a commercial driving license (Y/N)?");
            drivingLicense = sc.nextLine();
            if (drivingLicense.equalsIgnoreCase("n")) {
                System.out.print("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
            else if(drivingLicense.equalsIgnoreCase("Y")){
                System.out.print("Congratulations! You can purchase a vehicle, let’s start talking options!");

            }
        }
        }

    }
