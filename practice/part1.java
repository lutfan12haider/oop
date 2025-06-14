package practice;
import java.util.Scanner;


public class part1 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number:");
    int num1=sc.nextInt();
    System.out.println("enter a number:");
    int num2=sc.nextInt();
    System.out.println("enter a number:");
    int num3=sc.nextInt();
    int sum=num1+num2+num3;
    double average=sum/3.0;
    int product=num1*num2*num3;
    System.out.println("sum="+sum);
    System.out.println("average="+average);
    System.out.println("product="+product);
    sc.close();

}
}
