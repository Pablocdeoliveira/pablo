package br.edu.senaisp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.senaisp.model.Sabor;

public class SaborDAO {
	public final String SQLINSERT = "INSERT INTO sabores (descricao, preco, nome) VALUES ( ?, ?, ? )";
	private final String SQLSELECT = "SELECT id, nome, descricao, preco FROM sabor";
	
	
	public void novo(Sabor sabor) {

		try {
			Connection con = dao.conexao();
 
			if (!con.isClosed()) {
				PreparedStatement ps = con.prepareStatement(SQLINSERT);
				ps.setString(3, sabor.getNome());
				ps.setFloat(2, sabor.getPreco());
				ps.setString(1, sabor.getDescricao());
				ps.execute();
			}
 
			System.out.println(con.isClosed());
		} catch (Exception e) {
 
			System.out.println(e.getMessage());
		}


	}

public List<Sabor> lista() {
	System.out.println("Seleção");

	List<Sabor> sabores = new ArrayList<Sabor>();

	try {
		Connection con = dao.conexao();

		if (!con.isClosed()) {
			PreparedStatement ps = con.prepareStatement(SQLSELECT);
			ResultSet rs = ps.executeQuery();

			Sabor tmp = null;
			while (rs.next()) {
				tmp = new Sabor();
				tmp.setId(rs.getInt("id"));
				tmp.setNome(rs.getString("nome"));
				tmp.setDescricao(rs.getString("descricao"));
				tmp.setPreco(rs.getFloat("preco"));
				sabores.add(tmp);
			}

			con.close();
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return sabores;
}

}

