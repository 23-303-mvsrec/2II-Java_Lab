import java.sql.*;

class db1 { 
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/std", "root", "");
            String query = "INSERT INTO std10 (id, name) VALUES (?, ?)";
            PreparedStatement pt = con.prepareStatement(query);
            
            // Set the parameters for the prepared statement
            pt.setInt(1, 10); // Assuming the first column is an integer
            pt.setString(2, "cherry"); // Assuming the second column is a string
            
            // Execute the update and get the number of affected rows
            int res = pt.executeUpdate();
            if (res > 0) {
                System.out.println("Row inserted successfully....!");
            } else {
                System.out.println("Row not created....! " + res);
            }
            
            // Close the resources
            pt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

