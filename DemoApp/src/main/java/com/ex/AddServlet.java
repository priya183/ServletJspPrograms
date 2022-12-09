package com.ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//by extending this HttpServlet your class becomes servlet
@WebServlet("/add")
public class AddServlet extends HttpServlet{
	
	//here we can use doGet() or doPost() method instead of service
	//but we need to mention method="get" in <form> tag in index.html
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//calling same servlet
		/*
		PrintWriter out=res.getWriter();
		out.println("Result is="+k);
		*/
		
		//calling servlet from another servlet using RequestDispatcher
		/*req.setAttribute("k", k);
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req, res);*/
		
		
		//calling servlet from another servlet using sendRedirect() method
		//here we need response object 
		//res.sendRedirect("sq?k="+k);
		
		
		//using session we can send the data from 1 servlet to another
		//HttpSession session=req.getSession();
		//session.setAttribute("k", k);
		
		//using cookies
		Cookie cookie=new Cookie("k",k+"");res.addCookie(cookie);
		
		res.sendRedirect("sq");
	}

}
