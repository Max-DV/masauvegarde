package ServletConnexion;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chat.html")
public class ChatServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Afficher la vue chatroom

		Outils.vueChatRoom(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recuperer le texte du message, recup la date, recup l'utilisateur
		// conecté
		String texte = req.getParameter(Constantes.NOM_PARAMETRE_MESSAGE);
		Date date = new Date();
		User user = Outils.getConnectedUser(req);
		if(user==null){
			user= new User("Anony", "Mouss");
		}

		Message message = new Message(date, user, texte);
		Donnees.message.add(message);
	
		Outils.vueChatRoom(req, resp);
	}
}
