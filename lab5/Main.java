package lab5;

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();

        System.out.println("Enter first distance:");
        d1.getDist();

        System.out.println("Enter second distance:");
        d2.getDist();

        Distance sum = d1.addDist(d2);
        System.out.println("After Addition:");
        sum.showDist();

        Distance diff = d1.subDist(d2);
        System.out.println("After Subtraction:");
        diff.showDist();
    }
}