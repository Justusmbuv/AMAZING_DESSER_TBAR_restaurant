package Dashboard_sys;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;

public class PlaceOrder_S extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JLabel lblNewLabel_2;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PlaceOrder_S frame = new PlaceOrder_S();
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
    public PlaceOrder_S() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 550, 700);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Place Order");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(195, 11, 329, 54);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Customer ID");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setBounds(53, 91, 198, 29);
        contentPane.add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(261, 95, 263, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(53, 126, 471, 22);
        contentPane.add(comboBox);

        String[] dessertItems = {"Cheesecake - $7.99",
                "Chocolate Brownie Sundae - $6.49",
                "Strawberry Shortcake - $5.99",
                "Tiramisu - $8.49",
                "Red Velvet Cupcake - $3.99",
                "Mango Sorbet - $4.99",
                "Pecan Pie - $9.99",
                "Creme Brulee - $7.49",
                "Double Chocolate Mousse - $6.99",
                "Lemon Tart - $5.49"};

        comboBox.setModel(new DefaultComboBoxModel<>(dessertItems));

        lblNewLabel_2 = new JLabel("Quantity");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2.setBounds(53, 159, 121, 14);
        contentPane.add(lblNewLabel_2);

        textField_1 = new JTextField();
        textField_1.setBounds(261, 159, 263, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Total Amount");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_3.setBounds(53, 208, 110, 14);
        contentPane.add(lblNewLabel_3);

        textField_2 = new JTextField();
        textField_2.setBounds(261, 205, 263, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("Date");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_4.setBounds(53, 258, 110, 14);
        contentPane.add(lblNewLabel_4);

        textField_3 = new JTextField();
        textField_3.setBounds(261, 255, 263, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JLabel lblNewLabel_5 = new JLabel("Date Picker for Pre-order Date");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_5.setBounds(53, 325, 198, 14);
        contentPane.add(lblNewLabel_5);

        textField_4 = new JTextField();
        textField_4.setBounds(261, 322, 263, 20);
        contentPane.add(textField_4);
        textField_4.setColumns(10);

        JLabel lblNewLabel_6 = new JLabel("Time Picker for Pre-order Time");
        lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_6.setBounds(53, 406, 198, 14);
        contentPane.add(lblNewLabel_6);

        textField_5 = new JTextField();
        textField_5.setBounds(261, 403, 263, 20);
        contentPane.add(textField_5);
        textField_5.setColumns(10);

        JButton btnNewButton = new JButton("Submit Pre-order");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton.setBounds(195, 543, 329, 54);
        btnNewButton.addActionListener(e -> submitPreOrder());
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("EXIT");
        btnNewButton_1.addActionListener(e -> System.exit(0));
        btnNewButton_1.setBounds(10, 627, 89, 23);
        contentPane.add(btnNewButton_1);
    }

    private void submitPreOrder() {
        // Implement the logic to store the pre-order in the database or perform other actions
        // You can use the values from text fields, combo boxes, etc., to create and store the order
        // Display a confirmation message or handle errors as needed
        System.out.println("Pre-order submitted successfully!");
    }
}
