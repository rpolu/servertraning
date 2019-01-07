package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStmtBatchUpdates {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root1234");
		String insertQuery = "insert into user values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(insertQuery);

		pst.setInt(1, 91);
		pst.setString(2, "YYY");
		pst.setString(3, "Bang");
		pst.addBatch();

		pst.setInt(1, 92);
		pst.setString(2, "KKK");
		pst.setString(3, "Bang");
		pst.addBatch();

		pst.executeBatch();

		System.out.println(" Updated successfully");
		pst.close();
		con.close();

	}

}
