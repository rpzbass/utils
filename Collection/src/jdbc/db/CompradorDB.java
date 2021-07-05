package jdbc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.classes.Comprador;
import jdbc.conn.ConnectioFactory;

public class CompradorDB {
		
		public void save(Comprador comprador) {
			
			String sql = "INSERT INTO `agencia`.`tb_comprador` (`cpf`, `nome`) VALUES ('"+comprador.getCpf() +"', '"+comprador.getNome()+"');";
			
			Connection conn = ConnectioFactory.getConexao();
		
			try {
			
				Statement stmt = conn.createStatement();
				
				stmt.executeUpdate(sql);
				System.out.println("Comprador cadastrado com sucesso!!!");
				/*System.out.println(stmt.executeUpdate(sql));*/
				ConnectioFactory.fecharStatament(conn,stmt);
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			
			}
			
			
		}
		
		
	

}
