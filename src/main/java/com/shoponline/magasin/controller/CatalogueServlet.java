package com.shoponline.magasin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoponline.firstappcore.dto.Catalogue;


/**
 * CatalogueServlet implementation class CatalogueServlet
 */
@WebServlet(name="CatalogueServlet",urlPatterns= {"/catalogue"})
public class CatalogueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CatalogueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Catalogue cat1=new Catalogue("Titre1",1901);
		Catalogue cat2=new Catalogue("Titre2",1902);
		Catalogue cat3=new Catalogue("Titre3",1903);
		Catalogue[] lists= new Catalogue[] {cat1,cat2,cat3};
		
		
		
		out.println("<html><h1>Catalogue</h1>");
		out.println("<ul>");
		for(Catalogue catalogueVal : lists) {
			out.println("<li>"+catalogueVal.getTitle()+"("+catalogueVal.getAnnee()+")</li>");
		}
		out.println("</ul>");
		out.println("</html>");
	}

	

}
