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
import javax.swing.border.EmptyBorder;

public class user_s extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    user_s frame = new user_s();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public user_s() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 550, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Welcome to the user Page!");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setBounds(87, 11, 225, 36);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel(" Explore convenience in customer interactions and efficient order management. Enjoy your experience!");
        lblNewLabel_1.setForeground(Color.BLUE);
        lblNewLabel_1.setBackground(Color.BLUE);
        lblNewLabel_1.setToolTipText("");
        lblNewLabel_1.setBounds(10, 44, 514, 49);
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("Customer Registration");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton.setBackground(Color.ORANGE);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openCustomerRegistration();
            }
        });
        btnNewButton.setBounds(20, 104, 180, 55);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Place Pre-order");
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPlacePreOrder();
            }
        });
        btnNewButton_1.setBackground(Color.GREEN);
        btnNewButton_1.setBounds(279, 182, 210, 55);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Place Order");
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton_2.setBackground(Color.MAGENTA);
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPlaceOrder();
            }
        });
        btnNewButton_2.setBounds(279, 104, 210, 49);
        contentPane.add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("EXIT");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_3.setBounds(10, 227, 89, 23);
        contentPane.add(btnNewButton_3);
    }

    private void openCustomerRegistration() {
        // Implement the logic to open the Customer Registration window
        CustomerRegistration_S customerRegistrationWindow = new CustomerRegistration_S();
        customerRegistrationWindow.setVisible(true);
    }

    private void openPlacePreOrder() {
        // Implement the logic to open the Place Pre-order window
        PlacePreorderWindow placePreorderWindow = new PlacePreorderWindow();
        placePreorderWindow.setVisible(true);
    }

    private void openPlaceOrder() {
        // Implement the logic to open the Place Order window
        PlaceOrderWindow placeOrderWindow = new PlaceOrderWindow();
        placeOrderWindow.setVisible(true);
    }
}
