import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Three_Insert_Data_PreparedStatements {
	public static void main(String[] args) throws SQLException {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "123456");
			
			String qry = "Insert into users(name, city) values(?, ?)";
			PreparedStatement pstmt = con.prepareStatement(qry);
			pstmt.setString(1, "KirA");
			pstmt.setString(2, "Chennai");
			
			pstmt.executeUpdate();
			
			System.out.println("Updated 1 Value");
			
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
