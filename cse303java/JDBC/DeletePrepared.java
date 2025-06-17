//package cse303java.JDBC;
import java.sql.*;
// This program deletes a record from the Student11 table using a prepared statement

public class DeletePrepared {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", 
                "root", 
                ""
            );

            String sql = "DELETE FROM Student11 WHERE RollNo = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 103);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

            preparedStatement.close();
            connection.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
