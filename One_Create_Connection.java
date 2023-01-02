import java.sql.*;

public class One_Create_Connection {
	public static void main(String[] args) throws SQLException {

		try {

			// Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create a Connection
			String url = "jdbc:mysql://localhost:3306/youtube";
			String user = "root";
			String password = "123456";

			Connection con = DriverManager.getConnection(url, user, password);

			if (con.isClosed()) {
				System.out.println("Connection is closed");
			} else {
				System.out.println("Congrats!! You are Connected to : " + con);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
