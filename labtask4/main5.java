package labtask4;


import java.util.ArrayList;

public class main5 {
    private static ArrayList<lab5> devices = new ArrayList<>();


    public static void addDevice() {
        devices.add(new lab5());
        System.out.println("Device added with default values.");
    }


    public static void addDevice(String id, String type, int powerConsumption, boolean isOn) {
        devices.add(new lab5(id, type, powerConsumption, isOn));
        System.out.println("Device added with custom values.");
    }


    public static void removeDevice(String id) {
        for (lab5 device : devices) {
            if (device.getId().equals(id)) {
                devices.remove(device);
                System.out.println("Device with ID: " + id + " has been removed.");
                return;
            }
        }
        System.out.println("Device with ID: " + id + " not found.");
    }


    public static int calculateTotalPowerConsumption() {
        int totalPower = 0;
        for (lab5 device : devices) {
            if (device.isOn()) {
                totalPower += device.getPowerConsumption();
            }
        }
        return totalPower;
    }


    public static void displayDevices() {
        if (devices.isEmpty()) {
            System.out.println("No devices in the system.");
            return;
        }
        for (lab5 device : devices) {
            System.out.println(device);
        }
    }

    public static void main(String[] args) {

        addDevice(); // Default device
        addDevice("1", "Light", 60, true);
        addDevice("2", "Fan", 75, false);

        System.out.println("Devices in the system:");
        displayDevices();


        System.out.println("\nTotal power consumption of active devices: " + calculateTotalPowerConsumption() + "W");

        removeDevice("1");

        System.out.println("\nDevices after removal:");
        displayDevices();

        System.out.println("\nTotal power consumption of active devices: " + calculateTotalPowerConsumption() + "W");
    }
}
