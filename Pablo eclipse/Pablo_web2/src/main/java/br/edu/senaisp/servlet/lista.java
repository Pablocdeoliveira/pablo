package br.edu.senaisp.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import br.edu.senaisp.dao.SaborDAO;
import br.edu.senaisp.model.Sabor;

@WebServlet(urlPatterns = "/lista")
public class lista extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("");
		
		StringBuilder html = new StringBuilder();
		html.append("");
		html.append("<!DOCTYPE html>");
		html.append("<html>");
		html.append("<head>");
		html.append("<meta charset='ISO-8859-1'>");
		html.append("<title>Pagina Principal</title>");
		html.append("</head>");
		html.append("<body>");
		
		SaborDAO dao = new SaborDAO();
		for (Sabor sabor : dao.lista()) {
			html.append("<h2>").append(sabor.getNome()).append("</h2>");
		}
			
		html.append("</body>");
		html.append("</html>");
		
		PrintWriter pw = response.getWriter();
		pw.print(html.toString());

	}
}
