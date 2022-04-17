import java.util.Scanner;
public class Lab13B {
   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int age;
        double weight;
        String name;
        String color;
        String breed;
        double moreFood;
        String renamed;
        System.out.println("You are about to create a dog.");
        System.out.print("How old is the dog: ");
        age=sc.nextInt();
        System.out.print("How much does the dog weigh: ");
        weight=sc.nextDouble();
        System.out.print("What is the dog's name: ");
        name=sc.next();
        System.out.print("What color is the dog: ");
        color= sc.next();
        System.out.print("What breed is the dog: ");
        breed= sc.next();
        Dog yourDog= new Dog(age,weight,name,color,breed);
        System.out.println("\n"+yourDog.name+" is a "+yourDog.age+" year old "+yourDog.furColor+" "+yourDog.breed+" that weighs "+yourDog.weight+" lbs.");
        yourDog.bark();
        System.out.print(yourDog.name+" is hungry, how much should he eat: ");
        moreFood= sc.nextDouble();
        System.out.print(yourDog.name+"  isn't a very good name. What should they be renamed to: ");
        renamed= sc.next();
        System.out.print(yourDog.rename(renamed)+" is a "+yourDog.age+" year old "+yourDog.furColor+" "+yourDog.breed+" that weighs "+yourDog.eat(weight,moreFood)+" lbs.");
   }
}
