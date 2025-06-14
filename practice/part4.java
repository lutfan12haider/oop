package practice;
import java.util.Scanner;
public class part4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        long factorial = 1;
        for(int i=1;i<=n;i++){
            factorial *= i;
            System.out.println("Factorial of "+i+" = "+factorial);
        }
        sc.close();
    }
}
