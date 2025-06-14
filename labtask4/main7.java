package labtask4;

import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        lab7 project1 = new lab7();
        System.out.println("Project 1 (Default Constructor):");
        project1.displayProjectDetails();

        System.out.print("\nEnter Project Name for Project 2: ");
        String projectName2 = scanner.nextLine();
        System.out.print("Enter Deadline for Project 2: ");
        String deadline2 = scanner.nextLine();
        lab7 project2 = new lab7(projectName2, deadline2);
        System.out.println("\nProject 2 (Constructor with projectName and deadline):");
        project2.displayProjectDetails();


        System.out.print("\nEnter Project Name for Project 3: ");
        String projectName3 = scanner.nextLine();
        System.out.print("Enter Deadline for Project 3: ");
        String deadline3 = scanner.nextLine();
        System.out.print("Enter Budget for Project 3: ");
        double budget3 = scanner.nextDouble();
        lab7 project3 = new lab7(projectName3, deadline3, budget3);
        System.out.println("\nProject 3 (Constructor with projectName, deadline, and budget):");
        project3.displayProjectDetails();

        scanner.close();
    }
}
