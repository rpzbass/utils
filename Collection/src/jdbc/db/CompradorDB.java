package jdbc.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

		String sql = "UPDATE `agencia`.`tb_comprador` SET `cpf` = '" + comprador.getCpf() + "', `nome` = '"
				+ comprador.getNome() + "' WHERE (`id` = '" + comprador.getId() + "');";

		// String sql = "DELETE FROM `agencia`.`tb_comprador` WHERE id = '" +
		// comprador.getId() + "'";
		try {
			System.out.println(" nome-> " + comprador.getNome());
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

	public static List<Comprador> selectAll() {

		String sql = "SELECT * FROM tb_comprador";

		// String sql = "DELETE FROM `agencia`.`tb_comprador` WHERE id = '" +
		// comprador.getId() + "'";
		try {

			Connection conn = ConnectioFactory.getConexao();
			Statement stmt = conn.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			List<Comprador> compradorList = new ArrayList<>();

			while (resultSet.next()) {

				compradorList.add(
						new Comprador(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("cpf")));
			}
			System.out.println("filtro : ");

			// System.out.println(compradorList.stream().filter(x -> x.getId() > 22
			// ).collect(Collectors.toList()));
			ConnectioFactory.fecharResultSet(conn, stmt, resultSet);
			return compradorList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return null;

	}

	public static List<Comprador> searchByName(String nome) {

		// String sql = "DELETE FROM `agencia`.`tb_comprador` WHERE id = '" +
		// comprador.getId() + "'";

		try {

			String sql = "SELECT * FROM tb_comprador WHERE nome Like '" + '%' + nome + '%' + "';";
			Connection conn = ConnectioFactory.getConexao();
			Statement stmt = conn.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			List<Comprador> compradorList = new ArrayList<>();

			if (!resultSet.isBeforeFirst()) {
				resultSet = null;
			}

			while (resultSet.next()) {

				compradorList.add(
						new Comprador(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("cpf")));
			}

			// System.out.println(compradorList.stream().filter(x -> x.getId() > 22
			// ).collect(Collectors.toList()));
			ConnectioFactory.fecharResultSet(conn, stmt, resultSet);
			return compradorList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Erro na sintaxe do SQL");

		} catch (NullPointerException e) {

			System.out.println("Registro não encontrado2");
		}

		return null;

	}

	public static void selectMetadata() {

		String sql = "SELECT * FROM tb_comprador";

		Connection conn = ConnectioFactory.getConexao();
		try {
			Statement stat = conn.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			rs.next();
			int qtdColunas = rsmd.getColumnCount();
			System.out.println("Quantidade de colunas " + qtdColunas);

			for (int i = 1; i <= qtdColunas; i++) {

				System.out.println("Tabela: " + rsmd.getTableName(i));
				System.out.println("Nome coluna: " + rsmd.getColumnName(i));
				System.out.println("Tamanho coluna: " + rsmd.getColumnDisplaySize(i));

			}
			ConnectioFactory.fecharResultSet(conn, stat, rs);

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	public static void checkDriverStatus() {
		
		Connection conn = ConnectioFactory.getConexao();
		try {
			Statement stat = conn.createStatement();
			DatabaseMetaData dbmd = conn.getMetaData();
			if(dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				System.out.println("Suporta TYPE_FORWARD_ONLY");
				if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE )) {
					System.out.println("e tambem suporta CONCUR_UPDATABLE");
				}
			}
			if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
				if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println("e tambem suporta CONCUR_UPDATABLE");
				}
			}
			if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
				if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println("e tambem suporta CONCUR_UPDATABLE");
				}
			}
			
			ConnectioFactory.fecharStatament(conn, stat);
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}
		
	}
	
	public static void testTypeScroll() {

		String sql = "SELECT * FROM tb_comprador order by nome";
		try {

			Connection conn = ConnectioFactory.getConexao();
			Statement stmt = conn.createStatement();
			ResultSet resultSet = stmt.executeQuery(sql);
			
			if (resultSet.last()) {
				
				System.out.println("Ultima linha: " + new Comprador(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("cpf")));
				System.out.println("Numero ultima linha: "+ resultSet.getRow());
			
			}
			System.out.println("Retornou para primeira linha: "+ resultSet.first() + " " + resultSet.getInt("id") + resultSet.getString("nome"));
			ConnectioFactory.fecharResultSet(conn,stmt,resultSet);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		
		}
	}
	
	
	
	
	
	
	
	
}