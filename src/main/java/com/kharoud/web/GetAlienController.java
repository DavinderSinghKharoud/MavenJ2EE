package com.kharoud.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kharoud.web.dao.AlienDao;
import com.kharoud.web.model.Alien;

/**
 * Servlet implementation class GetAlienController
 */
public class GetAlienController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		AlienDao dao = new AlienDao();
		Alien a1 = dao.getAlien(aid);
			
		
//		request.setAttribute("a", a1);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
//		rd.forward(request, response);
		
		HttpSession session = request.getSession();
		session.setAttribute("a", a1);
		
		response.sendRedirect("showAlien.jsp");
	}

	
	

}
