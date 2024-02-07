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

public class ViewOrders_s extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField txtfromDateTo;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewOrders_s frame = new ViewOrders_s();
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
    public ViewOrders_s() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 550, 600);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("View Orders");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(166, 11, 215, 29);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Customer ID ");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setBounds(40, 76, 179, 29);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(202, 80, 275, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Date Range");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2.setBounds(40, 175, 139, 14);
        contentPane.add(lblNewLabel_2);

        txtfromDateTo = new JTextField();
        txtfromDateTo.setText("(From Date, To Date)");
        txtfromDateTo.setBounds(202, 172, 275, 20);
        contentPane.add(txtfromDateTo);
        txtfromDateTo.setColumns(10);

        JButton btnNewButton = new JButton("Search");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchOrders();
            }
        });
        btnNewButton.setBounds(202, 236, 144, 36);
        contentPane.add(btnNewButton);

        textField_1 = new JTextField();
        textField_1.setBounds(10, 337, 514, 213);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Order Results");
        lblNewLabel_3.setBackground(Color.BLUE);
        lblNewLabel_3.setForeground(new Color(0, 0, 0));
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_3.setBounds(215, 312, 111, 14);
        contentPane.add(lblNewLabel_3);
    }

    private void searchOrders() {
        // Implement the logic to search and display orders based on criteria
        // For example, you can retrieve orders from a database and set the results in textField_1
        // Replace the following line with your actual logic
        textField_1.setText("Orders will be displayed here based on search criteria.");
    }
}
