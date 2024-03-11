package com.techpalle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.model.DataAccess;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/login")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		PrintWriter out = response.getWriter();
//		out.println("email : "+email);
//		out.println("pw : "+pw);
		boolean result = DataAccess.checkAdminLogin(email,pw);
		
		if(result == true) {
//			out.println("LOGIN SUCCESS");
			response.sendRedirect("welcome.jsp");
		}else {
			response.sendRedirect("index.html");
//			out.println("LOGIN FAIL");
		}
		
	}

}
