import java.sql.*;

public class exp04 {
    public static void main(String[] args) {
        try {
            // Step 1: Load and register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password"
            );

            System.out.println("Database Connected Successfully!");

            // Step 3: Create Statement object
            Statement stmt = con.createStatement();

            // Step 4: Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            // Step 5: Close connection
            con.close();
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
    }
}
