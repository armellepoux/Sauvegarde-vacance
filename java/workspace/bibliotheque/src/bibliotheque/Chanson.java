package bibliotheque;

public class Chanson {

	@Override
	public String toString() {
		return "Titre=" + nom + ", durée=" + duree;
	}

	private String nom;
	private int duree;

	public Chanson(String nom, int duree) {
		this.nom = nom;
		this.duree = duree;
	}

	public String getNom() {
		return nom;
	}

	public int getDuree() {
		return duree;
	}

	public void afficher() {
		System.out.println(nom + " (" + duree + "s.)");

	}

}
