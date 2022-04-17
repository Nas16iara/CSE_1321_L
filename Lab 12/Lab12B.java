/*
Class: CSE 1321L
Section: WJ1
Term: Fall 2021
Instructor: Maneesha Kumari Penmetsa
Name: Ranasis Clark
Lab#: 12B
*/
import java.util.Scanner;
public class Lab12B {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String password;
        char argumentLowerValues=65; //This is the assigned value for A
        char argumentUpperValues=90; //This is the assigned value fo Z
        char argumentLowerValues2=46; //This is the assigned value for 0
        char argumentUpperValues3=57; //This is the assigned value fo 9
        boolean isAValidPassword=false;

        System.out.print("Enter a password: ");
        password=sc.next();
        char[] passWordArray=password.toCharArray();

        if(passWordArray.length>=8){
            for(int i=1;i< passWordArray.length;i++){
                if(passWordArray[i]<=argumentUpperValues && passWordArray[i]>=argumentLowerValues){
                    isAValidPassword=true;
                    break;
                }
            }
            for(int i=1;i< passWordArray.length;i++){
                if((passWordArray[i]>=argumentLowerValues2 && passWordArray[i]<=argumentUpperValues3)){
                    isAValidPassword=true;
                    break;
                }
                else{
                    isAValidPassword=false;
                }
            }
        }
        if(isAValidPassword){
            System.out.println("Valid password");
        }
        else{
            System.out.println("Invalid password");
        }
        System.out.print("Program Ends");
    }
}
