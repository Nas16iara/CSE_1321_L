import java.util.Scanner;
public class Assignment8B {
    public static void main(String [] args){
        //Goals: Our goal is to use hit boxes to determine if two players hit each other
        //Assignment statements:
        int xCoor;
        int yCoor;
        int widt;
        int heig;
        int xCoor2;
        int yCoor2;
        int widt2;
        int heig2;
        int player;
        String direction;
        int move;
        boolean collied;
        Scanner sc=new Scanner(System.in);
        //Looking at the assignment we are going to need two classes
        //Our driver class is our next class
        System.out.println("[Collision Tester]");
        //We are going to create two players objects
        Player player1=new Player();
        System.out.println("Create Player 1");
        System.out.print("Enter X position: ");
        xCoor=sc.nextInt();
        System.out.print("Enter Y position: ");
        yCoor=sc.nextInt();
        System.out.print("Enter Player Hitbox Width: ");
        widt=sc.nextInt();
        System.out.print("Enter Player Hitbox Height: ");
        heig=sc.nextInt();
        player1.player(widt,heig,xCoor,yCoor);
        Player player2=new Player();
        System.out.println("Create Player 2");
        System.out.print("Enter X position: ");
        xCoor2=sc.nextInt();
        System.out.print("Enter Y position: ");
        yCoor2=sc.nextInt();
        System.out.print("Enter Player Hitbox Width: ");
        widt2=sc.nextInt();
        System.out.print("Enter Player Hitbox Height: ");
        heig2=sc.nextInt();
        player2.player(widt2,heig2,xCoor2,yCoor2);
        System.out.println("");
        //next we are going to ask the user to choose the player to move
        System.out.println("Player 1 is at " + "(" + xCoor + "," + yCoor + ") " +
                "and Player 2 is at " + "(" + xCoor2 + "," + yCoor2 + ")");
        do {
            System.out.println("Which one do you want to move?");
            player = sc.nextInt();
            System.out.println("Which direction should Player " + player + " move (up, down, left, or right)?");
            direction = sc.next();
            System.out.println("How far should Player " + player + " move?");
            move = sc.nextInt();
            if (player == 1 && direction.equalsIgnoreCase("Up")) {
                player1.MoveVertical(move);
                yCoor=player1.getYPosition();
            }
            else if (player == 1 && direction.equalsIgnoreCase("Down")) {
                move = -move;
                player1.MoveVertical(move);
                yCoor=player1.getYPosition();
            }
            if (player == 1 && direction.equalsIgnoreCase("Right")) {
                player1.MoveHorizontal(move);
                xCoor=player1.getXPosition();
            }
            else if (player == 1 && direction.equalsIgnoreCase("Left")) {
                move = -move;
                player1.MoveHorizontal(move);
                xCoor=player1.getXPosition();

            }
            else if (player == 2 && direction.equalsIgnoreCase("Up")) {
                player1.MoveVertical(move);
                yCoor2=player2.getYPosition();
            }
            else if (player == 2 && direction.equalsIgnoreCase("Down")) {
                move = -move;
                player2.MoveVertical(move);
                yCoor2=player2.getYPosition();
            }
            if (player == 2 && direction.equalsIgnoreCase("Right")) {
                player2.MoveHorizontal(move);
                xCoor2=player2.getXPosition();
            }
            else if (player == 2 && direction.equalsIgnoreCase("Left")) {
                move = -move;
                player2.MoveHorizontal(move);
                xCoor2=player2.getXPosition();
            }
            System.out.println("");
            System.out.println("Player 1 is at " + "(" + xCoor + "," + yCoor + ") " +
                    "and Player 2 is at " + "(" + xCoor2 + "," + yCoor2 + ")");
            //next we are going to call on method DidTheyCollide
            //if DidTheyCollide return the print statement then Print Program Ends!
            collied=player1.DidTheyCollide(player2);

            //else continue the program until DidTheyCollide return true

        }while(!collied);
        System.out.print("Program Ends");
    }
}