package ServletConnexion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class ServletDeconnexion extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

	req.getSession().invalidate();
	/*String url = req.getHeader("Referer");
		if(url==null ||url.isEmpty())
			url="index.html";
*/
		resp.sendRedirect("index.html");
}
}
