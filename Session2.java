package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

@WebServlet("/Session2")
public class Session2 extends HttpServlet {
	   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
	
		// store value in User Object
		User user = new User(id, name, pw);
		
		// session scopeに格納
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		request.getRequestDispatcher("WEB-INF/Session3.jsp").forward(request, response);
		
		
	}

}
