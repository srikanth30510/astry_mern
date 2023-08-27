package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Data;
import Model.Logic;

/**
 * Servlet implementation class Signup
 */
@WebServlet("Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Data md=new Data();
		md.setUsername(request.getParameter("uname"));
	    md.setPassword(request.getParameter("pwd"));
	  Logic ml=new Logic();
	  try {
	     ml.insertData(md);
	      String SendUN;
	      SendUN = "inserted";
	      request.setAttribute("ack", SendUN);
	      RequestDispatcher rd = request.getRequestDispatcher("Login.html");
	      rd.forward(request, response);

	    }
	    catch(Exception e)
	    {
	      
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
