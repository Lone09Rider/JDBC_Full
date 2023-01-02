import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Five_Updating_Data {
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "123456");
			
			String qry = "Update users set city=? where id=?";
			PreparedStatement pstmt = con.prepareStatement(qry);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Id You want to update : ");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter City you want to update : ");
			String city = br.readLine();
			
			pstmt.setString(1, city);
			pstmt.setInt(2, id);
			
			pstmt.executeUpdate();
			
			System.out.println("Value Updated");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
