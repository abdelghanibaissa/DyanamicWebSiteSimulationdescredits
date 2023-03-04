package compte;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import metier.connectiondatabse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(name="RegisterServlet" ,value="/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//PrintWriter out = response.getWriter();
		try {
			String username= request.getParameter("username");
			String nom= request.getParameter("nom");
			String prenom= request.getParameter("prenom");
			String email= request.getParameter("email");
			String password= request.getParameter("password");
			Connection cn=connectiondatabse.getConnection();
			PreparedStatement ps= cn.prepareStatement("insert into compte(username,nom,prenom,email,password)values(?,?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, nom);
			ps.setString(3, prenom);
			ps.setString(4, email);
			ps.setString(5, password);
			ps.executeUpdate();
			
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
				
			
			
			}catch(SQLException e){
			e.printStackTrace();

		}
		
	}

}
