package bibliotheque;

import java.io.IOException;
import java.util.List;

public class BibliothequeApplication {
	public static void main(String[] args) throws DisqueExisteDejaException, IOException {

		Bibliotheque bibliotheque= new Bibliotheque();
		Disque disque = (new Disque("Ah le java !", "JAV32"));
		
		disque.addChanson(new Chanson("Intro", 30));
		disque.addChanson(new Chanson("Début", 2));
		disque.addChanson(new Chanson("Milieu", 8));
		disque.addChanson(new Chanson("Fin", 16));
		bibliotheque.addDisque(disque);


		disque = new Disque("Viva la vida !", "strh54");
		
		disque.addChanson(new Chanson("Blablabla", 6));
		disque.addChanson(new Chanson("Alt", 45));
		disque.addChanson(new Chanson("Shift", 5));
		disque.addChanson(new Chanson("Espace", 2));
		bibliotheque.addDisque(disque);
		
		disque = new Disque("Vive la programmation !", "retr54");

		disque.addChanson(new Chanson("Cool", 6));
		disque.addChanson(new Chanson("Fun", 45));
		disque.addChanson(new Chanson("Détente", 5));
		disque.addChanson(new Chanson("Yep", 2));
		bibliotheque.addDisque(disque);
		
		bibliotheque.afficherDisques();
		
		while (true) {
			// Presenter le menu
			System.out.println("1. Liste des disques");
			System.out.println("2. Détail d'un disque");
			System.out.println("3. Recherche chanson");
			System.out.println("4. Retirer un disque");
			System.out.println("5. Ajouter un disque");
			System.out.println("6. Sauvegarder dans un fichier");
			System.out.println("7. Chargement du fichier");
			System.out.println("Q. Quitter");
			
			//demander la saisie
			String saisie=Saisie.saisie("Quel est ton choix ?");
			
			//entreprendre l'action adequat
			switch (saisie) {
			case "1":
				bibliotheque.afficherDisques();
				break;
				
			case "2":
				String codeBarre=Saisie.saisie("code barre stp");
				Disque disqueTrouve = bibliotheque.getDisque(codeBarre);
				if(disqueTrouve==null){
					System.out.println("Pas de disque existant avec ce CB");
				}else{
					disqueTrouve.afficherDetails();	
				}
				break;
				
			case "3":
				String titreCherche=Saisie.saisie("Nom de la chanson à chercher");
				List<Chanson> chansons=bibliotheque.rechercheChansons(titreCherche);
				
				if(chansons==null || chansons.isEmpty()){
					System.out.println("Cette chanson n'existe pas.");
				}else{
					for(Chanson chanson : chansons){
						chanson.afficher();
					}
				}

				break;
				
			case "4":
				String codeBarreDisqueRecherche=Saisie.saisie("CB du disque à retirer STP");
				boolean disqueEfface=bibliotheque.retirerDisque(codeBarreDisqueRecherche);
				if(disqueEfface){
					System.out.println("Le disque a bien été effacé");					
				}else{
					System.out.println("Ce disque n'existe pas");
				}
				break;
				
				
			case "5":
				String nomNouveauDisque=Saisie.saisie("Veuillez taper le nom du disque à ajouter");
				String codeBarreNouveauDisque=Saisie.saisie("Veuillez taper le code barre du disque à ajouter");
				//int nombreNouvellesChansons=Saisie.saisieInt("Combien de chansons voulez-vous ajouter ?");
				Disque listDisques = new Disque(nomNouveauDisque, codeBarreNouveauDisque);
				
				/*try{bibliotheque.addDisque(listDisques);
				System.out.println("Le disque a bien été ajouté");
				}catch (DisqueExisteDejaException e){
					System.out.println("Impossible, le disque existe déjà");
				break;}*/
				
				while (true) {
					Chanson chanson=saisirChanson();
					if(chanson!=null){
						listDisques.addChanson(chanson);
					}else{
						break;
					}
				}
				
				/*for(int i=1;i<=nombreNouvellesChansons;i++){
					String titreNouvelleChansons=Saisie.saisie("Veuillez le titre de la chanson "+i);
					int dureeNouvelleChanson=Saisie.saisieInt("Veuillez la durée de la chanson "+i);
					disque.addChanson(new Chanson(titreNouvelleChansons,dureeNouvelleChanson));
					i++;
				}
				System.out.println("Le nouveau disque "+nomNouveauDisque+" avec le code barre "+codeBarreNouveauDisque+" a été ajouté.");*/
				
				bibliotheque.addDisque(listDisques);
				break;
				
			case "6":
				//String nomPath = Saisie.saisie("Rentrez le chemin plus le nom du fichier à créer");
				Bibliotheque.sauvegarderDonnees(bibliotheque);
				System.out.println("Les données ont été sauvegardées dans le un fichier");
				/*sauvegarderDonnees(bibliotheque);
				System.out.println("Données sauvegardées.");*/
				break;
				
			case "7":
				//String nomPath1 = Saisie.saisie("Rentrez le nom du fichier à charger");
				//Bibliotheque.chargerDonnees(nomPath1);
				//System.out.println("Le fichier a été chargé");
				Bibliotheque.chargerDonnees( bibliotheque );
				System.out.println( "Données chargées" );
				break;
				
			case "Q":
			case "q":
				System.exit(0);
				break;
				
			default:
				System.out.println("Ce choix n'existe pas !");

			}
			
		}

	}
	
	
	
		


	/*private static void sauvegarderDonnees(Bibliotheque bibliotheque) throws FileNotFoundException {
		File file = new File("bibliotheque.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		PrintWriter writer = new PrintWriter(fos);
		
		for(Disque disque : bibliotheque.getDisque()){
			writer.println(disque.getNom());
			writer.println(disque.getCodeBarre());
			writer.println(disque.getChanson().size());
			for (Chanson chanson : disque.getChanson()){
				
			}
		}
		
	}*/

	private static Chanson saisirChanson(){
		String nom = Saisie.saisie("Nom de la chanson ?");
		
		if(nom == null || nom.isEmpty()){
			return null;
		}
		
		int duree = Saisie.saisieInt("Durée de la chanson ?");
		return new Chanson(nom,duree);
	}


}
