package io.sopra.pox3.servlet;

import java.io.IOException;

import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HorlogeServlet extends HttpServlet{
	
	Date d= new Date();
	
	
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String p1= 	req.getParameter("param1");
		String p2= 	req.getParameter("param2");
		resp.getWriter().print("<html><head><style>body{font-size:64; color:darkgreen; background-color:lightgrey; font-size:Algerian}</style></head><body><div>Il est : "+d+" bonne journée à tous</div><div>"+p1+""+p2+"</div></body></html>");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String p1= 	req.getParameter("param1");
		String p2= 	req.getParameter("param2");
		resp.getWriter().print("<html><head><style>body{font-size:64; color:darkgreen; background-color:lightgrey; font-size:Algerian}</style></head><body><div>Il est : "+d+" bonne journée à tous</div><div>"+p1+""+p2+"</div></body></html>");
	}
}

