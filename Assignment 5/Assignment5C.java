import java.util.Scanner;
public class Assignment5C {
    public static void main(String[] args) {
        int width, height, choice=0, x, y, lenGht=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("[FYE Level Map Creator]");
        System.out.print("Enter a level map width:");
        width = sc.nextInt();
        System.out.print("Enter a level map height:");
        height = sc.nextInt();
        String[][] map = new String[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                map[j][i] = "*";
                System.out.print(map[j][i]);
            }
            if(i==height-1){
                break;
            }
            System.out.println("");
        }
        do{System.out.print("\nOptions\n" +
                    "1. Clear Level\n" +
                    "2. Add Platform\n" +
                    "3. Add Items\n" +
                    "4. Quit\n" +
                    "Enter a choice:");
            choice = sc.nextInt();
            if(choice==1){
                System.out.println("[Clear Level]");
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        map[j][i] = "*";
                        System.out.print(map[j][i]);
                    }
                    if(i==height-1){
                        break;
                    }
                    System.out.println("");
                }
            }
            if(choice==2){
                System.out.println("[Add Platform]");
                System.out.print("Enter X Coordinate:");
                x = sc.nextInt();
                System.out.print("Enter Y Coordinate:");
                y = sc.nextInt();
                if (x >= width || y >= height) {
                    System.out.println("This is not a valid location!");
                }
                else {
                    System.out.print("Enter Length:");
                    lenGht = sc.nextInt();
                }
                if (lenGht > width - x) {
                    System.out.println("This platform won’t fit in the level!");
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print(map[j][i]);
                        }
                        System.out.println("");
                    }
                    continue;
                }
                for (int k = 0; k < lenGht; k++) {
                        map[x][y] = "=";
                        x++;
                }
                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print(map[j][i]);
                    }
                    System.out.println("");
                }
            }
            if(choice==3){
                System.out.println("[Add Item]");
                System.out.print("Enter X Coordinate:");
                x = sc.nextInt();
                System.out.print("Enter Y Coordinate:");
                y = sc.nextInt();
                if(x>=width||y>=height){
                    System.out.println("This is not a valid location!");
                }
                else{
                    map[x][y]="O";
                }
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(map[j][i]);
                }
                System.out.println("");
            }
            }
            if(choice==4){
            System.out.print("Goodbye!");
            break;
        }
     }while (choice != 4) ;
    }
}
