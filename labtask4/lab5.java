package labtask4;

public class lab5 {
    private String id;
    private String type;
    private int powerConsumption;
    private boolean isOn;


    public lab5() {
        this.id = "Unknown";
        this.type = "Unknown";
        this.powerConsumption = 0;
        this.isOn = false;
    }


    public lab5(String id, String type, int powerConsumption, boolean isOn) {
        this.id = id;
        this.type = type;
        this.powerConsumption = powerConsumption;
        this.isOn = isOn;
    }


    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public boolean isOn() {
        return isOn;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }


    @Override
    public String toString() {
        return "Device ID: " + id + ", Type: " + type + ", Power Consumption: " + powerConsumption + "W, Status: " + (isOn ? "On" : "Off");
    }
}
