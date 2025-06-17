//package cse303java.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
// This program creates a table named Student11 in the MySQL database/*  */
public class CreateTable {
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/test", 
          "root", 
          ""
      );

      String sql = "CREATE TABLE Student11 (RollNo INT, Name VARCHAR(20), Branch VARCHAR(20))";
      Statement statement = connection.createStatement();
      statement.executeUpdate(sql);
      System.out.println("Table created successfully");

      statement.close();
      connection.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }  
}
