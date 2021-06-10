package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Confirm;
import model.User;

@WebServlet("/Session3")
public class Session3 extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		
		// check if there's illegal argument
		Confirm regLogic = new Confirm();
		boolean result = regLogic.process(user);
		
		
	
			//Forward
			request.getRequestDispatcher("WEB-INF/Session4.jsp").forward(request, response); 
			
		
	}

}
