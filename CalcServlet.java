package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CalcLogic;


@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get request parameter
		request.setCharacterEncoding("UTF-8");
		int num1= Integer.parseInt(request.getParameter("num1"));
		//int num2= Integer.parseInt(request.getParameter("name"));
		String name = request.getParameter("name");
	

		
		//biz logic, run
		CalcLogic yrs =new CalcLogic();
		int ans =yrs.process(num1);
		System.out.println(ans);
		
		
		
		request.setAttribute("ans",ans);
		request.setAttribute("name",name);
		
		//output html
		request.getRequestDispatcher("calcResult.jsp").forward(request, response); 
		
		
	}

}
