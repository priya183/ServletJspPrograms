package com.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//for using sendRedirect() method here we cannot use getAttribute()
		//int k=Integer.parseInt(req.getParameter("k"));
		
		//for RequestDispatcher
		//int k=(int) req.getAttribute("k");
		
		//for session
		//HttpSession session=req.getSession();
		//int k=(int) session.getAttribute("k");
		
		//using cookies
		int k=0;
		//client can send multiple cookies at a time so we need to take its array
		Cookie cookie[]=req.getCookies();
		for(Cookie c:cookie)
		{
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
				
		}
		k=k*k;
		PrintWriter pw=res.getWriter();
		pw.println("Addition & Square= "+k);
	}

}
