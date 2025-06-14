package practice;
import java.util.Scanner;
public class part12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books=new String[5];
        int[] overdue=new int[5];
        double fineperday=2.00;
        double totalfine=0;
        System.out.println("Enter the number of books need to be titled:");
        for(int i=0;i<5;i++){
            System.out.println("Book "+(i+1)+":");
            books[i]=sc.nextLine();

        }
        System.out.println("Enter the number of overdue books (if not press 0:");
        for(int i=0;i<5;i++){
            System.out.println("Overdue "+(i+1)+":");
            overdue[i]=sc.nextInt();
            totalfine+=overdue[i] *fineperday;

        }
        System.out.println("---------check summary--------");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+"."+books[i]+" _overdue _"+overdue[i]);

        }
        System.out.println("Total fine:"+totalfine);
        sc.close();
    }
}
