import java.util.Random;
import java.util.Scanner;
public class Assignment5A {
    public static void main(String[] args) {
        int size,max,count,visted,random=0;
        Random rc = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("What’s the highest number you want to generate?: ");
        max=sc.nextInt();
        System.out.print("How long of a number sequence do you want to generate?: ");
        size=sc.nextInt();
        System.out.println("Okay, we’ll generate "+size+" number(s) ranging from 1 to "+max+"!");
        int[]longNum=new int[size];
        for(int i=0;i<size;i++){
            if (i == size) {
                break;}
            random=rc.nextInt(max)+1;
            longNum[i]=random;
            System.out.print(random+",");
        }
        System.out.println("\nFrequency:");
        double[]freq=new double [longNum.length];
        visted=-1;
        for(int i=0;i< longNum.length;i++){
            count=1;
            for(int j=i+1;j< longNum.length;j++){
                if(longNum[i]==longNum[j]){
                    count++;
                    freq[j]=visted;
                }
            }
            if(freq[i]!=visted){
                freq[i]=count;
            }
        }
        for(int i=0;i< freq.length;i++){
            if(freq[i]!=visted){
                double occur= ((freq[i]/size)*100);
                double rounding=(double) Math.round(occur*100)/100;
                System.out.println(longNum[i]+" occurs "+rounding+"% of the time");
            }
        }
    }
}


