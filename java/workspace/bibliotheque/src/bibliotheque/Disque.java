package bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Disque {

	private String nom;
	private String codeBarre;
	private List<Chanson> chansons;

	public Disque(String nom, String codeBarre) {
		this.nom = nom;
		this.codeBarre = codeBarre;
		chansons = new ArrayList<>();
	}

	public String getNom() {
		return nom;
	}

	public String getCodeBarre() {
		return codeBarre;
	}

	public List<Chanson> getChanson() {
		return chansons;
	}

	public void addChanson(Chanson chanson) {
		chansons.add(chanson);
	}

	public int getDuree() {
		int dureeTotale = 0;
		for (int i = 0; i < chansons.size(); i++) {
			dureeTotale += chansons.get(i).getDuree();
		}
		return dureeTotale;
	}

	@Override
	public String toString() {
		return "Titre=" + nom + ",  \r\n code barre=" + codeBarre + ",  \r\n chansons =" + chansons;
	}

	public void afficher() {
		//System.out.println("Disque : " + nom);
		//System.out.println("Code barre : " + codeBarre);
		System.out.println("Disque : " + getNom());
		System.out.println("Durée disque : " + getDuree());
	}

	public void afficherDetails() {
		afficher();
		for (Chanson chanson : chansons) {
			chanson.afficher();
		}
	}

}
