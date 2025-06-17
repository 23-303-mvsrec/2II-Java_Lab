//package cse303java.JDBC;
import java.sql.*;
public class UpdatePrepared {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", 
                "root", 
                ""
            );

            String sql = "UPDATE Student11 SET Name = ? WHERE RollNo = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Akshay");
            preparedStatement.setInt(2, 103);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

            preparedStatement.close();
            connection.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}


/*
 * Run Command: java -cp :./mysql.jar UpdatePrepared
 * 
 * Output:
 * Rows affected: 1 
 * 
 * 
 * 
 * before {
 * 101 Vaishnavi cse
 * 102 Vamshidhar cs
 * 104 Arjun civil
 * 103 Arhaan mechanical
 * }
 * 
 * after {
 * 101 Vaishnavi cse
 * 102 Vamshidhar cs
 * 104 Arjun civil
 * 103 Akshay mechanical
 * }
 */
