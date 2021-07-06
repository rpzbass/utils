package jdbc.test;

import jdbc.classes.Comprador;
import jdbc.db.CompradorDB;

public class TesteConexao {

	
	public static void main(String[] args) {
		
		//Connection conexao = ConnectioFactory.getConexao();
		
		CompradorDB conn = new CompradorDB();
		
		//Comprador comprador = new Comprador("235.456.788-78","Joao das coves");
		Comprador comprador2 = new Comprador();
		
		comprador2.setCpf("000.000.000-00");
		comprador2.setNome("Maia de Morretes");

		conn.save(comprador2);
		
		//Comprador comprador = new Comprador();
		
		
		//comprador.setId(19);
		//conn.delete(comprador);
		
		
		
		
		
		
	}

}
