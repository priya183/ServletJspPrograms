package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/FilterServlet")
public class IdFilter extends HttpFilter implements Filter {
       
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter pw=response.getWriter();
		HttpServletRequest rs=(HttpServletRequest)request;
		int id=Integer.parseInt(request.getParameter("id"));
		if(id>1)
		chain.doFilter(request, response);
		else
			pw.println("Invalid input");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
