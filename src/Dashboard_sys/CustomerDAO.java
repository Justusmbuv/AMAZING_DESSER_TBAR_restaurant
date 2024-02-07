package Dashboard_sys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {

    // Example method to insert a new customer
    public void addCustomer(String firstName, String lastName, String city, String mobileNumber) {
        try (Connection connection = DatabaseManager.getConnection()) {
            String sql = "INSERT INTO Customers (FirstName, LastName, City, MobileNumber) VALUES (?, ?, ?, ?)";
            
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, firstName);
                preparedStatement.setString(2, lastName);
                preparedStatement.setString(3, city);
                preparedStatement.setString(4, mobileNumber);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Customer added successfully.");
                } else {
                    System.out.println("Failed to add customer.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error adding customer: " + e.getMessage());
        }
    }
}
