package br.edu.senaisp.servlet;



import java.io.IOException;

import br.edu.senaisp.dao.SaborDAO;
import br.edu.senaisp.model.Sabor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/noJava")
public class Cadastro extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String desc = req.getParameter("descricao");
		float preco = Float.parseFloat(req.getParameter("preco"));

		Sabor s = new Sabor();
	    s.setNome(nome);
		s.setDescricao(desc);
		s.setPreco(preco);

		SaborDAO dao = new SaborDAO();
		dao.novo(s);

	}

}