package Dashboard_sys;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlacePreorderWindow extends JFrame {

    private JPanel contentPane;
    private JComboBox<String> dessertComboBox;
    private JTextField quantityTextField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PlacePreorderWindow frame = new PlacePreorderWindow();
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
    public PlacePreorderWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 550, 400);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel titleLabel = new JLabel("Place Pre-order");
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        titleLabel.setBounds(180, 20, 200, 30);
        contentPane.add(titleLabel);

        JLabel dessertLabel = new JLabel("Select Dessert:");
        dessertLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        dessertLabel.setBounds(40, 80, 120, 20);
        contentPane.add(dessertLabel);

        dessertComboBox = new JComboBox<>();
        dessertComboBox.setModel(new DefaultComboBoxModel<>(getDessertItems()));
        dessertComboBox.setBounds(180, 80, 250, 20);
        contentPane.add(dessertComboBox);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        quantityLabel.setBounds(40, 120, 80, 20);
        contentPane.add(quantityLabel);

        quantityTextField = new JTextField();
        quantityTextField.setBounds(180, 120, 80, 20);
        contentPane.add(quantityTextField);

        JButton submitButton = new JButton("Submit Pre-order");
        submitButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                submitPreorder();
            }
        });
        submitButton.setBounds(180, 170, 150, 30);
        contentPane.add(submitButton);
    }

    private String[] getDessertItems() {
        // Replace this with your actual list of dessert items
        return new String[]{"Cheesecake", "Chocolate Brownie Sundae", "Strawberry Shortcake", "Tiramisu",
                "Red Velvet Cupcake", "Mango Sorbet", "Pecan Pie", "Creme Brulee", "Double Chocolate Mousse",
                "Lemon Tart"};
    }

    private void submitPreorder() {
        // Implement the logic to handle the pre-order submission
        String selectedDessert = (String) dessertComboBox.getSelectedItem();
        String quantity = quantityTextField.getText();

        // Replace this with your actual logic
        System.out.println("Dessert: " + selectedDessert + ", Quantity: " + quantity);
    }
}
