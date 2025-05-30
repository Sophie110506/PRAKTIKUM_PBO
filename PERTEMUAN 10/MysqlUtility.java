package jdbc.utilities;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static final String URL = "jdbc:mysql://localhost:3306/Mahasiswa";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    // Method untuk mendapatkan koneksi database
    public static Connection getConnection() throws SQLException {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver tidak ditemukan", e);
        }
    }
    
    // Method untuk menutup koneksi
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Koneksi database ditutup");
            } catch (SQLException e) {
                System.err.println("Error saat menutup koneksi: " + e.getMessage());
            }
        }
    }
    
    // Method untuk test koneksi
    public static boolean testConnection() {
        try {
            Connection conn = getConnection();
            if (conn != null) {
                System.out.println("Koneksi berhasil!");
                closeConnection(conn);
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
        return false;
    }
}