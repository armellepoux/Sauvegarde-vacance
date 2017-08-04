package ordinateur;

public class DisqueDur {

	private int capacite;

	public DisqueDur(int capacite) {
		this.capacite = capacite;
	}

	public void demarrer() {
		System.out.println("Démarrage disque " + capacite + " Go");
	}

	public void eteindre() {
		System.out.println("Exinction disque " + capacite + " Go");
	}

	public void lire() {
		System.out.println("Lecture disque dur " + capacite + " Go");
	}

}
