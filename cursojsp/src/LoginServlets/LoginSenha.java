package LoginServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.beans.BeansCursoJsp;
import sun.rmi.server.Dispatcher;


@WebServlet("/LoginSenha")
public class LoginSenha extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginSenha() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BeansCursoJsp beancurso = new BeansCursoJsp();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		if(beancurso.ValidadarSenha(login, senha)) {
			RequestDispatcher despacher =  request.getRequestDispatcher("acessoliberado.jsp");
			despacher.forward(request, response);
		} else {
			RequestDispatcher despacher =  request.getRequestDispatcher("acessonegado.jsp");
			despacher.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
