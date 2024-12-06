package BEAN;

public class Vehicles {
    private String vehicleId;
    private String type;
    private int capacity;
    private double costPerKm;

    // Constructor
    public Vehicles(String vehicleId, String type, int capacity, double costPerKm) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.capacity = capacity;
        this.costPerKm = costPerKm;
    }

    // Getters and Setters
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCostPerKm() {
        return costPerKm;
    }

    public void setCostPerKm(double costPerKm) {
        this.costPerKm = costPerKm;
    }
}
