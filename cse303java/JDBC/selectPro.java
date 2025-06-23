import java.sql.*;

class selectPro{
	public static void main(String args[]){
		try{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/test";
			String user="root";
			String pass="";
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("DB connected succesfully");	
			String query="select * from Item";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "); 
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
