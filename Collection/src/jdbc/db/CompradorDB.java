package jdbc.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;

import jdbc.classes.Comprador;
import jdbc.classes.MyRowSetListener;
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

	public static void updatePreparedStatement(Comprador comprador) {

		if (comprador == null || comprador.getId() == null) {
			System.out.println("Não foi possivel atualizar, dados nullos");
			return; /* Volta para o metodo de inicialização e aborta a execução desse metodo */
		}
		String sql = "UPDATE `agencia`.`tb_comprador` SET `cpf` = ? , `nome` = ?  WHERE (`id` = ?);";

		// String sql2 = "UPDATE `agencia`.`tb_comprador` SET `cpf` = '999.999.999-65',
		// `nome` = 'luiz xavierr' WHERE (`id` = '26');";

		try {

			System.out.println(" nome-> " + comprador.getNome());
			Connection conn = ConnectioFactory.getConexao();

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, comprador.getCpf());
			ps.setString(2, comprador.getNome());
			ps.setInt(3, comprador.getId());
			ps.executeUpdate();

			ConnectioFactory.fecharStatament(conn, ps);
			System.out.println("Registro atualizado com sucesso!!!");

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}

	public static void updateRowSet(Comprador comprador) {

		if (comprador == null || comprador.getId() == null) {
			System.out.println("Não foi possivel atualizar, dados nullos");
			return; /* Volta para o metodo de inicialização e aborta a execução desse metodo */
		}
		 String sql = "SELECT * FROM `agencia`.`tb_comprador` WHERE  `id` = ?";

		//String sql = "UPDATE `agencia`.`tb_comprador` SET `cpf` = ? , `nome` = ?  WHERE `id` = ?";
		JdbcRowSet jdbc_conn = ConnectioFactory.getRowSetConnection();

		try {

			jdbc_conn.setCommand(sql); /* com jdbcRowSet é necessario efetuar uma consulta primeiro */
			jdbc_conn.setInt(1, comprador.getId());
			jdbc_conn.execute();
			jdbc_conn.next();
			jdbc_conn.updateString(3, comprador.getNome()); /* Segue a ordem dos campos das tabelas */
			jdbc_conn.updateString(2, comprador.getCpf());
			jdbc_conn.updateRow();
			
			ConnectioFactory.fecharConexaoJdbc(jdbc_conn);

			System.out.println("Registro atualizado com sucesso!!!");

		} catch (SQLException e) {

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
			if (dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				System.out.println("Suporta TYPE_FORWARD_ONLY");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println("e tambem suporta CONCUR_UPDATABLE");
				}
			}
			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println("e tambem suporta CONCUR_UPDATABLE");
				}
			}
			if (dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
				if (dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
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
				System.out.println("Ultima linha: " + new Comprador(resultSet.getInt("id"), resultSet.getString("nome"),
						resultSet.getString("cpf")));
				System.out.println("Numero ultima linha: " + resultSet.getRow());
			}

			System.out.println("Retornou para primeira linha: " + resultSet.first() + " " + resultSet.getRow());
			resultSet.absolute(2);
			System.out.println("Linha 2 " + resultSet.getString("nome") + resultSet.getRow());
			resultSet.relative(1);
			System.out.println("Linha 3 " + resultSet.getInt("id"));
			resultSet.relative(-1);
			System.out.println("3-1= retorna pra linha 2 " + resultSet.getString("nome"));
			ConnectioFactory.fecharResultSet(conn, stmt, resultSet);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateNomeToLowerCase() {

		String sql = "SELECT * FROM tb_comprador";
		try {

			Connection conn = ConnectioFactory.getConexao();
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet = stmt.executeQuery(sql);

			if (resultSet.next()) {
				resultSet.updateString("nome", resultSet.getString("nome").toUpperCase());
				resultSet.updateRow();
			}

			resultSet.last();
			System.out.println(resultSet.getString("nome"));

			/*
			 * while (resultSet.next()) { resultSet.updateString("nome",
			 * resultSet.getString("nome").toLowerCase()); resultSet.updateRow(); }
			 */
			ConnectioFactory.fecharResultSet(conn, stmt, resultSet);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Comprador> searchByNamePreparementStatement(String nome) {
		String sql = "SELECT * FROM tb_comprador WHERE nome Like ?";
		Connection conn = ConnectioFactory.getConexao();
		try {

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + nome + "%");
			ResultSet resultSet = ps.executeQuery();
			List<Comprador> compradorList = new ArrayList<>();
			while (resultSet.next()) {
				compradorList.add(
						new Comprador(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("cpf")));
			}
			ConnectioFactory.fecharResultSet(conn, ps, resultSet);
			return compradorList;

		} catch (SQLException e) {
			System.out.println("Erro na sintaxe do SQL");
		} catch (NullPointerException e) {
			System.out.println("Registro não encontrado");
		}

		return null;
	}

	public static List<Comprador> searchByNameCallableStatement(String nome) {
		String sql = "CALL `agencia`.`SP_GetCompradoresPorNome`(?);";
		Connection conn = ConnectioFactory.getConexao();
		try {

			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, "%" + nome + "%");
			ResultSet resultSet = cs.executeQuery();
			List<Comprador> compradorList = new ArrayList<>();
			while (resultSet.next()) {
				compradorList.add(
						new Comprador(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getString("cpf")));
			}
			ConnectioFactory.fecharResultSet(conn, cs, resultSet);
			return compradorList;

		} catch (SQLException e) {
			System.out.println("Erro na sintaxe do SQL");
		} catch (NullPointerException e) {
			System.out.println("Registro não encontrado");
		}

		return null;
	}

	public static List<Comprador> searchByNameRowSet(String nome) {

		// String sql = "DELETE FROM `agencia`.`tb_comprador` WHERE id = '" +
		// comprador.getId() + "'";
		String sql = "SELECT * FROM tb_comprador WHERE nome like  ? ";
		
		JdbcRowSet jdbc_conn = ConnectioFactory.getRowSetConnection();
		jdbc_conn.addRowSetListener(new MyRowSetListener());
		
		List<Comprador> compradorList = new ArrayList<>();

		try {

			jdbc_conn.setCommand(sql);
			jdbc_conn.setString(1, nome);
			jdbc_conn.execute();

			while (jdbc_conn.next()) {

				compradorList.add(
						new Comprador(jdbc_conn.getInt("id"), jdbc_conn.getString("nome"), jdbc_conn.getString("cpf")));

			}
			ConnectioFactory.fecharConexaoJdbc(jdbc_conn);
			return compradorList;

		} catch (SQLException e) {

			System.out.println("Erro na sintaxe do SQL");

		} catch (NullPointerException e) {

			System.out.println("Registro não encontrado2");

		}

		return null;

	}

}