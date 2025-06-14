package practice;
import java.util.Scanner;
public class part10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int num=sc.nextInt();
        int totalmarks=0; int pass=0; int fail=0;
        for(int i=1;i<=num;i++){
            System.out.println("enter grades for students " +i+ ":");
            int grades=sc.nextInt();
            totalmarks+=grades;
            if(grades>=60){
                pass++;
            }
            else{
                fail++;
            }

        }
        double average=(double) totalmarks/num;
        System.out.println("\nGrades Summary");
        System.out.println("\nGrade Summary:");
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Number of students who passed: " + pass);
        System.out.println("Number of students who failed: " + fail);

        sc.close();
    }
}
