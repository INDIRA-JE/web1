package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/animal")
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 가져오는 데이터 한글 인코딩 설정
		request.setCharacterEncoding("utf-8");
		
		// 보여주는 페이지 컨텐트타입 설정
		response.setContentType("text/html;charset=UTF-8");
		
		// 데이터 가져오기(request) .getParameter : 많이 쓰인다
//		String animal = request.getParameter("animal");	// 한개만 선택 가능
		String animal[] = request.getParameterValues("animal");	// 여러개 선택 가능
		
				
		// 가져온 데이터 화면에 출력하기
		PrintWriter out = response.getWriter();
		for(String s:animal) {
			out.print("<p>" + s + "</p>");			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
