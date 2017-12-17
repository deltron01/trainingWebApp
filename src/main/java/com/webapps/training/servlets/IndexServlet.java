package com.webapps.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.webapps.training.beans.DataUser;
import com.webapps.training.business.DataUserInterface;

/**
 * Servlet implementation class IndexServlet
 */
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexServlet() {
		super();
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		super.service(arg0, arg1);
	}
	
	
	@Override
	public void init() throws ServletException {
		super.init();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		DataUser dataUser = new DataUser();
		dataUser.setLogin(request.getParameter("target")+"_"+UUID.randomUUID().toString().substring(0,8));
		dataUser.setPassword("totototo");
		WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		if( applicationContext != null) {
			DataUserInterface userServices = (DataUserInterface) applicationContext.getBean("userServices");
			userServices.save(dataUser);
			
			response.sendRedirect("/trainingWebApp/jsp/login.jsp?target="+request.getParameter("target"));
			//userServices.find("amineeee_454a103a").getPassword();
		} else {
			System.out.println("No userServices instance");
		}
		

		//out.print("<h3>Index</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
