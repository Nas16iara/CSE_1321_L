/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 4A
*/
import java.util.Random;
import java.util.Scanner;
public class Assignment4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int round = 1; //round number
        int playerRand1, playerRand2, compRand; //Random number names
        int playerScore=0; // adds up random number 1+2
        char aRound, newGame; // yes or no another round and another game
        // Step one:generate 3 random numbers 1 for the computer and 2 numbers for the player
        do{
            if (round > 2) {
                System.out.println("Let’s play Bunco!");}

            playerRand1 = rand.nextInt(6) + 1;
            playerRand2 = rand.nextInt(6) + 1;
            compRand = rand.nextInt(30) + 1;

            //Step 2: Tell user their two rolls
            System.out.println("Round " + round + ": You rolled " + playerRand1 + " and " + playerRand2 + ".");
            //Step 3: Calculate the score using the rules of the game
            if (playerRand1 == round && playerRand2 == round) {
                playerScore = 21 + playerRand1 + playerRand2;
                System.out.print("Your score is " + (playerScore) + ".");}
            else if (playerRand2 == playerRand1 && playerRand1 != round && playerRand2 != round) {
                playerScore = 5 + playerRand1 + playerRand2;
                System.out.print("Your score is " + (playerScore) + ".");}
            else if ((playerRand2 == round && playerRand1 != round) || (playerRand2 == round && playerRand1 != round)) {
                playerScore = 1 + playerRand1 + playerRand2;
                System.out.print("Your score is " + (playerScore) + ".");}
            else {
                playerScore = playerRand1 + playerRand2;
                System.out.print("Your score is " + (playerScore) + ".");}
            //Step 9: If user is at round 6 then they have play all 6 rounds
            if (round == 6) {
                System.out.println(" You’ve played all six rounds ");
                if (compRand > playerScore) {
                    System.out.print("Okay, the computer’s score is... " + compRand + "!\n" +
                            "Sorry, you lose.\n");}
                //Step 8: If computer score is less than you win
                else {
                    System.out.print("Okay, the computer’s score is... " + compRand + "!\n" +
                            "You win!\n");}
                //Step 10: Ask if the user wants to play again
                System.out.print("Do you want to play again?:");
                newGame = sc.next().charAt(0);
                //Step 11: If user say yes then start at step one
                if (newGame == 'y' || newGame == 'Y') {
                    round = 1;
                    continue;}
                else if (newGame == 'n' || newGame == 'N') {
                    System.out.println("Game Over...");
                    break;}
            }

            //Step 3: Ask the user if they want to play another round
            System.out.print(" Do you want to stop?: ");
            aRound = sc.next().charAt(0);
            round++;
            //Step 4: If the user say yes, continue the round
            if (aRound == 'n' || aRound == 'N') {
                continue;}
            //Step 6: If Step 4 return false then compare the score of the computer
            else if (aRound == 'Y' || aRound == 'y') {
                //Step 7: If computer score is bigger than you lose
                if (compRand > playerScore) {
                    System.out.print("Okay, the computer’s score is... " + compRand + "!\n" +
                            "Sorry, you lose.\n");}
                //Step 8: If computer score is less than you win
                else {
                    System.out.print("Okay, the computer’s score is... " + compRand + "!\n" +
                            "You win!\n");}
            }
            //Step 10: Ask if the user wants to play again
            System.out.print("Do you want to play again?:");
            newGame = sc.next().charAt(0);
            //Step 11: If user say yes then start at step one
            if (newGame == 'y' || newGame == 'Y') {
                round = 1;}
            else if (newGame == 'n' || newGame == 'N') {
                System.out.println("Game Over...");
                break;}
            //Step 12: If the user say no then Game over
        }while (round < 7) ;
    }
}