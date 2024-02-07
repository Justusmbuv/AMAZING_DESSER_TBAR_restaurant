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

public class SignInWindow extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;

    public SignInWindow() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300, 300, 400, 250);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblSignIn = new JLabel("Sign In");
        lblSignIn.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblSignIn.setBounds(170, 20, 70, 20);
        contentPane.add(lblSignIn);

        JLabel lblUsername = new JLabel("Username (Email):");
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUsername.setBounds(30, 60, 140, 20);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPassword.setBounds(30, 100, 140, 20);
        contentPane.add(lblPassword);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(180, 60, 150, 20);
        contentPane.add(textFieldUsername);
        textFieldUsername.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(180, 100, 150, 20);
        contentPane.add(passwordField);

        JButton btnSignIn = new JButton("Sign In");
        btnSignIn.setBackground(new Color(240, 240, 240));
        btnSignIn.setForeground(Color.BLACK);
        btnSignIn.setBounds(160, 150, 100, 30);
        btnSignIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic for signing in
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                // Replace the following line with your authentication logic
                authenticateUser(username, password);
            }
        });
        contentPane.add(btnSignIn);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the sign-in window
                dispose();
            }
        });
        btnCancel.setBounds(270, 150, 100, 30);
        contentPane.add(btnCancel);
    }

    // Method to simulate user authentication (replace this with your database logic)
    private void authenticateUser(String username, String password) {
        // Add your logic to authenticate the user
        // This is a placeholder method, replace it with actual authentication code
        System.out.println("Simulating user authentication...");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Add your authentication logic here
        // If authentication is successful, you might close this window and open the main application window
        // If authentication fails, you might display an error message to the user
    }

    public static void main(String[] args) {
        SignInWindow frame = new SignInWindow();
        frame.setVisible(true);
    }
}
