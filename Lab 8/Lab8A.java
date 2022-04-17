import java.util.Scanner;

public class Lab8A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;//user number
        System.out.println("Please enter 10 integers:");
        int [] numBers= new int[10];
        for(int i=0;i<numBers.length;i++) {
            System.out.print("Integer "+(i+1)+":");
            numBers[i]=sc.nextInt();
            sum=sum+numBers[i];
        }
        System.out.print("The sum is "+sum);
    }
}
