package lab09;


public class main2 {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 88);
        B studentB = new B(78, 82, 91, 85);

        System.out.println("Student A Percentage: " + studentA.getPercentage() + "%");
        System.out.println("Student B Percentage: " + studentB.getPercentage() + "%");
    }
}

