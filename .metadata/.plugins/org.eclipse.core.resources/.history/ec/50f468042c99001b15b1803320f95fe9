package br.com.estacionamento.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Sample {

	public static void main(String[] args) {
		
		
		
		Estacionamento estacionamento = new Estacionamento(1,"EstacioneBem","4199999999","estacionebem@estacionebem.com","001454545/0001-66");
		
		
		EstacionarCarro estacionarCarro = new EstacionarCarro();
		
		estacionarCarro.setId(1);
		estacionarCarro.setEntrada("15:00");
		estacionarCarro.setVagaNumero(30);
		estacionarCarro.estacionarVeiculo();
		estacionarCarro.setCarro(new Carro(1,"Narea","ABC-1234"));
	
		EstacionarCarro estacionarCarro2 = new EstacionarCarro();
		
		estacionarCarro2.setId(2);
		estacionarCarro2.setEntrada("15:00");
		estacionarCarro2.setVagaNumero(15);
		estacionarCarro2.estacionarVeiculo();
		estacionarCarro2.setCarro(new Carro(2,"Gol","XYY-4321"));

		
		
			
	
		estacionamento.getEstacionarCarros().add(estacionarCarro);
		estacionamento.getEstacionarCarros().add(estacionarCarro2);
		
		System.out.print(estacionamento.toString());
		
			
		
	    Date inicio = new Date();
	    
	    Date fim = new Date();
	    
	    
	    System.out.print(inicio.getHours()-15);
	    		
		
		
		
		
		

	}

}
