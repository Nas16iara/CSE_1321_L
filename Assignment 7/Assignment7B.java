import java.util.Scanner;
public class Assignment7B {
    public static boolean trueOrNah(String message, int offset){
        boolean canItBeASecretMessage=false;
        final int letterUpperA=65;
        final int letterLowerA=97;
        final int letterUpperZ=90;
        final int letterLowerZ=122;
        final int space=32;
        final int offsetValue=26;
        char [] arrayMessage=message.toCharArray();
        for(int i=0;i< arrayMessage.length;i++){
            if(arrayMessage[i]>=letterUpperA&&arrayMessage[i]<=letterUpperZ||
                    arrayMessage[i]>=letterLowerA && arrayMessage[i]<=letterLowerZ||
                    arrayMessage[i]==space && offset<=offsetValue){
                canItBeASecretMessage=true;
            }
            else {
                canItBeASecretMessage = false;
                break;
            }
        }
        return canItBeASecretMessage;
    }
    public static char[] encryptMessage(String message, int offset){
        final int space=32;
        final int letterUpperZ=90;
        message=message.toUpperCase();
        char [] arrayMessage=message.toCharArray();
        for(int i=0;i< arrayMessage.length;i++){
            if(arrayMessage[i]==space){
               arrayMessage[i]=32;
            }
            else{
            arrayMessage[i]= (char) (arrayMessage[i]+offset);}
            if (arrayMessage[i]>=letterUpperZ){
                int offsetTemp=arrayMessage[i]-91;   // set a temp offset value after letter hits Z which is
                                                    // 90 (adds 1 bc array starts at 0/)
                arrayMessage[i]='A';               //Starts back to A
                arrayMessage[i]= (char) (arrayMessage[i]+offsetTemp); //Adds the leftover value that wasn't taken
            }

        }
        return arrayMessage;
    }
    public static void main(String []args){
        String message;
        char yOrN;
        int offset;

        do {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your message: ");
            message = sc.nextLine();
            System.out.print("Enter the offset value:");
            offset = sc.nextInt();
            if(trueOrNah(message, offset)){
                System.out.println("Your secret message is...");
                System.out.println(encryptMessage(message, offset));
            }
            else if(!trueOrNah(message, offset)){
                System.out.println("Sorry, we can only process messages with letters and spaces, and the offset must be between 0 and 26.");
            }
            System.out.print("Do you want to encrypt another message?: ");
            yOrN = sc.next().charAt(0);
        }while(yOrN=='y'||yOrN=='Y');
        System.out.print("Closing out...");
    }
}
