import java.util.Random;
import java.util.Scanner;
public class Assignment6A {
    public static void main(String[]args){
        Random rc=new Random();
        int [] array=new int[1000001];
        int target, low=0,high= array.length-1,mid=0,i,middle=0;
        target=rc.nextInt(array.length)-1;
        System.out.println("Comparing Linear Search and Binary Search:");
        System.out.println("Our target is "+target);
        for(i=0;i< array.length;i++){
            array[i]=(i);
            if(target==array[i]){
                System.out.println("Linear Search: "+(i+1)+" loop(s)");
                //the (1) is to calculate the amount of loops which makes 0=1 because their can't be 0 loops really
            }
        }
        while (high >= low) {
            middle++;
            mid = (low + high) / 2;
            if (target>array[mid]) {
                low = mid + 1;
             }
             else if (target == array[mid]) {
                 System.out.println("Binary Search: "+(middle)+" guess(es)");
                 break;
            }
            else {
                high = mid - 1;
            }
        }
        if ( i < middle ){
            System.out.print("Linear Search is faster this time!");
        }
        else if(i==middle){
            System.out.print("Linear Search and Binary Search is a tie");
        }
        else{
            System.out.print("Binary Search is faster this time!");
        }
    }
}
