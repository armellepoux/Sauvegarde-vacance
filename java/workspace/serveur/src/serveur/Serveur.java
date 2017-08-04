package serveur;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	System.out.println("Ouverture du port :");
	// ici on demande l'ouverture du port 9090 mais on peut choisir n'importe lequel

	ServerSocket socketserver = new ServerSocket(9090);
	
	System.out.println("canal ouvert "+socketserver);
	
	//attente qu'un client se connecte au port
	Socket communicationAvecClient = socketserver.accept();
	System.out.println("attente de la connexion d'un client "+communicationAvecClient);
	
	InputStream is = communicationAvecClient.getInputStream();
	
	while(true){
		int data = is.read();
		if(data == -1)
			break;
		System.out.print((char)(data & 0xff));
	}
	
	/*ObjectInputStream ois = new ObjectInputStream( is );

	// envoi de l'entier 34 dans le flux de sortie de la socket
	int recu = ois.readInt( );
	int recu2 = ois.readInt();
	int somme = recu+recu2;
	System.out.println(somme);
	
	OutputStream os = communicationAvecClient.getOutputStream();
	
	ObjectOutputStream oos = new ObjectOutputStream( os );

	// envoi de l'entier 34 dans le flux de sortie de la socket
	oos.writeInt(somme);
	
	Object s = ois.readObject();
	System.out.println(s);
	
	oos.writeObject("De rien Hugues !!!! ;) ");
	oos.flush();
	
	communicationAvecClient.close();
	System.out.println("Fermeture du port");*/
	
	}
}
