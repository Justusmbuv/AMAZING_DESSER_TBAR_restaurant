package Dashboard_sys;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

public class login_s extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login_s frame = new login_s();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public login_s() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 550, 400);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("USER LOGIN");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setForeground(new Color(0, 153, 0));
        lblNewLabel.setBounds(177, 22, 146, 32);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("USERNAME");
        lblNewLabel_1.setForeground(Color.BLUE);
        lblNewLabel_1.setBounds(29, 133, 66, 14);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("PASSWORD");
        lblNewLabel_2.setForeground(Color.BLUE);
        lblNewLabel_2.setBounds(29, 208, 66, 14);
        contentPane.add(lblNewLabel_2);

        textField = new JTextField();
        textField.setBounds(131, 130, 290, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(131, 202, 290, 20);
        contentPane.add(passwordField);

        JButton btnNewButton = new JButton("LOGIN");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Call the authentication method
                if (authenticateUser(textField.getText(), String.valueOf(passwordField.getPassword()))) {
                    // If authentication successful, open the dashboard or perform other actions
                    Dashboard_S dashboard = new Dashboard_S();
                    dashboard.setVisible(true);
                    dispose(); // Close the login window
                } else {
                    // Display an error message or handle unsuccessful login
                    System.out.println("Invalid credentials. Please try again.");
                }
            }
        });
        btnNewButton.setBounds(332, 307, 89, 43);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("EXIT");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_1.setForeground(Color.GRAY);
        btnNewButton_1.setBounds(10, 327, 59, 23);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("RESET");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear the username and password fields
                textField.setText("");
                passwordField.setText("");
            }
        });
        btnNewButton_2.setBounds(332, 233, 89, 23);
        contentPane.add(btnNewButton_2);

        JSeparator separator = new JSeparator();
        separator.setBounds(29, 261, 455, 2);
        contentPane.add(separator);
    }

    // Method to authenticate the user against the database
    private boolean authenticateUser(String username, String password) {
        try (Connection connection = DatabaseManager.getConnection()) {
            String sql = "SELECT * FROM Users WHERE Username = ? AND Password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next(); // If a row is returned, authentication is successful
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Authentication failed
    }
}
