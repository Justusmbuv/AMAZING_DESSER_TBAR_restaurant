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

public class UserLoginWindow extends JFrame {

    private JPanel contentPane;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;

    public UserLoginWindow() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300, 300, 400, 250);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUsername.setBounds(50, 50, 80, 20);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPassword.setBounds(50, 90, 80, 20);
        contentPane.add(lblPassword);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(150, 50, 150, 20);
        contentPane.add(textFieldUsername);
        textFieldUsername.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 90, 150, 20);
        contentPane.add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic for user login
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                // Add your authentication logic here

                // For example, you might check the credentials against a database
                // If the credentials are valid, you can proceed to the user's dashboard
                // Otherwise, display an error message

                // For simplicity, let's just print the credentials for now
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            }
        });
        btnLogin.setBounds(180, 130, 89, 23);
        contentPane.add(btnLogin);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the user login window
                dispose();
            }
        });
        btnCancel.setBounds(280, 130, 89, 23);
        contentPane.add(btnCancel);
    }
}
