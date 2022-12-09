package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/FilterServlet")
public class FilterServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest req,HttpServletResponse rs) throws IOException , ServletException
	{
		PrintWriter pw=rs.getWriter();
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		pw.println("welcome "+name);
	}

}
