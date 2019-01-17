package com.user;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class UserServlet extends GenericServlet {

	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("ui");
		String name = req.getParameter("un");
		String addrs = req.getParameter("ua");
		int idInt = Integer.parseInt(uid);
		UserDao dao = new UserDao();
		dao.saveUser(idInt, name, addrs);
		
		
		RequestDispatcher rd=req.getRequestDispatcher("/saved.jsp");
		rd.forward(req, resp);
	}

}
