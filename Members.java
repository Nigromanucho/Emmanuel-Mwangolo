package BEAN;

public class Members {
    private String memberId;
    private String name;
    private String phone;
    private String location;

    // Constructor
    public Members(String memberId, String name, String phone, String location) {
        this.memberId = memberId;
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    // Getters and Setters
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
