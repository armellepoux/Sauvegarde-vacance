package bibliotheque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

	private static final String FILE_PATH = "musiques.txt";
	List<Disque> disques = new ArrayList<>();
	String codeBarre;

	void addDisque(Disque disque) throws DisqueExisteDejaException{
		if(getDisque(disque.getCodeBarre())!=null){
			throw new DisqueExisteDejaException(disque);
		}
		disques.add(disque);
	}

	void afficherDisques() {
		System.out.println("Liste des disques de la bibliothèque");
		System.out.println("Il y a " + disques.size() + " disque(s)");

		for (Disque disque : disques)
			disque.afficher();
	}

	public Disque getDisque(String codeBarre) {
		for (Disque disque : disques) {
			String codeBarreDisque = disque.getCodeBarre();
			if (codeBarreDisque.equals(codeBarre)) {
				return disque;
			}
		}
		return null;
	}


	public int getNbDisques(){ 
		int nbDisques=disques.size(); 
		return nbDisques; 
	}

	
	
	public List<Chanson> rechercheChansons(String titreCherche) {
		titreCherche=titreCherche.toLowerCase();
		List<Chanson> resultat = new ArrayList<>();
		
		for (Disque disque : disques) {
			List<Chanson> listOfSongsFromDisque = disque.getChanson();
			
			for(Chanson chanson : listOfSongsFromDisque){

				/*if (chanson.getNom().equalsIgnoreCase(titreCherche)) {
					resultat.add(chanson);
				}*/
				
				if(chanson.getNom().toLowerCase().contains(titreCherche)){
					resultat.add(chanson);
				}
			}
		}
		return resultat;
	}

	
	
	boolean retirerDisque( String codeBarre ){
		for (Disque disque : disques) {
			if (disque.getCodeBarre().equals(codeBarre)) {
				disques.remove(disque);
				System.out.println("Nombres de disques restants : "+getNbDisques());
				return true;
			}
		}
		return false;
	}

	

	public void ecrireFichier(String path) throws IOException 
	{
		boolean utilisePrintWriter = true;
		File file = new File( path );
		file.createNewFile();
		try
		{
			FileOutputStream fos = new FileOutputStream( file );
			if( utilisePrintWriter )
			{
				PrintWriter pw = new PrintWriter( fos );
				pw.println( disques);
				pw.flush();
				pw.close();
			}
			else
			{
				OutputStreamWriter osw = new OutputStreamWriter( fos, "UTF8" );
				Writer out = new BufferedWriter( osw );
				out.append( "Website UTF-8" ).append( "\r\n" );
				out.flush();
				out.close();
				osw.close();
			}

			fos.close();
		}
		// new FileOutputStream( file );
		catch( FileNotFoundException e )
		{
			e.printStackTrace();
		}
		// new OutputStreamWriter( fos, "UTF8" );
		catch( UnsupportedEncodingException e )
		{
			e.printStackTrace();
		}
		// append(), flush() et close()
		catch( IOException e )
		{
			e.printStackTrace();
		}
	}
	
	
	
	static void chargerDonnees(Bibliotheque bibliotheque) {
		File file = new File( FILE_PATH );

		FileInputStream fis;
		try
		{
			fis = new FileInputStream( file );
			InputStreamReader isr = new InputStreamReader( fis, "UTF8" );
			BufferedReader reader = new BufferedReader( isr );
			
			while (true) {
				String nom = reader.readLine();
				if(nom == null)
					break;
				String codeBarre = reader.readLine();
				Disque disque = new Disque(nom, codeBarre);
				
				int nbChanson = Integer.parseInt(reader.readLine());
				for(int i=0;i<nbChanson;i++){
					String nomChanson = reader.readLine();
					int dureeChanson = Integer.parseInt(reader.readLine());
					
					Chanson chanson = new Chanson(nomChanson, dureeChanson);
					disque.addChanson(chanson);
				}
			}
			
			reader.readLine();
			reader.close();
			isr.close();
			fis.close();
		}
		// FileInputStream
		catch( FileNotFoundException e )
		{
			e.printStackTrace();
		}
		// InputStreamReader
		catch( UnsupportedEncodingException e )
		{
			e.printStackTrace();
		}
		// reader.readLine();, reader.close(); isr.close(), fis.close()
		catch( IOException e )
		{
			e.printStackTrace();
		}
	}
	
	static void sauvegarderDonnees( Bibliotheque bibliotheque )
	{
		try
		{
			File file = new File( FILE_PATH );

			PrintWriter writer = new PrintWriter( file, "UTF8" );

			for( Disque disque : bibliotheque.disques )
			{
				writer.println( disque.getNom() );
				writer.println( disque.getCodeBarre() );
				writer.println( disque.getChanson().size() );

				for( Chanson chanson : disque.getChanson() )
				{
					writer.println( chanson.getNom() );
					writer.println( chanson.getDuree() );
				}
			}

			writer.close();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
	
}
	 

