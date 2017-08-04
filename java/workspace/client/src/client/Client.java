package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		
		System.out.println("Tentative de connexion :");
		Socket socket = new Socket( "10.31.0.20", 9090 );
		System.out.println("communication établie avec le serveur "+socket);
		
		OutputStream os = socket.getOutputStream();
		
		ObjectOutputStream oos = new ObjectOutputStream( os );

		// envoi de l'entier 34 dans le flux de sortie de la socket
		oos.writeInt(10);
		oos.writeInt(20);
	
		InputStream is = socket.getInputStream();
		
		ObjectInputStream ois = new ObjectInputStream( is );

		// envoi de l'entier 34 dans le flux de sortie de la socket
		int somme = ois.readInt( );
		System.out.println(somme);
		
		Object s = ois.readObject();
		System.out.println(s);
		
		oos.writeObject("Donne moi un oeuf stp ! :p ");
		oos.flush();
		
		socket.close();
		System.out.println("Fin connexion client");
	}
}
