package practice;
import java.util.Scanner;
public class part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Enter the number : ");
        int b = sc.nextInt();
        System.out.println("Enter the number : ");
        int c = sc.nextInt();
        int largest=a;
        if(b>largest){
            largest=b;
        }
        if(c>largest){
            largest=c;
        }
        System.out.println("largest=" +largest);
        sc.close();


    }
}
