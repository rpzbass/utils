package jdbc.test;

import jdbc.classes.Comprador;
import jdbc.db.CompradorDB;

public class TesteConexao {

	
	public static void main(String[] args) {
		
		//Connection conexao = ConnectioFactory.getConexao();
		
		CompradorDB conn = new CompradorDB();
		
		//Comprador comprador = new Comprador("235.456.788-78","Joao das coves");
		Comprador comprador2 = new Comprador("000.555.999-00","Steven Seagal");
		
		conn.save(comprador2);
		
				
	}

}
