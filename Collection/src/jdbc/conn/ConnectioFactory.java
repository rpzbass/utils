package jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.classes.Comprador;

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
			System.out.println("CONECTADO!!!");
			return DriverManager.getConnection(url, user, password);

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

	
	
	
	
	
}
