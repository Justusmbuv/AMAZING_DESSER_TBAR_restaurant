package Dashboard_sys;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderConfirmationWindow extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        OrderConfirmationWindow frame = new OrderConfirmationWindow();
        frame.setVisible(true);
    }

    public OrderConfirmationWindow() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300, 200, 400, 200);
        contentPane = new JPanel();
        contentPane.setBackground(Color.CYAN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblOrderConfirmation = new JLabel("Order Confirmation");
        lblOrderConfirmation.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblOrderConfirmation.setBounds(110, 20, 200, 20);
        contentPane.add(lblOrderConfirmation);

        JLabel lblThankYou = new JLabel("Thank you for placing your order!");
        lblThankYou.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblThankYou.setBounds(70, 60, 300, 20);
        contentPane.add(lblThankYou);

        JButton btnOk = new JButton("OK");
        btnOk.setBackground(new Color(0, 128, 0));
        btnOk.setForeground(Color.WHITE);
        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the OrderConfirmationWindow
            }
        });
        btnOk.setBounds(150, 100, 80, 30);
        contentPane.add(btnOk);
    }
}
