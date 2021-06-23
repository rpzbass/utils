package br.com.estacionamento.model;

import java.util.Date;

public class EstacionarCarro {
	
	
	private Integer id;
	private Date entrada;
	private Date saida;
	private Integer vagaNumero;
	private StatusVaga statusVaga ;
	private Double valorPagar;
	private static int ncarrosEstacionados;

	public EstacionarCarro() {
		EstacionarCarro.ncarrosEstacionados = EstacionarCarro.ncarrosEstacionados + 1;
		this.statusVaga = StatusVaga.DISPONIVEL;
		this.valorPagar = 0.0;
	
		
	}

	public EstacionarCarro(Integer id, Date entrada, Date saida, Integer numero) {

		this.id = id;
		this.entrada = entrada;
		this.saida = saida;
		this.vagaNumero = numero;
		
		
	}

	public StatusVaga getStatusVaga() {
		return statusVaga;
	}

	public void setStatusVaga(StatusVaga statusVaga) {
		this.statusVaga = statusVaga;
	}

	public Double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(Double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public static int getNcarrosEstacionados() {
		return ncarrosEstacionados;
	}

	public static void setNcarrosEstacionados(int ncarrosEstacionados) {
		EstacionarCarro.ncarrosEstacionados = ncarrosEstacionados;
	}

	public EstacionarCarro(EstacionarCarro objectEstacionar) {
	
		this.id = objectEstacionar.getId();
		this.entrada = objectEstacionar.getEntrada();
		this.saida = objectEstacionar.getSaida();
		this.vagaNumero = objectEstacionar.getVagaNumero();
		this.carro.setId(objectEstacionar.getCarro().getId());
		this.carro.setModelo(objectEstacionar.getCarro().getModelo());
		this.carro.setPlaca(objectEstacionar.getCarro().getPlaca());
		
	
	}

	Carro carro = new Carro();



	public Carro getCarro() {
		return carro;
	}
	
	public void setCarro(Carro carro) {
		
		this.carro = carro;
	
	}

	public Integer getId() {

		return id;

	}

	public void setId(Integer id) {

		this.id = id;

	}

	public Date getEntrada() {

		return entrada;

	}

	public void setEntrada(Date entrada) {

		this.entrada = entrada;

	}

	public Date getSaida() {

		return saida;

	}

	public void setSaida(Date saida) {

		this.saida = saida;

	}

	public Integer getVagaNumero() {

		return vagaNumero;

	}

	public void setVagaNumero(Integer vagaNumero) {

		this.vagaNumero = vagaNumero;

	}
	
	public void retirarVeiculo() {
		
		if(this.statusVaga.equals(StatusVaga.OCUPADA)) {
		
				this.statusVaga = StatusVaga.DISPONIVEL;
				this.setSaida(new Date());
				this.valorTotalPorTempo(this.calcTempo(this.getEntrada(), this.getSaida()));
				EstacionarCarro.ncarrosEstacionados -= EstacionarCarro.ncarrosEstacionados;
				
		
		}else {
				
				System.out.print("A vaga está livre !!!");
			
			}	
		}
	
	public void estacionarVeiculo() {
		
		if(this.statusVaga.equals(StatusVaga.DISPONIVEL)) {
			
			this.statusVaga = StatusVaga.OCUPADA;
			this.setEntrada(new Date());
			
		
		}else {
			
			System.out.print("Vaga está ocupada");
			
		}	
	}
		
	public long calcTempo(Date inicio, Date fim) {
		
		return fim.getTime()+3 - inicio.getTime(); 
	}
	

	public void valorTotalPorTempo(long tempo) {
		
		if(tempo < 1) {
		
			this.valorPagar = 4.00; 	
		
		}else if(tempo >= 1 && tempo < 2){
		
			this.valorPagar = 6.00;
		
		}else if(tempo >= 2 && tempo < 3) {
			
			this.valorPagar = 10.00;
		
		}else if(tempo >= 3) {
			
			this.valorPagar = 15.00;
		}
		
		
	}
	
	@Override
	public String toString() {
		return "EstacionarCarro  [\nid=" + id + ",\n entrada=" + entrada + ", \nsaida=" +   saida + ",\n vagaNumero=" + vagaNumero
				+ ",\n statusVaga="
				+ "" + statusVaga + ", carro=" + carro
				+ "Valor a Pagar=" +  valorPagar + "]";
				
	}	

	

}
