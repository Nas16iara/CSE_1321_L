import java.util.Scanner;
public class Lab6A {
    public static void main(String[] args) {
        int largest = 0;
        int numbX = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 10 numbers and this program will display the largest.");

        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Please enter number " + counter + ":");
            numbX = sc.nextInt();

            if (numbX == 0) {
                largest = numbX;
            } else if (numbX > largest) {
                largest = numbX;
            }
        }
        System.out.print("The largest number was " + largest);
    }
}
