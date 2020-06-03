package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/request")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		// httpServletRequest로 가져올 수 있는 정보들
		PrintWriter out = response.getWriter();
		out.printf("Request URI : %s<br>",  request.getRequestURI());
		out.printf("Request URI : %s<br>",  request.getRequestURI());
		out.printf("Context Path : %s<br>",  request.getContextPath());
		out.printf("Request Protocol : %s<br>",  request.getProtocol());
		out.printf("Client Address : %s<br>",  request.getRemoteAddr());
		out.printf("Client Port : %s<br>",  request.getRemotePort());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
