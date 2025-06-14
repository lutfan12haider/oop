package practice;
import java.util.Scanner;
public class part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("even");
            } else {

                System.out.println("odd");

            }

        }
    }
}

