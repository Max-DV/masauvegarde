package io.sopra.pox3.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
resp.setContentType("text/html");
resp.getWriter().print("<html><head><style>body{font-size:64; color:green; background-color:lightgrey}</style></head><body>J'essuie ton p�re</body></html>");
	
	}


}

