import java.util.Scanner;
public class Assignment7A {
    public static float average(float [] grades){ //This array takes in both the contents and the size
        float sum=0;
        float averValue;
        for(int i=0;i<grades.length;i++){
            sum+=grades[i];
        }
        averValue=sum/grades.length;
        return averValue;
    }
    public static float weightedGPA(float average, float percentage){

        return (percentage*average); //weighted GPA
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("[CSE 1321L Grade Calculator]\n");
        //Labs grades://
        float weightedGPA;
        float [] labGrades=new float [13];
        float percentage=0.1f;
        System.out.print("Labs\n");
        for(int i=0;i< labGrades.length;i++) {
            System.out.print("Enter Grade #"+(i+1)+":");
            labGrades[i]=sc.nextInt();
        }
        weightedGPA=weightedGPA(average(labGrades),percentage);
        System.out.format("Weighted Points: %.2f",weightedGPA);
        //Assignment://
        float weightedGPA2;
        float [] assignGrades=new float [8];
        float percentage2=0.4f;
        System.out.print("\nAssignment\n");
        for(int i=0;i< assignGrades.length;i++) {
            System.out.print("Enter Grade #"+(i+1)+":");
            assignGrades[i]=sc.nextInt();
        }
        weightedGPA2=weightedGPA(average(assignGrades),percentage2);
        System.out.format("Weighted Points: %.2f",weightedGPA2);
        //Midterm: //
        float weightedGPA3;
        float [] midGrades=new float [1];
        float percentage3=0.2f;
        System.out.print("\nMidterm\n");
        for(int i=0;i< midGrades.length;i++) {
            System.out.print("Enter Grade #"+(i+1)+":");
            midGrades[i]=sc.nextInt();
        }
        weightedGPA3=weightedGPA(average(midGrades),percentage3);
        System.out.format("Weighted Points: %.2f",weightedGPA3);
        //Final: //
        float weightedGPA4;
        float [] finGrades=new float [1];
        float percentage4=0.3f;
        System.out.print("\nExam\n");
        for(int i=0;i< finGrades.length;i++) {
            System.out.print("Enter Grade #"+(i+1)+":");
            finGrades[i]=sc.nextInt();
        }
        weightedGPA4=weightedGPA(average(finGrades),percentage4);
        System.out.format("Weighted Points: %.2f",weightedGPA4);
        //final Grade:
        float finGrade=(weightedGPA+weightedGPA2+weightedGPA3+weightedGPA4);
        System.out.format("\nYour final grade for CSE1321L is: %.2f",finGrade);
    }
}
