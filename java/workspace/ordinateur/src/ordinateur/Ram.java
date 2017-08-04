package ordinateur;

public class Ram {

	private int capacite;

	public Ram(int capacite) {
		this.capacite = capacite;
	}

	public void initialiser() {
		System.out.println("Initialiation mémoire " + capacite + " Go");
	}

	public void eteindre() {
		System.out.println("Exctinction mémoire vive.");
	}
}
