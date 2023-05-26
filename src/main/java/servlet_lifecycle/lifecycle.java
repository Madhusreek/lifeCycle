package servlet_lifecycle;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/demo")
public class lifecycle  implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("it is servlet");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("it is servlet conifg");
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("it is service");
		
	}

	@Override
	public String getServletInfo() {
		System.out.println("it is servlet string");
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("it is servlet one");
	}

}
