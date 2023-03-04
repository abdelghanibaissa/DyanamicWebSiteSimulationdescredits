package metier;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ressource.credit;

import java.io.IOException;

/**
 * Servlet implementation class calculonsmensualités
 */
public class calculonsmensualités extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private calculationcredit metier;
	 @Override
		public void init() throws ServletException {
		metier=new calculationcreditimpl();
		}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculonsmensualités() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String montant =request.getParameter("montant").toString();
		String duree =request.getParameter("duree").toString();
		String taux =request.getParameter("taux").toString();
		if(montant.equals("") || duree.equals("")|| taux.equals("")) {
			request.setAttribute("res", "resultat = 0.0");
		}
		else {
			calculationcreditimpl calcule= new calculationcreditimpl();
			double res = 
					calcule.calculonscreditconsommation
					(Double.parseDouble(montant),
							Double.parseDouble(taux),
							Double.parseDouble(duree));
			request.setAttribute("res", "resultat = " +res);
		}

		//request.setAttribute("credit");
		request.getRequestDispatcher("calculonsmensualités.jsp").forward(request, response);
		
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

}
