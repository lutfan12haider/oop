package assignment;
import java.util.*;

public class Q3 {

    public static class TextScanner {
        private Scanner scanner;
        public TextScanner() {
            scanner = new Scanner(System.in);
        }
        public String nextLine() {
            return scanner.nextLine();
        }
        public int nextInt() {
            int value = scanner.nextInt();
            scanner.nextLine(); // consume newline
            return value;
        }
        public double nextDouble() {
            double value = scanner.nextDouble();
            scanner.nextLine();
            return value;
        }
        public void close() {
            scanner.close();
        }
    }

    public static class Vehicle {
        String model;
        int rentalPrice;
        String eligibility;

        public void display() {

            System.out.printf("%-15s%-15d%-16s%n", model, rentalPrice, eligibility);
        }
    }


    public static class User {
        String userName;
        int age;
        String licenseType;
        long phoneNumber;
        int userID;
        Vehicle cars;

        public void updateName(TextScanner ts) {
            System.out.print("Enter New Name: ");
            userName = ts.nextLine();
            System.out.println("Name Updated : " + userName);
        }

        public void updateAge(TextScanner ts) {
            System.out.print("Enter Age: ");
            age = ts.nextInt();
            System.out.println("Age Updated : " + age);
        }

        public void updateLicense(TextScanner ts) {
            System.out.print("Enter License Type: ");
            licenseType = ts.nextLine();
            System.out.println("Licence Updated: " + licenseType);
        }

        public void rentCar(Vehicle v) {
            if(v != null && (v.eligibility.equals(licenseType) ||
                    licenseType.equals("Pro") || licenseType.equals("Intermediate"))) {
                cars = v;
                System.out.println("Car Rented Successfully....!");
            } else {
                System.out.println("You can't drive this....!");
            }
        }

        public void displayRentCar() {
            if(cars != null) {
                System.out.println("Model: " + cars.model);
                System.out.println("Rent Per Day: " + cars.rentalPrice);
            } else {
                System.out.println("No Car Rented");
            }
        }
    }

    public static class Manage {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        TextScanner ts;

        public Manage(TextScanner ts) {
            this.ts = ts;
        }

        public void registerUser() {
            User newUser = new User();
            System.out.print("Enter New Name: ");
            newUser.userName = ts.nextLine();
            System.out.print("Enter Age: ");
            newUser.age = ts.nextInt();
            System.out.print("Enter License Type: ");
            newUser.licenseType = ts.nextLine();
            users.add(newUser);
            System.out.println("User Registered Successfully!");
        }

        public void displayUsers() {
            int i = 1;
            for (User u : users) {
                System.out.println("User " + i++);
                System.out.println("Name: " + u.userName);
            }
        }

        public void registerVehicle() {
            Vehicle newVehicle = new Vehicle();
            System.out.print("Enter Car Model (Honda, Toyota): ");
            newVehicle.model = ts.nextLine();
            System.out.print("Rental Price: ");
            newVehicle.rentalPrice = ts.nextInt();
            System.out.print("Enter Eligibility (Pro, Beginner): ");
            newVehicle.eligibility = ts.nextLine();
            vehicles.add(newVehicle);
            System.out.println("Vehicle Registered Successfully...\n");
        }

        public void displayVehicles() {
            System.out.printf("%-15s%-15s%-16s%n", "Model", "Rental Price", "Eligibility");
            for (Vehicle v : vehicles) {
                System.out.printf("%-15s%-15d%-16s%n", v.model, v.rentalPrice, v.eligibility);
            }
        }

        public User login() {
            System.out.print("Enter User Name: ");
            String na = ts.nextLine();
            for (User u : users) {
                if(u.userName.equals(na)) {
                    System.out.println("User Found Successfully...!");
                    return u;
                }
            }
            System.out.println("User Not Found\nFirst Register The User...!");
            return null;
        }

        public Vehicle vehiclePointer(String mod) {
            for (Vehicle v : vehicles) {
                if(v.model.equals(mod)) {
                    System.out.println("Car Found...!");
                    return v;
                }
            }
            System.out.println("Sorry, We don't Own This Model");
            return null;
        }
    }

    public static void waitForUser(TextScanner ts) {
        System.out.print("Enter Any Key.........");
        ts.nextLine();
    }
}
