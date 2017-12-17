package com.webapps.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapps.training.beans.DataUser;

/**
 * Servlet implementation class IndexServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/*PrintWriter out = response.getWriter();
		out.print("<html><h3>Home</h3></html>");*/
		String login = request.getParameter("login");
		String password = request.getParameter("mdp");
		DataUser dataUser = new DataUser();
		dataUser.setLogin(request.getParameter("target")+"_"+UUID.randomUUID().toString().substring(0,8));
		dataUser.setPassword(password);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
