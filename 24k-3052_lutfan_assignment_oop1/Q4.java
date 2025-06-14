package assignment;

import java.util.*;
import java.text.*;

public class Q4 {

    public static class Student {
        String name;
        String semesterFeeStatus;
        // Instead of char attendence[30] we use a List of Characters.
        ArrayList<Character> attendance = new ArrayList<>();
        Vehicle v;  // associated vehicle

        public void addVehicle(Vehicle v1) {
            v = v1;
        }

        public void markAttendance() {
            attendance.add('P');
            System.out.println("Attendance Marked...!");
        }

        public void vehicleDetail() {
            System.out.println("Name: " + name);
            v.detail();
        }

        public void viewDetail() {
            System.out.println("Name: " + name);
            System.out.println("Fee: " + semesterFeeStatus);
            System.out.print("Attendance: ");
            for (Character ch : attendance) {
                System.out.print(ch + ", ");
            }
            System.out.println();
        }
    }


    public static class Vehicle {
        String model;
        String route;

        String[] stops = new String[5];
        ArrayList<Student> students = new ArrayList<>();

        public void registerStudent(Student s) {
            students.add(s);
        }

        public void display() {
            int i = 1;
            for (Student s : students) {
                System.out.println(i + ". Name: " + s.name);
                i++;
            }
        }

        public void detail() {

            System.out.printf("%-15s%-20s", model, route);
            for (int i = 0; i < stops.length; i++) {
                // Print stop number and stop detail
                System.out.print((i + 1) + "." + stops[i] + "  ");
            }
            System.out.println();
        }
    }

    public static class Manage {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Scanner scanner;

        public Manage(Scanner scanner) {
            this.scanner = scanner;
        }

        public void registerVehicle() {
            Vehicle vehicle = new Vehicle();
            System.out.print("Enter Model: ");
            vehicle.model = scanner.nextLine();
            System.out.print("Enter Route: ");
            vehicle.route = scanner.nextLine();
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter " + (i + 1) + " Stop: ");
                vehicle.stops[i] = scanner.nextLine();
            }
            vehicles.add(vehicle);
        }

        public Vehicle vehiclePointer(String mod) {
            for (Vehicle v : vehicles) {
                if (v.model.equals(mod)) {
                    System.out.println("Point Found...!");
                    return v;
                }
            }
            System.out.println("Sorry, We don't Own This Model");
            return null;
        }

        public void displayVehicle() {
            System.out.printf("%-15s%-20s%-10s%n", "Model", "Route", "Stops");
            for (Vehicle v : vehicles) {
                v.detail();
            }
        }

        public void registerStudent() {
            Student student = new Student();
            System.out.print("Enter Your Name: ");
            student.name = scanner.nextLine();
            System.out.print("Enter Fee Status(Paid/UnPaid): ");
            student.semesterFeeStatus = scanner.nextLine();
            if (student.semesterFeeStatus.equalsIgnoreCase("Paid")) {
                displayVehicle();
                System.out.print("Enter Model Name: ");
                String mod = scanner.nextLine();
                Vehicle currentVehicle = vehiclePointer(mod);
                if (currentVehicle != null) {
                    student.addVehicle(currentVehicle);

                    currentVehicle.registerStudent(student);
                    System.out.println("User Successfully Registered....!");
                    students.add(student);
                }
            } else {
                System.out.println("Sorry, You need to pay Fee...!");
            }
        }

        public Student currentStudentPointer() {
            System.out.print("Enter Student Name: ");
            String na = scanner.nextLine();
            for (Student s : students) {
                if (s.name.equals(na)) {
                    return s;
                }
            }
            System.out.println("Student Not Found....");
            return null;
        }
    }

    public static void waitForUser(Scanner scanner) {
        System.out.println("Press Any Key.........!");
        scanner.nextLine();
    }
}
