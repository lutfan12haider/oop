package practice;
import java.util.Scanner;

public class part5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the number : ");
        int m = sc.nextInt();
        System.out.println("Before swapping: n = " + n + ", m = " + m);
        n=n+m;
        m=n-m;
        n=n-m;
        System.out.println("After swapping: n = " + n + ", m = " + m);
        sc.close();
    }
}
