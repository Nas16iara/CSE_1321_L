import java.util.Scanner;

public class Lab8B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;//user number
        System.out.println("Please enter 5 integers for the first array: ");
        int [] a1= new int[5];
        for(int i=0;i<a1.length;i++) {
            System.out.print("Integer "+(i+1)+":");
            a1[i]=sc.nextInt();
        }
        System.out.println("Please enter 5 integers for the second array:");
        int [] a2= new int[5];
        for(int i=0;i<a2.length;i++) {
            System.out.print("Integer "+(i+1)+":");
            a2[i]=sc.nextInt();
        }
        int [] a3= new int[5];
        for(int i=0;i<a3.length;i++) {
            a3[i]= a2[i]+a1[i];

        }
        System.out.print("The resulting sums are "+a3[0]+"|"+a3[1]+"|"+a3[2]+"|"+a3[3]+"|"+a3[4]+"|");
    }
}