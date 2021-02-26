

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/loginServlet", "/login" })
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public loginServlet() {

    }
    protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			if(username!=null && password!=null) {
				if(username=admin && password=admin) {
				out.println("login successfull");
			}
	}

}
