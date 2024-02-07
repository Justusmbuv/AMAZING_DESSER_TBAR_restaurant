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
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Dashboard_S extends JFrame {

    private JPanel contentPane;
    private JTextField txtSavorDivineDelights;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Dashboard_S frame = new Dashboard_S();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Dashboard_S() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 800, 500);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Home");
        lblNewLabel.setBounds(10, 11, 68, 14);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel.setForeground(Color.BLUE);
        contentPane.add(lblNewLabel);

        JTextPane txtpnWelcomeToAmazing = new JTextPane();
        txtpnWelcomeToAmazing.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
        txtpnWelcomeToAmazing.setText("Welcome to Amazing Dessert Bar, where sweet dreams come true! Indulge in a delightful journey of flavors and treat yourself to our exquisite desserts. From mouth-watering cakes to irresistible pastries, our menu is crafted with passion and perfection. Join us for a culinary experience that's nothing short of amazing. We look forward to making your moments sweeter at Amazing Dessert Bar!");
        txtpnWelcomeToAmazing.setBounds(247, 145, 287, 205);
        txtpnWelcomeToAmazing.setBackground(Color.LIGHT_GRAY);
        contentPane.add(txtpnWelcomeToAmazing);

        JButton btnSignIn = new JButton("SIGN IN");
        btnSignIn.setBackground(new Color(240, 240, 240));
        btnSignIn.setForeground(Color.BLACK);
        btnSignIn.setBounds(423, 105, 101, 29);
        btnSignIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the SignIn window
                SignInWindow signInWindow = new SignInWindow();
                signInWindow.setVisible(true);
            }
        });
        contentPane.add(btnSignIn);

        JButton btnAdminLogin = new JButton(" Admin Login");
        btnAdminLogin.setBounds(423, 36, 101, 23);
        btnAdminLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the AdminLogin window
                AdminLoginWindow adminLoginWindow = new AdminLoginWindow();
                adminLoginWindow.setVisible(true);
            }
        });
        contentPane.add(btnAdminLogin);

        JButton btnUserLogin = new JButton("User Login");
        btnUserLogin.setBounds(423, 70, 101, 23);
        btnUserLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the UserLogin window
                UserLoginWindow userLoginWindow = new UserLoginWindow();
                userLoginWindow.setVisible(true);
            }
        });
        contentPane.add(btnUserLogin);

        JTextPane txtpnAmazingDessertBar = new JTextPane();
        txtpnAmazingDessertBar.setFont(new Font("Tahoma", Font.BOLD, 30));
        txtpnAmazingDessertBar.setText("Amazing Dessert Bar");
        txtpnAmazingDessertBar.setBackground(Color.CYAN);
        txtpnAmazingDessertBar.setBounds(10, 51, 334, 83);
        contentPane.add(txtpnAmazingDessertBar);

        txtSavorDivineDelights = new JTextField();
        txtSavorDivineDelights.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtSavorDivineDelights.setForeground(Color.MAGENTA);
        txtSavorDivineDelights.setToolTipText("");
        txtSavorDivineDelights.setBackground(new Color(0, 255, 255));
        txtSavorDivineDelights.setText("Indulge in heavenly dessert bliss");
        txtSavorDivineDelights.setBounds(10, 145, 224, 205);
        contentPane.add(txtSavorDivineDelights);
        txtSavorDivineDelights.setColumns(10);
    }
}
