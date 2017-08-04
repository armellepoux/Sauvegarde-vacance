package ordinateur;

public class Ordinateur {

	private String modele;
	private Ram memoireVive;
	private DisqueDur[] disquesDurs;

	public Ordinateur(String modele, int capaciteMemoire, int[] capacitesDisquesDurs) {
		this.modele = modele;
		this.memoireVive = new Ram(capaciteMemoire);
		this.disquesDurs = new DisqueDur[capacitesDisquesDurs.length];

		for (int i = 0; i < disquesDurs.length; i++) {
			disquesDurs[i] = new DisqueDur(capacitesDisquesDurs[i]);
		}
	}

	public void allumer() {
		System.out.println("Ordinateur allumé !");
		
		if(memoireVive==null){
			System.out.println("Argh no memory");
			return;
		}
		
		memoireVive.initialiser();
		System.out.println("Démarrage des disques durs.");

		for (DisqueDur disqueDur : disquesDurs) {
			disqueDur.demarrer();
		}
		for (int i = 0; i < disquesDurs.length; i++) {
			disquesDurs[i].lire();
		}

		if (disquesDurs.length>0){
			disquesDurs[0].lire();
			System.out.println("Ordinateur en service");
		}
		else{
			System.out.println("Please insert a boot disk and press any button to continue.");
		}
	}

	public void eteindre() {
		
		for (int i=disquesDurs.length-1;i>=0;i--) {
			disquesDurs[i].eteindre();
		}
		System.out.println("Extinction des disques durs.");
		System.out.println("Extinction des disques.");


		memoireVive.eteindre();
		System.out.println("Ordinateur éteint !");
	}

}
