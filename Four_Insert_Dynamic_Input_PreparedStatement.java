import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Four_Insert_Dynamic_Input_PreparedStatement {
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/youtube";
			String user = "root";
			String password = "123456";

			Connection con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				
				String qry = "Insert into users(name, city) values(?, ?)";
				
				PreparedStatement pstmt = con.prepareStatement(qry);
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter your name : ");
				String name = br.readLine();
				System.out.println("Enter your city : ");
				String city = br.readLine();
				
				pstmt.setString(1, name);
				pstmt.setString(2, city);
				
				pstmt.executeUpdate();
				
				System.out.println("User Added");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
