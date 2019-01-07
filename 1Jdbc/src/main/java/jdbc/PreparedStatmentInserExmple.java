package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PreparedStatmentInserExmple {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionUtils.getConnection();
		String insertQuery = "insert into user values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(insertQuery);

		pst.setInt(1, 90);
		pst.setString(2, "krishna");
		pst.setString(3, "Bang");
		int rows = pst.executeUpdate();

		System.out.println(rows + " Inserted successfully");
		pst.close();
		ConnectionUtils.closeConnection();

	}

}
