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
import javax.swing.border.EmptyBorder;

public class ViewPre_orders_s extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField txtFromDateTo;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewPre_orders_s frame = new ViewPre_orders_s();
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
    public ViewPre_orders_s() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 550, 600);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("View Pre-orders");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(160, 27, 213, 54);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Customer ID");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setBounds(37, 114, 148, 38);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(171, 123, 293, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Date Range");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2.setBounds(37, 188, 97, 14);
        contentPane.add(lblNewLabel_2);

        txtFromDateTo = new JTextField();
        txtFromDateTo.setText("From Date, To Date");
        txtFromDateTo.setBounds(171, 185, 293, 20);
        contentPane.add(txtFromDateTo);
        txtFromDateTo.setColumns(10);

        JButton btnNewButton = new JButton("SEARCH");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchPreOrders();
            }
        });
        btnNewButton.setBounds(253, 237, 179, 38);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_3 = new JLabel("Pre-order Results");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_3.setBounds(253, 331, 179, 14);
        contentPane.add(lblNewLabel_3);

        textField_1 = new JTextField();
        textField_1.setBounds(10, 351, 514, 199);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
    }

    private void searchPreOrders() {
        // Implement the logic to search and display pre-orders based on criteria
        // For example, you can retrieve pre-orders from a database and set the results in textField_1
        // Replace the following line with your actual logic
        textField_1.setText("Pre-orders will be displayed here based on search criteria.");
    }
}
