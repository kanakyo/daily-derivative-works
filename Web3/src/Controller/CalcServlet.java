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
		String game = request.getParameter("game");
	
	
		
		//biz logic, run
		
		CalcLogic calc = new CalcLogic();
		int ans = calc.process(num1);
		int moon = calc.moon(num1);
		
	 
		
		
		//reqeust scope
		request.setAttribute("ans",ans);
		request.setAttribute("name",name);
		request.setAttribute("moon",moon);
		request.setAttribute("num1",num1);
			//html出力指示  "calcResult.jsp"  (when 500 error, replace as p60 foward   )
		if(game.equals("stars")) {
			request.getRequestDispatcher("calcResult.jsp").forward(request, response); 
		}else if(game.equals("moon")) {
			request.getRequestDispatcher("moon.jsp").forward(request, response); 
		}
		
		
		
	}

}
