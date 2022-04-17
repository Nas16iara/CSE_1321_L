import java.util.Scanner;
import java.util.Random;
public class Assignment6B {
    public static void main(String []args){
        int
                userChoice,
                size,
                highNum,
                random,
                key,
                position,
                maxI;
        Scanner sc=new Scanner(System.in);
        Random rc=new Random();
        System.out.print("How large should the array be?");
        size=sc.nextInt();
        System.out.print("What should be the highest number in the sequence?");
        highNum= sc.nextInt();
        int []sort=new int[size];
        for(int i=0;i<sort.length;i++) {
            random=rc.nextInt(highNum);
            sort[i] = random;
            System.out.print(random+",");
        }
        do{
            System.out.print("\n[Options]\n" +
                    "1) Reset the array\n" +
                    "2) Sort (Smallest to Largest)\n" +
                    "3) Sort (Largest to Smallest)\n" +
                    "4) Quit\n" +
                    "Choice?");
            userChoice= sc.nextInt();
            switch (userChoice) {
                case 1:{
                    System.out.println("Resetting the array:");
                    for (int i = 0; i < sort.length; i++) {
                        random = rc.nextInt(highNum);
                        sort[i] = random;
                        System.out.print(random + ",");
                    }
                    break;
                }
                case 2:{
                    System.out.println("Using Insertion Sort:");
                    for (int i = 1; i < sort.length; i++) {
                        key = sort[i];
                        position = i;
                        while (position > 0 && key < sort[position - 1]) {
                            sort[position] = sort[position - 1];
                            position = position - 1;
                        }
                        sort[position] = key;
                    }
                    for (int i : sort) {
                        System.out.print(i+",");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Using Selection Sort:");
                    for(int i=0; i< sort.length;i++){
                        maxI=i;
                        for(int j=i+1;j<sort.length;j++){
                            if(sort[maxI]<sort[j]){
                                maxI=j;
                            }
                        }
                        if(maxI!=i){
                            int temp=sort[i];
                            sort[i]=sort[maxI];
                            sort[maxI]=temp;
                        }
                        System.out.print(sort[i]+",");
                    }
                    break;
                }
                case 4:{
                    System.out.print("Closing out...");
                    break;
                }
            }
        }while(userChoice!=4);
    }
}
