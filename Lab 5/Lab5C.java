import java.util.Scanner;
public class Lab5C {
    public static void main(String [] args){
    int x,y;
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter x:");
    x=sc.nextInt();

    System.out.print("Enter y:");
    y=sc.nextInt();

    if(x==0 && y==0){
        System.out.print("This point is the origin.");
    }
    else if((x>0||x<0)&&(y==0) ){ //this is (P or Q) and R//
        System.out.print("This point is on the x axis.");
    }
    else if(x==0 && (y>0||y<0)){ //this is also (P or Q) and R with different assigned values//
        System.out.print("This point is on the y axis.");
    }
    else if(x>0&&y>0){
        System.out.print("This point is in the first quadrant.");
    }
    else if(x<0&&y>0){
        System.out.print("This point is in the second quadrant.");
    }
    else if(x<0&&y<0){
        System.out.print("This point is in the third quadrant.");
    }
    else if (x>0&&y<0){
        System.out.print("This point is in the forth quadrant.");
    }

    }

}
