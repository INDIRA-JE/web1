package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");	//조여주는 페이지 타입
		
		//사용자가 작성한 숫자 두개 가져오기
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		
		PrintWriter out = response.getWriter();
		out.print("<h2>num1 : "+num1+"</h2>");
		out.print("<h2>num2 : "+num2+"</h2>");
		
		//덧셈 결과 출력
		int sum = Integer.parseInt(num1)+Integer.parseInt(num2);
		out.print("<h2>sum : "+sum+"</h2>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


