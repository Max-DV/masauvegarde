package ServletConnexion;

import java.awt.List;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChatRooms.html")
public class ListChatRoomServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	Outils.vueListChatRoom(Donnees.ChatRooms, req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String name= req.getParameter("name");
User user= (User) req.getSession().getAttribute(Constantes.CLE_SESSION_USER);
ChatRoom ChatRoom= new ChatRoom();
Donnees.ChatRooms.add(ChatRoom);
Outils.vueListChatRoom(Donnees.ChatRooms, req, resp);
	}
}
