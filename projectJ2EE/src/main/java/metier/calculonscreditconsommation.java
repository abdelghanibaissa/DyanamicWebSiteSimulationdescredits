package metier;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ressource.credit;

import java.io.IOException;


public class calculonscreditconsommation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private calculationcredit metier;
	@Override
	public void init() throws ServletException {
	metier=new calculationcreditimpl();
	}

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
	request.getRequestDispatcher("calculonscreditconsommation.jsp").forward(request, response);
	
	// TODO Auto-generated method stub
	/*
	 * credit crd= new credit(); crd.setMontant(montant); crd.setDuree(duree);
	 * crd.setTaux(taux);
	 * 
	 * crd.setTotale(res); request.setAttribute("credit",crd);
	 * request.getRequestDispatcher("calculonscreditconsommation.jsp").forward(
	 * request, response);
	 */
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
