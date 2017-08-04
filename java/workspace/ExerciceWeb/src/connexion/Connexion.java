package connexion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Connexion extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Outils.vueProduireFormulaire(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nom = req.getParameter(Constante.NOM_PARAMETRE_NOM);
		String prenom = req.getParameter(Constante.PRENOM_PARAMETRE_PRENOM);

		if (nom == null || nom.isEmpty() || prenom == null || prenom.isEmpty()) {
			Outils.vueProduireFormulaireErreur("Veuillez remplir le champ nom et le champ prénom !", req, resp);
			return;
		}

		User user = new User(nom, prenom);
		Outils.setConnectedUser(user, req);

		Outils.vueConnected(user, req, resp);

	}

}
