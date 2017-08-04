package com.sopra.pox3.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HorlogeServlet extends HttpServlet{
	
	/*@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Date d = new Date();
		resp.setContentType("text/html");
		String p1=req.getParameter("param1");
		String p2=req.getParameter("param2");
		resp.getWriter().print("<html><head><style>body{font-size:35;color:purple;background-color:grey;display: flex; flex-flow:center;align-items: center;align-content:center;}</style></head><body>Coucou nous sommes "+d+", valeur du paramètre p1 "+p1+" et du paramètre p2 "+p2+"</body></html>");
		
	}*/

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		Date d = new Date();
		resp.setContentType("text/html");
		String p1=req.getParameter("param1");
		String p2=req.getParameter("param2");
		resp.getWriter().print("<html><head><style>body{font-size:35;color:purple;background-color:grey;display: flex; flex-flow:center;align-items: center;align-content:center;}</style></head><body>Coucou nous sommes "+d+", valeur du paramètre p1 "+p1+" et du paramètre p2 "+p2+"</body></html>");
		
	}
}
