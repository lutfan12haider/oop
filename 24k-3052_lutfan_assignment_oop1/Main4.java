package assignment;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q4.Manage manage = new Q4.Manage(scanner);
        Q4.Student currentUser;
        int choice;
        do {

            for (int i = 0; i < 50; i++) System.out.println();
            System.out.println("1.Register Vehicle  2.Display Vehicle  3.Register Student  4.View Student Detail  5.Mark Attendance");
            System.out.print("Enter Your Choice (0 to exit): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manage.registerVehicle();
                    Q4.waitForUser(scanner);
                    break;
                case 2:
                    manage.displayVehicle();
                    Q4.waitForUser(scanner);
                    break;
                case 3:
                    manage.registerStudent();
                    Q4.waitForUser(scanner);
                    break;
                case 4:
                    currentUser = manage.currentStudentPointer();
                    if (currentUser != null) {
                        currentUser.viewDetail();
                    }
                    Q4.waitForUser(scanner);
                    break;
                case 5:
                    currentUser = manage.currentStudentPointer();
                    if (currentUser != null) {
                        currentUser.markAttendance();
                    }
                    Q4.waitForUser(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    Q4.waitForUser(scanner);
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
