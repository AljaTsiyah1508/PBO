import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Koneksidb {
    // Connection details for customer database
    private static final String CUSTOMER_URL = "jdbc:mysql://localhost:3306/alat_tulis";
    private static final String CUSTOMER_USER = "alja";
    private static final String CUSTOMER_PASSWORD = "admin";

    // Connection details for admin database
    private static final String ADMIN_URL = "jdbc:mysql://localhost:3306/alat_tulis";
    private static final String ADMIN_USER = "nana";
    private static final String ADMIN_PASSWORD = "nana@gmail.com";

    // Method to get connection to customer database
    public static Connection getCustomerConnection() throws SQLException {
        return DriverManager.getConnection(CUSTOMER_URL, CUSTOMER_USER, CUSTOMER_PASSWORD);
    }

    // Method to get connection to admin database
    public static Connection getAdminConnection() throws SQLException {
        return DriverManager.getConnection(ADMIN_URL, ADMIN_USER, ADMIN_PASSWORD);
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
