package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse rs) throws IOException , ServletException
	{
		String name="Priya";
		req.setAttribute("label", name);
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		rd.forward(req, rs);
	}

}
