package Dashboard_sys;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class StaffRegistration_S extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JFormattedTextField formattedTextField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffRegistration_S frame = new StaffRegistration_S();
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
	public StaffRegistration_S() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 750, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Staff Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(250, 11, 266, 33);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(36, 142, 190, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(36, 187, 190, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Hire Date");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(36, 239, 190, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Job Role");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(36, 285, 190, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(39, 323, 201, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(36, 428, 190, 14);
		contentPane.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Confirm Password");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(36, 478, 201, 14);
		contentPane.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Phone Number");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(36, 371, 190, 14);
		contentPane.add(lblNewLabel_8);

		textField = new JTextField();
		textField.setBounds(250, 139, 289, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(250, 184, 289, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(250, 236, 289, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(250, 282, 289, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(250, 320, 289, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(250, 368, 289, 20);
		contentPane.add(formattedTextField);

		passwordField = new JPasswordField();
		passwordField.setBounds(250, 475, 289, 20);
		contentPane.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(250, 410, 289, 20);
		contentPane.add(passwordField_1);

		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setBounds(0, 538, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(544, 517, 190, 44);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerStaff();
			}
		});
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("RESET");
		btnNewButton_2.setBounds(435, 504, 98, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetFields();
			}
		});
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_9 = new JLabel(
				"Welcome to the Staff Registration Portal! Join our dessert dream team and let's create sweet moments together. Exciting journey ahead!");
		lblNewLabel_9.setBackground(new Color(240, 240, 240));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_9.setBounds(0, 55, 734, 63);
		contentPane.add(lblNewLabel_9);
	}

	private void registerStaff() {
		// Implement the logic to register staff in the database or perform other actions
		// You can use the values from text fields, formatted text field, password fields, etc.
		// Example: String firstName = textField.getText();
		// Perform registration logic here
		System.out.println("Staff registered!");
	}

	private void resetFields() {
		// Implement the logic to reset all input fields
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		formattedTextField.setValue(null);
		passwordField.setText("");
		passwordField_1.setText("");
	}
}
