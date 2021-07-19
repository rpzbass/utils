package jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class ConnectioFactory {
	/*
	 * java.sql = Connection, Statament , ResultSet DriverManager
	 */

	public static Connection getConexao() {

		String url = "jdbc:mysql://localhost:3306/agencia";
		String user = "root";
		String password = "";

		try {
			/* Class.forName("com.mysql.jdbc.Driver"); antes do java 4 */
			/* Connection connecting = DriverManager.getConnection(url, user, password); */
			System.out.println("Carrengando...\n");
			return DriverManager.getConnection(url,user,password);

		} catch (SQLException e) {
			
			System.out.println("ERRO DE CONEXÃO");
			e.printStackTrace();
		
		}
		
		return null;
	}

	public static void fecharConexao(Connection connection) {

		try {

			if (connection != null) {
				connection.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void fecharStatament(Connection conn, Statement stst) {

		fecharConexao(conn);
		try {

			if (stst != null)
				stst.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}


	public static void fecharResultSet(Connection conn,Statement stst,ResultSet resultSet) {

		fecharStatament(conn,stst);
		
		try {

			if (resultSet != null)	
				resultSet.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		
		}

	}

	public static JdbcRowSet getRowSetConnection() {

		String url = "jdbc:mysql://localhost:3306/agencia";
		String user = "root";
		String password = "";

		try {
			
			JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
			jdbcRowSet.setUrl(url);
			jdbcRowSet.setUsername(user);
			jdbcRowSet.setPassword(password);
			return jdbcRowSet;
			
		} catch (SQLException e) {
			
			System.out.println("Erro de conexão!!!");
			e.printStackTrace();
		
		}
		
		return null;
	}
	
	public static void fecharConexaoJdbc(JdbcRowSet jdbc_connection) {

		try {

			if (jdbc_connection != null) {
				jdbc_connection.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
}
