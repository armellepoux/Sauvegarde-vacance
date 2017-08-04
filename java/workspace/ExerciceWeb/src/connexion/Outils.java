package connexion;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Outils {

	public static User getConnectedUser(HttpServletRequest req) {
		User user = (User) req.getSession().getAttribute(Constante.CLE_SESSION_USER);
		return user;
	}

	public static void setConnectedUser(User user, HttpServletRequest req) {
		req.getSession().setAttribute(Constante.CLE_SESSION_USER, user);
	}

	public static void vueWelcomeConnected(User user, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("user", user);
		vue("WelcomeConnected", req, resp);
	}

	public static void vueWelcomeNotConnected(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		vue("WelcomeNotConnected", req, resp);
	}

	public static void vue(String jspName, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/" + jspName + ".jsp").forward(req, resp);
	}

	public static void vueProduireFormulaire(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		vue("ProduireFormulaire", req, resp);
	}

	public static void vueProduireFormulaireErreur(String message, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("message", message);
		vueProduireFormulaire(req, resp);
	}

	public static void vueConnected(User user, HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("user", user);
		vue("Connected", req, resp);
	}
	
	public static void vueChatRoomMessage(List<Message> messages,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.setAttribute("messages", messages);
		vue("ChatRoomMessage",req,resp);
	}
	
	public static void vueChatRoom(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		vue("ChatRoom",req,resp);
	}

	
	public static void vueChatRoomListe(List<ChatRoom> chatRooms, HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("chatRooms", chatRooms);
		vue("ChatRoomListe",req,resp);
	}
}
