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
import javax.swing.JTextField;

public class admn_s extends JFrame {

    private JPanel contentPane;
    private JTextField txtWelcomeToThe;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    admn_s frame = new admn_s();
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
    public admn_s() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 550, 400);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(null);
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JButton btnCustomerRegistration = new JButton("Customer Registration");
        btnCustomerRegistration.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnCustomerRegistration.setBounds(10, 127, 178, 96);
        btnCustomerRegistration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic for Customer Registration
                // For example, open a new Customer Registration window
            	CustomerRegistration_S customerRegistrationWindow = new CustomerRegistration_S();
                customerRegistrationWindow.setVisible(true);
            }
        });
        contentPane.add(btnCustomerRegistration);

        JButton btnStaffRegistration = new JButton("Staff Registration");
        btnStaffRegistration.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnStaffRegistration.setBounds(10, 234, 178, 97);
        btnStaffRegistration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic for Staff Registration
                // For example, open a new Staff Registration window
                StaffRegistration_S staffRegistrationWindow = new StaffRegistration_S();
                staffRegistrationWindow.setVisible(true);
            }
        });
        contentPane.add(btnStaffRegistration);

        JButton btnPlaceOrder = new JButton("Place Order");
        btnPlaceOrder.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnPlaceOrder.setBounds(254, 127, 170, 49);
        btnPlaceOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic for Place Order
                // For example, open a new Place Order window
                PlaceOrder_S placeOrderWindow = new PlaceOrder_S();
                placeOrderWindow.setVisible(true);
            }
        });
        contentPane.add(btnPlaceOrder);

        JButton btnPlacePreorder = new JButton("Place Pre-order");
        btnPlacePreorder.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnPlacePreorder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic for Place Pre-order
                // For example, open a new Place Pre-order window
                PlacePreorderWindow placePreorderWindow = new PlacePreorderWindow();
                placePreorderWindow.setVisible(true);
            }
        });
        btnPlacePreorder.setBounds(254, 187, 170, 54);
        contentPane.add(btnPlacePreorder);

        JButton btnViewReports = new JButton("View Reports");
        btnViewReports.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnViewReports.setBounds(254, 252, 170, 79);
        btnViewReports.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic for View Reports
                // For example, open a new View Reports window
                ViewReportsWindow viewReportsWindow = new ViewReportsWindow();
                viewReportsWindow.setVisible(true);
                // Connect to the database and populate report results
                connectToDatabase(viewReportsWindow);
            }
        });
        contentPane.add(btnViewReports);

        txtWelcomeToThe = new JTextField();
        txtWelcomeToThe.setForeground(Color.BLUE);
        txtWelcomeToThe.setBackground(Color.LIGHT_GRAY);
        txtWelcomeToThe.setFont(new Font("Tahoma", Font.BOLD, 8));
        txtWelcomeToThe.setText("Welcome to the Admin Page!\r\nEmpower your control with seamless management\r\nand insightful reporting. Enjoy!");
        txtWelcomeToThe.setBounds(10, 67, 449, 49);
        contentPane.add(txtWelcomeToThe);
        txtWelcomeToThe.setColumns(10);

        JLabel lblNewLabel = new JLabel("Welcome to the Admin Page!");
        lblNewLabel.setIcon(null);
        lblNewLabel.setBackground(Color.MAGENTA);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(101, 11, 275, 40);
        contentPane.add(lblNewLabel);

        JButton btnExit = new JButton("EXIT");
        btnExit.setForeground(Color.RED);
        btnExit.setBounds(434, 327, 89, 23);
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add logic for exit button
                // For example, close the application
                System.exit(0);
            }
        });
        contentPane.add(btnExit);
    }

    private void connectToDatabase(ViewReportsWindow viewReportsWindow) {
        // Add your database connection logic here
        // Fetch data from the database and populate the ViewReportsWindow
        // For example, you can call methods on viewReportsWindow to update the reportResultsTextArea
        // viewReportsWindow.generateReport(); // Assuming you have a method to generate the report
    }
    
}
