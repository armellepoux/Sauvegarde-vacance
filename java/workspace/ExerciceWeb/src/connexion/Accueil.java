package connexion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Accueil extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		User user = Outils.getConnectedUser(req);

		if (user == null)
			Outils.vueWelcomeNotConnected(req, resp);
		else
			Outils.vueWelcomeConnected(user, req, resp);
	}
}
