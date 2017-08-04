package connexion;

import javax.servlet.http.HttpServlet;

public class ChatRoom {

	String nom;
	User createur;
	
	public ChatRoom(String nom, User createur) {
		this.nom = nom;
		this.createur = createur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public User getCreateur() {
		return createur;
	}

	public void setCreateur(User createur) {
		this.createur = createur;
	}
	
	
}
