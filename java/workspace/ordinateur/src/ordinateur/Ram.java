package ordinateur;

public class Ram {

	private int capacite;

	public Ram(int capacite) {
		this.capacite = capacite;
	}

	public void initialiser() {
		System.out.println("Initialiation m�moire " + capacite + " Go");
	}

	public void eteindre() {
		System.out.println("Exctinction m�moire vive.");
	}
}
