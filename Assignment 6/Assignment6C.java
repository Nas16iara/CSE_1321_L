import java.util.Scanner;
import java.util.Random;
public class Assignment6C {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        int g,x,y,l=0,i,j,count=0;
        System.out.println("[Minesweeper – DOS Edition]");
        System.out.print("What is the grid size?");
        g = sc.nextInt();
        char[][] grid = new char[g][g];
        int[] lost= new int[g];
        for (i = 0; i < g; i++) { //this prints out our question mark grid
            for (j = 0; j < g; j++) {
                grid[j][i] = '?';
                System.out.print(grid[j][i]);
            }
            System.out.println("");
        }
        for(int k=0;k<grid.length;k++){
            l=rc.nextInt(g);
            lost[k]=l;
            System.out.print("Enter your X coordinate:"); // corresponds to j- left to right
            x = sc.nextInt();
            System.out.print("Enter your Y coordinate:"); // corresponds to i- up and down
            y = sc.nextInt();
            if(x==k && y==l){
                grid[x][y] = 'X';
                for (i = 0; i < g; i++) { //this prints out our question mark grid
                    for (j = 0; j < g; j++) {
                        System.out.print(grid[j][i]);
                    }
                    System.out.println("");
                }
                System.out.println("Sorry, you hit a mine!");
                System.out.print("Game Over!");
                break;
            }
            else if(y!=i || x!=l){
                count++;
                grid[x][y] = '_';
                for (i = 0; i < g; i++) {//this prints out our question mark grid
                    for (j = 0; j < g; j++) {
                        System.out.print(grid[j][i]);
                    }
                    System.out.println("");
                }
                if((grid.length)==count){
                    System.out.println("You win!");
                    break;
                }
            }
        }
    }
}
