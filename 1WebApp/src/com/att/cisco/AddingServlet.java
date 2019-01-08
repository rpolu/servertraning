package com.att.cisco;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AddingServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String num1 = req.getParameter("n1");
		String num2 = req.getParameter("n2");
		int num1Int = Integer.parseInt(num1);
		int num2Int = Integer.parseInt(num2);
		int result = num1Int + num2Int;
		PrintWriter pw = resp.getWriter();
		pw.println("The Resulut is: " + result);
	}

}
