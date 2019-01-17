package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

	public void saveUser(int id, String name, String addrs) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root1234");
			String queryInsert = "insert into user values(?,?,?)";
			PreparedStatement pst = con.prepareStatement(queryInsert);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, addrs);
			pst.executeUpdate();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
