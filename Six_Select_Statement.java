import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Six_Select_Statement {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "123456");

			String qry = "Select * from users ";

			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(qry);

			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String city = set.getString(3);

				System.out.println(id + ", " + name + ", " + city);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
