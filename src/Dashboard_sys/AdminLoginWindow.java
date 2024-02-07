package Dashboard_sys;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdminLoginWindow extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;

    public AdminLoginWindow() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300, 300, 400, 250);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblAdminLogin = new JLabel("Admin Login");
        lblAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblAdminLogin.setBounds(145, 20, 120, 20);
        contentPane.add(lblAdminLogin);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUsername.setBounds(30, 60, 100, 20);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPassword.setBounds(30, 100, 100, 20);
        contentPane.add(lblPassword);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(130, 60, 200, 20);
        contentPane.add(textFieldUsername);
        textFieldUsername.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 100, 200, 20);
        contentPane.add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBackground(new Color(240, 240, 240));
        btnLogin.setForeground(Color.BLACK);
        btnLogin.setBounds(160, 150, 100, 30);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic for admin login
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                // Replace the following line with your authentication logic
                authenticateAdmin(username, password);
            }
        });
        contentPane.add(btnLogin);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the admin login window
                dispose();
            }
        });
        btnCancel.setBounds(270, 150, 100, 30);
        contentPane.add(btnCancel);
    }

    // Method to simulate admin authentication (replace this with your database logic)
    private void authenticateAdmin(String username, String password) {
        // Add your logic to authenticate the admin
        // This is a placeholder method, replace it with actual authentication code
        System.out.println("Simulating admin authentication...");
        System.out.println("Admin Username: " + username);
        System.out.println("Admin Password: " + password);

        // Add your authentication logic here
        // If authentication is successful, you might close this window and open the admin dashboard
        // If authentication fails, you might display an error message to the admin
        if ("admin".equals(username) && "admin123".equals(password)) {
            System.out.println("Admin authentication successful!");
            dispose(); // Close the admin login window
            openAdminDashboard(); // Open the admin dashboard
        } else {
            System.out.println("Admin authentication failed. Please check your credentials.");
            // You might display an error message here
        }
    }

    private void openAdminDashboard() {
        // Add your logic to open the Admin_s window
        admn_s adminDashboard = new admn_s();
        adminDashboard.setVisible(true);
    }

    public static void main(String[] args) {
        AdminLoginWindow frame = new AdminLoginWindow();
        frame.setVisible(true);
    }
}
