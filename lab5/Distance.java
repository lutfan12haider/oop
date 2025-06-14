package lab5;
import java.util.Scanner;

class Distance {
    int feet;
    int inches;

    // Function to get distance from user
    void getDist() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feet: ");
        feet = scanner.nextInt();
        System.out.print("Enter inches: ");
        inches = scanner.nextInt();
        normalize();
    }

    // Function to display distance
    void showDist() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }

    // Function to add distances
    Distance addDist(Distance d) {
        Distance result = new Distance();
        result.feet = this.feet + d.feet;
        result.inches = this.inches + d.inches;
        result.normalize();
        return result;
    }

    // Function to subtract distances
    Distance subDist(Distance d) {
        Distance result = new Distance();
        int totalInches1 = this.feet * 12 + this.inches;
        int totalInches2 = d.feet * 12 + d.inches;
        int diffInches = totalInches1 - totalInches2;

        if (diffInches < 0) {
            System.out.println("Subtraction results in negative distance!");
            result.feet = 0;
            result.inches = 0;
        } else {
            result.feet = diffInches / 12;
            result.inches = diffInches % 12;
        }
        return result;
    }

    // Normalize inches greater than 12
    void normalize() {
        if (inches >= 12) {
            feet += inches / 12;
            inches %= 12;
        }
    }
}


