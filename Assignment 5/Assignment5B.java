import java.util.Random;
import java.util.Scanner;
public class Assignment5B {
    public static void main(String[]args) {
        int gameRound,numb,gameRound1;
        String compSelection="0";
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        System.out.print("How many games do you want to play?:");
        gameRound = sc.nextInt();
        String rps[] = new String[3];
        rps[0]="rock";
        rps[1]="paper";
        rps[2]="scissors";
        String[]results=new String[gameRound];

        for (int i =0; i <= gameRound; i++) {
            if(i==gameRound){
                System.out.println("Game Over...");
                break;
            }
            System.out.print("Round "+(i+1)+": What do you want to throw?:");
            String playerSelection=sc.next();
            numb=rc.nextInt(3);
            if(numb==0){
                compSelection=rps[0];
            }
            if(numb==1){
                compSelection=rps[1];
            }
            if(numb==2){
                compSelection=rps[2];
            }
            if(compSelection==rps[0]){
                System.out.println("Computer threw ROCK!");
            }
            if(compSelection==rps[1]){
                System.out.println("Computer threw PAPER!");
            }
            if(compSelection==rps[2]){
                System.out.println("Computer threw SCISSORS!");
            }
            if(playerSelection.equalsIgnoreCase("rock")&&compSelection==rps[0]){
                results[i]="Tied on";
            }
            if(playerSelection.equalsIgnoreCase("rock")&&compSelection==rps[1]){
                results[i]="Computer won";
            }
            if(playerSelection.equalsIgnoreCase("rock")&&compSelection==rps[2]){
                results[i]="Player won";
            }
            if(playerSelection.equalsIgnoreCase("paper")&&compSelection==rps[0]){
                results[i]="Player won";
            }
            if(playerSelection.equalsIgnoreCase("paper")&&compSelection==rps[1]){
                results[i]="Tied on";
            }
            if(playerSelection.equalsIgnoreCase("paper")&&compSelection==rps[2]){
                results[i]="Computer won";
            }
            if(playerSelection.equalsIgnoreCase("scissors")&&compSelection==rps[0]){
                results[i]="Computer won";
            }
            if(playerSelection.equalsIgnoreCase("scissors")&&compSelection==rps[1]){
                results[i]="Player won";
            }
            if(playerSelection.equalsIgnoreCase("scissors")&&compSelection==rps[2]){
                results[i]="Tied on";
            }
        }
        System.out.println("Here’s the recap:");
        for(int i=0;i<gameRound;i++) {
            System.out.println(results[i]+" Round "+(i+1));
        }
    }
}
