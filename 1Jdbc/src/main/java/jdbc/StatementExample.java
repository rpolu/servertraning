package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementExample {

	public static void main(String[] args) throws Exception {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/sys";
		String user = "root";
		String password = "root1234";

		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		String insertQuery = "insert into user values(1,'rama','bang')";
		int rows = st.executeUpdate(insertQuery);

		System.out.println(rows + " Inserted successfully");
		st.close();
		con.close();

	}

}
