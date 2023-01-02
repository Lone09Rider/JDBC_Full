import java.sql.*;

public class Two_Creating_Table {
	public static void main(String[] args) throws SQLException {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/youtube";
			String user = "root";
			String password = "123456";

			Connection con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				String qry = "Create table users(id int primary key auto_increment, "
						+ "name varchar(200), city varchar(200))";
				
				Statement stmt = con.createStatement();
				stmt.executeUpdate(qry);
				System.out.println("Table Created");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
