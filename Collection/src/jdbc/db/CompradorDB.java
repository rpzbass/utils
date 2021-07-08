package jdbc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jdbc.classes.Comprador;
import jdbc.conn.ConnectioFactory;

public class CompradorDB {

	public static void save(Comprador comprador) {

		if (comprador.getCpf() != null && comprador.getNome() != null) {
			String sql = "INSERT INTO `agencia`.`tb_comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '"
					+ comprador.getNome() + "');";

			try {

				Connection conn = ConnectioFactory.getConexao();
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				System.out.println("Registro inserto com sucesso!!!");
				/* System.out.println(stmt.executeUpdate(sql)); */
				ConnectioFactory.fecharStatament(conn, stmt);

			} catch (SQLException e) {

				e.printStackTrace();

			}
		} else {

			System.out.println("Preencha os dados corretamente!!!");

		}

	}

	public static void delete(Comprador comprador) {

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
	
	public static void update(Comprador comprador) {

		if (comprador == null || comprador.getId() == null) {
			System.out.println("Não foi possivel atualizar, dados nullos");
			return; /* Volta para o metodo de inicialização e aborta a execução desse metodo */
		}
		
		String sql = "UPDATE `agencia`.`tb_comprador` SET `cpf` = '"+comprador.getCpf()+"', `nome` = '"+comprador.getNome()+"' WHERE (`id` = '"+comprador.getId()+"');";
		
		//String sql = "DELETE FROM `agencia`.`tb_comprador` WHERE id = '" + comprador.getId() + "'";
		try {

			Connection conn = ConnectioFactory.getConexao();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			ConnectioFactory.fecharStatament(conn, stmt);
			System.out.println("Registro atualizado com sucesso!!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	public static void selectAll() {
		

		String sql = "SELECT id,nome,cpf FROM tb_comprador";
		
		//String sql = "DELETE FROM `agencia`.`tb_comprador` WHERE id = '" + comprador.getId() + "'";
		try {

			Connection conn = ConnectioFactory.getConexao();
			Statement stmt = conn.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			List<Comprador> compradorList = new ArrayList<>();
			while(resultSet.next()) {
				
				compradorList.add(new Comprador(resultSet.getInt("id"),resultSet.getString("nome"),resultSet.getString("cpf")));
			}
			System.out.println("filtro : ");
			
			System.out.println(compradorList.stream().filter(x -> x.getId() > 22 ).collect(Collectors.toList()));
			
			ConnectioFactory.fecharResultSet(conn, stmt, resultSet);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
		
		
	}
	
	
	

}
