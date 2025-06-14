package lab09;

abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private double marks1, marks2, marks3;

    public A(double marks1, double marks2, double marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double getPercentage() {
        return (marks1 + marks2 + marks3) / 3;
    }
}

class B extends Marks {
    private double marks1, marks2, marks3, marks4;

    public B(double marks1, double marks2, double marks3, double marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    public double getPercentage() {
        return (marks1 + marks2 + marks3 + marks4) / 4;
    }
}
