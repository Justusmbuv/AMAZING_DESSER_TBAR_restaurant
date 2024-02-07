package Dashboard_sys;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ViewReportsWindow extends JFrame {

    private JPanel contentPane;
    private JTextField dateRangeTextField;
    private JTextArea reportResultsTextArea;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViewReportsWindow frame = new ViewReportsWindow();
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
    public ViewReportsWindow() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 750, 500);
        contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN);
        contentPane.setBorder(null);
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel titleLabel = new JLabel("View Reports");
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        titleLabel.setBounds(300, 20, 150, 30);
        contentPane.add(titleLabel);

        JLabel dateRangeLabel = new JLabel("Date Range:");
        dateRangeLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        dateRangeLabel.setBounds(50, 80, 80, 20);
        contentPane.add(dateRangeLabel);

        dateRangeTextField = new JTextField();
        dateRangeTextField.setBounds(150, 80, 200, 20);
        contentPane.add(dateRangeTextField);

        JButton generateReportButton = new JButton("Generate Report");
        generateReportButton.setBackground(Color.BLUE);
        generateReportButton.setForeground(Color.BLACK);
        generateReportButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        generateReportButton.setBounds(400, 80, 150, 20);
        generateReportButton.addActionListener(e -> generateReport());
        contentPane.add(generateReportButton);

        reportResultsTextArea = new JTextArea();
        reportResultsTextArea.setBounds(50, 120, 650, 300);
        contentPane.add(reportResultsTextArea);

        JLabel reportResultsLabel = new JLabel("Report Results");
        reportResultsLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        reportResultsLabel.setBounds(350, 440, 150, 20);
        contentPane.add(reportResultsLabel);
    }

    private void generateReport() {
        // Implement the logic to generate the report based on the entered date range
        String dateRange = dateRangeTextField.getText();

        // Replace this with your actual logic to generate the report
        String reportResult = "Generated report for date range: " + dateRange + "\n[Sample Report Data]";
        reportResultsTextArea.setText(reportResult);
    }
}
