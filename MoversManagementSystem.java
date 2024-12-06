package MOVERSMAINDASHBOARD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MoversManagementSystem {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainDashboard dashboard = new MainDashboard();
            dashboard.setVisible(true);
        });
    }
}

class MainDashboard extends JFrame {
    public MainDashboard() {
        setTitle("Movers Transport System");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create buttons for navigation
        JButton btnMembers = new JButton("Manage Members");
        JButton btnVehicles = new JButton("Manage Vehicles");
        JButton btnOrders = new JButton("Manage Orders");
        JButton btnExit = new JButton("Exit");

        // Set up action listeners
        btnMembers.addActionListener(e -> new MemberManager().setVisible(true));
        btnVehicles.addActionListener(e -> new VehicleManager().setVisible(true));
        btnOrders.addActionListener(e -> new OrderManager().setVisible(true));
        btnExit.addActionListener((ActionEvent e) -> System.exit(0));

        // Layout for buttons
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.add(btnMembers);
        panel.add(btnVehicles);
        panel.add(btnOrders);
        panel.add(btnExit);

        add(panel, BorderLayout.CENTER);
    }
}

class MemberManager extends JFrame {
    public MemberManager() {
        setTitle("Manage Members");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JLabel lblMemberID = new JLabel("Member ID:");
        JTextField txtMemberID = new JTextField(20);

        JLabel lblName = new JLabel("Name:");
        JTextField txtName = new JTextField(20);

        JLabel lblPhone = new JLabel("Phone:");
        JTextField txtPhone = new JTextField(20);

        JLabel lblLocation = new JLabel("Location:");
        JTextField txtLocation = new JTextField(20);

        JButton btnSave = new JButton("Save");
        JButton btnClear = new JButton("Clear");

        btnSave.addActionListener(e -> JOptionPane.showMessageDialog(this, "Member saved!"));
        btnClear.addActionListener(e -> {
            txtMemberID.setText("");
            txtName.setText("");
            txtPhone.setText("");
            txtLocation.setText("");
        });

        // Layout setup
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.add(lblMemberID);
        panel.add(txtMemberID);
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblPhone);
        panel.add(txtPhone);
        panel.add(lblLocation);
        panel.add(txtLocation);
        panel.add(btnSave);
        panel.add(btnClear);

        add(panel);
    }
}

class VehicleManager extends JFrame {
    public VehicleManager() {
        setTitle("Manage Vehicles");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JLabel lblVehicleID = new JLabel("Vehicle ID:");
        JTextField txtVehicleID = new JTextField(20);

        JLabel lblType = new JLabel("Vehicle Type:");
        JTextField txtType = new JTextField(20);

        JLabel lblCapacity = new JLabel("Capacity (tons):");
        JTextField txtCapacity = new JTextField(20);

        JLabel lblCostPerKm = new JLabel("Cost per KM:");
        JTextField txtCostPerKm = new JTextField(20);

        JButton btnSave = new JButton("Save");
        JButton btnClear = new JButton("Clear");

        btnSave.addActionListener(e -> JOptionPane.showMessageDialog(this, "Vehicle saved!"));
        btnClear.addActionListener(e -> {
            txtVehicleID.setText("");
            txtType.setText("");
            txtCapacity.setText("");
            txtCostPerKm.setText("");
        });

        // Layout setup
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.add(lblVehicleID);
        panel.add(txtVehicleID);
        panel.add(lblType);
        panel.add(txtType);
        panel.add(lblCapacity);
        panel.add(txtCapacity);
        panel.add(lblCostPerKm);
        panel.add(txtCostPerKm);
        panel.add(btnSave);
        panel.add(btnClear);

        add(panel);
    }
}

class OrderManager extends JFrame {
    public OrderManager() {
        setTitle("Manage Orders");
        setSize(400, 400);
        setLocationRelativeTo(null);

        JLabel lblOrderID = new JLabel("Order ID:");
        JTextField txtOrderID = new JTextField(20);

        JLabel lblMemberID = new JLabel("Member ID:");
        JTextField txtMemberID = new JTextField(20);

        JLabel lblVehicleID = new JLabel("Vehicle ID:");
        JTextField txtVehicleID = new JTextField(20);

        JLabel lblDestination = new JLabel("Destination:");
        JTextField txtDestination = new JTextField(20);

        JLabel lblDistance = new JLabel("Distance (KM):");
        JTextField txtDistance = new JTextField(20);

        JButton btnSave = new JButton("Save");
        JButton btnClear = new JButton("Clear");

        btnSave.addActionListener(e -> JOptionPane.showMessageDialog(this, "Order saved!"));
        btnClear.addActionListener(e -> {
            txtOrderID.setText("");
            txtMemberID.setText("");
            txtVehicleID.setText("");
            txtDestination.setText("");
            txtDistance.setText("");
        });

        // Layout setup
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.add(lblOrderID);
        panel.add(txtOrderID);
        panel.add(lblMemberID);
        panel.add(txtMemberID);
        panel.add(lblVehicleID);
        panel.add(txtVehicleID);
        panel.add(lblDestination);
        panel.add(txtDestination);
        panel.add(lblDistance);
        panel.add(txtDistance);
        panel.add(btnSave);
        panel.add(btnClear);

        add(panel);
    }
}
