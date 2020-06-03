package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForRules
 */
@WebServlet("/rules")
public class ForRules extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		//사용자가 작성한 숫자 두개 가져오기
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		String operator=request.getParameter("operator");
		
		PrintWriter out = response.getWriter();
		int result=0;
		switch(operator) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		}		
		//결과 출력		
		out.print("<h2>"+num1+operator+num2+"="+result+"</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
