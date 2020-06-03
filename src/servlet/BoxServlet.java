package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoxServlet
 */
@WebServlet("/box")
public class BoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, 
			HttpServletResponse res) throws ServletException, IOException {
		//보여지는 페이지 설정
		res.setContentType("text/html;charset=UTF-8");
		
		//브라우저에 보여주기 위해 쓸 수 있는 객체 가져오기
		PrintWriter out = res.getWriter();
		
		out.print("<!DOCTYPE html>");
		out.print("<html><head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>서블릿</title>");
		out.print("<style>");
		out.print("div{ width:100px; height:100px; background-color:red;}");
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<div></div>");
		out.print("</body>");
		out.print("</html>");
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
