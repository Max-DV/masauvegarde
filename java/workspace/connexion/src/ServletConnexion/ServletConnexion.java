package ServletConnexion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConnexion extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Outils.vueProduireFormulaire(req, resp, "veuillez indiquer votre nom et prenom");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String nom = req.getParameter(Constantes.NOM_PARAMETRE_NOM);

		String prenom = req.getParameter(Constantes.NOM_PARAMETRE_PRENOM);
		// System.out.println(nom);
		if (nom == null || nom.isEmpty() || prenom == null || prenom.isEmpty()) {
			resp.setContentType("text/html");
			Outils.vueProduireFormulaire(req, resp, "Il me faut un nom ET un prénom");
			// System.out.println("je suis la");
			return;

		}

		User user = new User(nom, prenom);
		Outils.setConnectedUser(user, req);
		resp.setContentType("text/html");
		resp.getWriter().println("<html><head><style>body{font-size:64; color:darkgreen; background-color:yellow; "
				+ "+font-size:Algerian}</style></head><body><img src='a/cat.gif'><div>Bonjour " + user.getNom() + "  "
				+ user.getPrenom() + "<a href='index.html'> "
				+ "accueil<a><form action='deconnexion.html'><button type = 'submit' >Déconnection</button></form></body></html>");

	}

}
