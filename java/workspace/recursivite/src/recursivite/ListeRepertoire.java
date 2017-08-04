package recursivite;

import java.io.File;

public class ListeRepertoire {
	
public static void main(String[] args) {
		
		new ListeRepertoire().parcoursRep("C:\\Users\\AELION\\Desktop\\POX3\\code");

	}
	
	void parcoursRep(String path){
		
		//Afficher un chemin absolu
		System.out.println(path);
		
		//Ouvrir un File sur le chemin
		File file = new File(path);
		
		//si File est un fichier = stop, si file est un repertoir : lister les sous-fichiers et les parcourir 
		if(file.isDirectory()){
			File[] files = file.listFiles();
			
			for(File file1 : files){
				System.out.println(file1);
				
				//Recursivite
				parcoursRep(file1.getAbsolutePath());
			}
			
		}else{
		System.out.println("Ce chemin est le chemin d'un fichier");
		}
	

	
		
	}

}
