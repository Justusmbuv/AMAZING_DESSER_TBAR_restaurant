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

public class ViewReports_s extends JFrame {

    private JPanel contentPane;
    private JTextField txtPutfromDate;
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewReports_s frame = new ViewReports_s();
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
    public ViewReports_s() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 750, 500);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("View Reports");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNewLabel.setBounds(168, 0, 209, 58);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Date Range");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_1.setBounds(41, 83, 188, 24);
        contentPane.add(lblNewLabel_1);

        txtPutfromDate = new JTextField();
        txtPutfromDate.setText("put ((From Date, To Date)");
        txtPutfromDate.setToolTipText("");
        txtPutfromDate.setBounds(239, 85, 277, 20);
        contentPane.add(txtPutfromDate);
        txtPutfromDate.setColumns(10);

        JButton btnNewButton = new JButton("Generate Report");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generateReport();
            }
        });
        btnNewButton.setBackground(Color.BLUE);
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton.setBounds(319, 116, 138, 23);
        contentPane.add(btnNewButton);

        textField = new JTextField();
        textField.setBounds(77, 205, 572, 256);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Report Results");
        lblNewLabel_2.setBackground(Color.CYAN);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2.setBounds(319, 180, 138, 14);
        contentPane.add(lblNewLabel_2);
    }

    private void generateReport() {
        // Implement the logic to generate reports based on the entered date range
        // For example, you can retrieve data from a database and set the results in textField
        // Replace the following line with your actual logic
        textField.setText("Reports will be generated here based on the entered date range.");
    }
}
