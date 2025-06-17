//package cse303java.JDBC;

import java.sql.*;

public class SelectExample {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", 
                "root", 
                ""
            );

            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM Student11";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()) {
                System.out.println(
                    resultSet.getInt("RollNo") + " " +
                    resultSet.getString("Name") + " " +
                    resultSet.getString(3)
                );
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
/*
 * Run Command: java -cp :./mysql.jar SelectExample
 * 
 * Output:
 * 101 Vaishnavi cse
102 Vamshidhar cs
104 Arjun civil
103 Arhaan mechanical
 */