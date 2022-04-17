public class Dog {
    public static int age;
    public static double weight;
    public static String name;
    public static String furColor;
    public static String breed;
    Dog(int a, double w,String n, String fC, String b){
        age=a;
        weight=w;
        name=n;
        furColor=fC;
        breed=b;
    }
    public static void bark(){
        System.out.println("\nWoof! Woof!");
    }
    public static String rename(String name){
        String renamed=name;
        return renamed;
    }
    public static double eat(double weight, double moreFood){
        double needEat=0;
        needEat=(weight+moreFood);
        return needEat;
    }

}
