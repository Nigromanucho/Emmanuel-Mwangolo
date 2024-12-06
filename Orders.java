package BEAN;

public class Orders {
    private String orderId;
    private String memberId;
    private String vehicleId;
    private String destination;
    private int distance;

    // Constructor
    public Orders(String orderId, String memberId, String vehicleId, String destination, int distance) {
        this.orderId = orderId;
        this.memberId = memberId;
        this.vehicleId = vehicleId;
        this.destination = destination;
        this.distance = distance;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
