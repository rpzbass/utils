package jdbc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.classes.Comprador;
import jdbc.conn.ConnectioFactory;

public class CompradorDB {

	public void save(Comprador comprador) {

		if (comprador.getCpf() != null && comprador.getNome() != null) {
			String sql = "INSERT INTO `agencia`.`tb_comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '"
					+ comprador.getNome() + "');";

			try {

				Connection conn = ConnectioFactory.getConexao();
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				System.out.println("Comprador cadastrado com sucesso!!!");
				/* System.out.println(stmt.executeUpdate(sql)); */
				ConnectioFactory.fecharStatament(conn, stmt);

			} catch (SQLException e) {

				e.printStackTrace();

			}
		} else {

			System.out.println("Preencha os dados corretamente!!!");

		}

	}

	public void delete(Comprador comprador) {

		if (comprador == null || comprador.getId() == null) {
			System.out.println("Não foi possivel excluir, dados nullos");
			return; /* Volta para o main e aborta a execução desse metodo */
		}
		String sql = "DELETE FROM `agencia`.`tb_comprador` WHERE id = '" + comprador.getId() + "'";
		try {

			Connection conn = ConnectioFactory.getConexao();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConnectioFactory.fecharStatament(conn, stmt);
			System.out.println("Registro excluido com sucesso!!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
