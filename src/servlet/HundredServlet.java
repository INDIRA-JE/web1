package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hundred")
public class HundredServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		int total = 0;
		for(int i=1;i<=100;i++){
			total+=i;
		}
		
		PrintWriter out = response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html><head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("<title>1~100까지의 합</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("1 ~ 100 까지 합 : "+total);
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
