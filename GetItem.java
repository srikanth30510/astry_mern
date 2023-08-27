package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Data;
import Model.Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/GetItem")
public class GetItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String dburl = "jdbc:mysql://localhost:3306/ep1";
	String dbun = "root";
	String dbpw = "Sri@8919224273";
    public GetItem() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		try {
			response.setContentType("text/html");
			Logic l=new Logic();
			request.setAttribute("res2", l);
			RequestDispatcher rd = request.getRequestDispatcher("itemview.jsp");
			rd.forward(request, response);	
		}
		catch(Exception e)
		{
			pw.print(e.getMessage());
		}	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
