
import java.util.Scanner;
public class Lab10B {
    public static void main(String[] args) {
        int[] tenNumb = new int[11];
        int target, key, position,high= tenNumb.length,low=0,mid=0;
        boolean found=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 11 numbers:");
        for (int i = 0; i < tenNumb.length; i++) {
            System.out.print("Integer " + (i + 1) + ":");
            tenNumb[i] = sc.nextInt();
        }
        System.out.print("What is the target number:");
        target = sc.nextInt();
        System.out.print("The sorted set is:");
        for (int i = 1; i < tenNumb.length; i++) {
            key = tenNumb[i];
            position = i;
            while (position > 0 && key < tenNumb[position - 1]) {
                tenNumb[position] = tenNumb[position - 1];
                position = position - 1;
            }
            tenNumb[position] = key;
        }
        for (int i : tenNumb) {
            System.out.print(i+" ");
        }
        System.out.println("");
        while (high >= low){
            System.out.println("Low is "+low);
            System.out.println("High is "+(high));
            mid = (low + high) / 2;
            System.out.println("Mid is "+mid);
            System.out.println("Searching");
            if (target < tenNumb[mid]) {
                high = mid-1;
            }
            else if (target == tenNumb[mid]) {
                found = true;
                System.out.println("The target is in the set.");
                break;
            }
            else {
                low = mid + 1;}
        }
        if(!found){
            System.out.print("The target is not in the set.");
        }
    }
}