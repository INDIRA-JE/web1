package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeServlet
 */
@WebServlet("/life")
public class LifeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LifeServlet() {
		System.out.println("Life Cycle Servlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
	}
	@Override
	public void destroy() {
		System.out.println("destroy()");
		super.destroy();
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service()");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
	}

}
