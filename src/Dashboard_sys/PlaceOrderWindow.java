package Dashboard_sys;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlaceOrderWindow extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        PlaceOrderWindow frame = new PlaceOrderWindow();
        frame.setVisible(true);
    }

    public PlaceOrderWindow() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300, 200, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(Color.YELLOW);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Place Order Window");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel.setBounds(120, 30, 200, 20);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Select items and place your order!");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_1.setBounds(90, 70, 250, 20);
        contentPane.add(lblNewLabel_1);

        // Sample items
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};

        // Create checkboxes for each item
        int yPosition = 100;
        for (String item : items) {
            JCheckBox checkBox = new JCheckBox(item);
            checkBox.setBounds(50, yPosition, 150, 20);
            contentPane.add(checkBox);
            yPosition += 30;
        }

        JButton btnPlaceOrder = new JButton("Place Order");
        btnPlaceOrder.setBackground(new Color(0, 128, 0));
        btnPlaceOrder.setForeground(Color.WHITE);
        btnPlaceOrder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                placeOrder();
            }
        });
        btnPlaceOrder.setBounds(160, yPosition, 120, 30);
        contentPane.add(btnPlaceOrder);
    }

    private void placeOrder() {
        // Implement the logic to place the order
        System.out.println("Order Placed!");
        // You can open the OrderConfirmationWindow or any other window as needed
        OrderConfirmationWindow orderConfirmationWindow = new OrderConfirmationWindow();
        orderConfirmationWindow.setVisible(true);
        // You can add more functionality here as needed
    }
}
