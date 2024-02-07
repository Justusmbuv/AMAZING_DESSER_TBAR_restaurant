package Dashboard_sys;

import java.awt.Color;
import java.awt.EventQueue;
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

public class CustomerRegistration_S extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JPasswordField passwordField;
    private JPasswordField passwordField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CustomerRegistration_S frame = new CustomerRegistration_S();
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
    public CustomerRegistration_S() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 850, 600);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Customer Registration");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(132, 11, 237, 29);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("First Name");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setBounds(42, 147, 129, 29);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Last Name");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2.setBounds(42, 187, 129, 29);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("City ");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_3.setBounds(46, 227, 108, 29);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Mobile Number");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_4.setBounds(42, 271, 112, 14);
        contentPane.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Email");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_5.setBounds(42, 329, 46, 14);
        contentPane.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Password");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_6.setBounds(42, 389, 75, 14);
        contentPane.add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("Confirm Password");
        lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_7.setBounds(46, 433, 125, 14);
        contentPane.add(lblNewLabel_7);

        textField = new JTextField();
        textField.setBounds(240, 151, 245, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(240, 191, 245, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(240, 231, 245, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(240, 268, 245, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setBounds(240, 326, 245, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(240, 389, 245, 20);
        contentPane.add(passwordField);

        passwordField_1 = new JPasswordField();
        passwordField_1.setBounds(240, 430, 245, 20);
        contentPane.add(passwordField_1);

        JButton btnNewButton = new JButton("RESET");
        btnNewButton.setBounds(396, 472, 89, 23);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic to reset the text fields and password fields
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                textField_4.setText("");
                passwordField.setText("");
                passwordField_1.setText("");
            }
        });
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("REGISTER");
        btnNewButton_1.setBackground(Color.BLUE);
        btnNewButton_1.setForeground(Color.BLACK);
        btnNewButton_1.setBounds(532, 472, 302, 89);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic to register the customer
                String firstName = textField.getText();
                String lastName = textField_1.getText();
                String city = textField_2.getText();
                String mobileNumber = textField_3.getText();
                String email = textField_4.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(passwordField_1.getPassword());

                // Check if passwords match
                if (!password.equals(confirmPassword)) {
                    System.out.println("Passwords do not match.");
                    // Add appropriate error handling or user notification
                    return;
                }

                // Insert customer data into the database
                CustomerDAO customerDAO = new CustomerDAO();
                customerDAO.addCustomer(firstName, lastName, city, mobileNumber);

                // Add logic to handle email, password, and registration in your database
                // ...

                // Optional: Display a success message or redirect to a new window
                System.out.println("Customer registered successfully.");
                // You might want to close this window or show a success message to the user
            }
        });
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("EXIT");
        btnNewButton_2.setBounds(0, 538, 89, 23);
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic to exit the application
                System.exit(0);
            }
        });
        contentPane.add(btnNewButton_2);

        JLabel lblNewLabel_8 = new JLabel(
                "Welcome to the Sweet Community! Join us and indulge in delightful treats. Register now to make your dessert experience even more special. Enjoy!");
        lblNewLabel_8.setFont(new Font("Tahoma", Font.ITALIC, 11));
        lblNewLabel_8.setBackground(Color.BLUE);
        lblNewLabel_8.setForeground(Color.BLACK);
        lblNewLabel_8.setBounds(45, 45, 779, 49);
        contentPane.add(lblNewLabel_8);
    }
}
