package br.com.mercadoria.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.mercadoria.modelo.Mercadoria;
import br.com.mercadoria.sql.Conexao;
import br.com.mercadoria.validacao.MercadoriaValidacao;

public class MercadoriaDAO {
	Conexao conexao = new Conexao();
	MercadoriaValidacao mercadoriaValidar = new MercadoriaValidacao();

	public void inserir(Mercadoria mercadoria) {

		if (mercadoriaValidar.validar(mercadoria) == true) {
			String sqlInsert = "insert into Mercadoria(codigo, tipo, nome, qtde, preco, tipo_negocio) values(?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement stmt = conexao.conecta().prepareStatement(
						sqlInsert);
				stmt.setInt(1, mercadoria.getCodigo());
				stmt.setString(2, mercadoria.getTipo_mercadoria());
				stmt.setString(3, mercadoria.getNome());
				stmt.setInt(4, mercadoria.getQtde());
				stmt.setFloat(5, mercadoria.getPreco());
				stmt.setString(6, mercadoria.getTipo_negocio());
				stmt.execute();
				stmt.close();

			} catch (SQLException ex) {
				Logger.getLogger(MercadoriaDAO.class.getName()).log(
						Level.SEVERE, null, ex);
			}

		}
	}

	public List<Mercadoria> listar() {
		PreparedStatement ps = null;
		ResultSet resultset = null;
		String sql = "select codigo, tipo, nome, qtde, preco, tipo_negocio from Mercadoria";

		List<Mercadoria> listaRetorno = new ArrayList<Mercadoria>();

		try {
			ps = conexao.conecta().prepareStatement(sql);
			resultset = ps.executeQuery();

			while (resultset.next()) {
				Mercadoria mercadoria = new Mercadoria();
				mercadoria.setCodigo(resultset.getInt("codigo"));
				mercadoria.setTipo_mercadoria(resultset.getString("tipo"));
				mercadoria.setNome(resultset.getString("nome"));
				mercadoria.setQtde(resultset.getInt("qtde"));
				mercadoria.setPreco(resultset.getFloat("preco"));
				mercadoria.setTipo_negocio(resultset.getString("tipo_negocio"));
				listaRetorno.add(mercadoria);
			}
			resultset.close();

		} catch (SQLException ex) {
			System.out.println("Error select *from Mercadoria");
		}

		return listaRetorno;
	}

}
