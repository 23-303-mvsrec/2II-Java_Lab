import java.util.*;

import java.sql.*;


public class Retrieval {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student roll number: ");

        int rno = sc.nextInt();

       

        String dbUrl = "jdbc:mysql://localhost:3306/test";

        String user = "root";

        String password = "";


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(dbUrl, user, password);

            System.out.println("Database connection successful");


            String query = "SELECT * FROM student WHERE rno = ?";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, rno);


            ResultSet rs = pst.executeQuery();

            boolean result = rs.next();


            System.out.println("Student Details:\n===========");

            if (result) {

                System.out.println("Roll No\tName\tBranch\tMarks\n======\t=====\t======\t=====");

                System.out.printf("%d\t%s\t%s\t%.2f%n",

                                  rs.getInt(1),

                                  rs.getString(2),

                                  rs.getString(3),

                                  rs.getDouble(4));

            } else {

                System.out.println("Record doesn't exist");

            }


            rs.close();

            pst.close();

            con.close();

        } catch (Exception e) {

            System.out.println("Database error: " + e.getMessage());

        }

    }

}
