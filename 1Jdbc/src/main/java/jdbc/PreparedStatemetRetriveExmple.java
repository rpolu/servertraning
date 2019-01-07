package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatemetRetriveExmple {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root1234");
		String retrieveQuery = "select * from user where userid=?";
		PreparedStatement pst = con.prepareStatement(retrieveQuery);
		pst.setInt(1, 90);
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int id = rs.getInt(1);
			String nm = rs.getString(2);
			String addrs = rs.getString("addrs");
			System.out.println(id + " " + nm + " " + addrs);
		}
		rs.close();
		pst.close();
		con.close();

	}

}
