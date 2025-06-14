package assignment;

public class Main3 {
    public static void main(String[] args) {
        Q3.TextScanner ts = new Q3.TextScanner();
        Q3.Manage manage = new Q3.Manage(ts);
        Q3.User currentUser = null;
        String mod;
        int choice;

        do {

            for (int i = 0; i < 50; i++) System.out.println();
            System.out.print("1.Register User  2.Display Users  3.Register Vehicle  4.Display Vehicles  5.Rent A Car\n6.Show Rented Car\n\nEnter Your Choice (0 to exit): ");
            choice = ts.nextInt();

            switch (choice) {
                case 1:
                    manage.registerUser();
                    Q3.waitForUser(ts);
                    break;

                case 2:
                    manage.displayUsers();
                    Q3.waitForUser(ts);
                    break;

                case 3:
                    manage.registerVehicle();
                    Q3.waitForUser(ts);
                    break;

                case 4:
                    manage.displayVehicles();
                    Q3.waitForUser(ts);
                    break;

                case 5:
                    currentUser = manage.login();
                    if(currentUser != null) {
                        manage.displayVehicles();
                        System.out.print("Enter Model Name: ");
                        mod = ts.nextLine();
                        Q3.Vehicle model = manage.vehiclePointer(mod);
                        currentUser.rentCar(model);
                    }
                    Q3.waitForUser(ts);
                    break;

                case 6:
                    if(currentUser != null && currentUser.cars != null) {
                        System.out.printf("%-15s%-10s%n", "Model", "Rental Price");
                        System.out.printf("%-15s%-10d%n", currentUser.cars.model, currentUser.cars.rentalPrice);
                    } else {
                        System.out.println("No Car Rented or User not logged in");
                    }
                    Q3.waitForUser(ts);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    Q3.waitForUser(ts);
                    break;
            }
        } while (choice != 0);

        ts.close();
    }
}

