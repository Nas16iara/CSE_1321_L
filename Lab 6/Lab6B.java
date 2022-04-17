import java.util.Random;
import java.util.Scanner;

public class Lab6B {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number = 0, tracker=0;

        System.out.println("Enter a number between 1 and 1000:");//enter a number between 1-1000
        int guess = sc.nextInt();
        if(guess>1001||guess<0 ){
            System.out.println("ERROR...");
        }
        else {
            while (guess < 1001 && guess > 0) {
                number = rand.nextInt(1000) + 1;//generate a random number until it matches
                System.out.println("My guess was "+ number);
                if (number == guess) {
                    break;
                }
                tracker = tracker + 1;
            }
            System.out.println("I guessed the number was " + guess + " and it only took me " + tracker + " guesses");
        }

    }
}//when the random number matches the userInput display "I guessed the number was.... and it took...guesses);



