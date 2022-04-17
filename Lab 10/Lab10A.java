import java.util.Scanner;
public class Lab10A {
    public static void main(String []args) {
        int target,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        int [] tenNumb = new int[10];
        for ( i = 0; i < tenNumb.length; i++) {
            System.out.print("Integer "+(i+1)+": ");
            tenNumb[i]=sc.nextInt();
            if(i==(tenNumb.length-1)){
                System.out.print("What is the target number: ");
                target= sc.nextInt();
                for(int j=0;j< tenNumb.length;j++){
                        if(tenNumb[j]==target){
                            System.out.print("The target is in the set.");
                            break;
                        }
                        if(tenNumb[j]!=target && j==(tenNumb.length-1)){
                            System.out.print("The target is not in the set.");
                            break;
                        }
                }

            }
        }
    }
}


