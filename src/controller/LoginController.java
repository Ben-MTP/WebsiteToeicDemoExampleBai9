package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Users;
import dao.LoginDAO;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("user_name");
		String pass = request.getParameter("pass_word");
		
		Users users = new Users();
		users.setName(name);
		users.setPass(pass);
		
		boolean kt = LoginDAO.Validate(name, pass);
		if(kt) {
			String msg1 = "Login Success";
			request.setAttribute("message", msg1);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/LoginSuccess.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("Login False!");
		}
	}
}
