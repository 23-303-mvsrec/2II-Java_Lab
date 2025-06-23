import java.sql.*;


class insertPro{
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
			System.out.println("Inserted succcesfully");
			PreparedStatement ps8=con.prepareStatement("DELETE FROM Item WHERE ItemId=?");
			ps8.setInt(1,190);
			ps8.executeUpdate();
			System.out.println("Deleted succcesfully");

			ps8.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
