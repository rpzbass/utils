package br.com.estacionamento.model;

public class EstacionarCarro {

	private Integer id;
	private String entrada;
	private String saida;
	private Integer vagaNumero;
	private StatusVaga statusVaga ;
	private Double valorPagar;
	

	public EstacionarCarro() {

	}

	public EstacionarCarro(Integer id, String entrada, String saida, Integer numero) {

		this.id = id;
		this.entrada = entrada;
		this.saida = saida;
		this.vagaNumero = numero;
		
		
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

	public String getEntrada() {

		return entrada;

	}

	public void setEntrada(String entrada) {

		this.entrada = entrada;

	}

	public String getSaida() {

		return saida;

	}

	public void setSaida(String saida) {

		this.saida = saida;

	}

	public Integer getVagaNumero() {

		return vagaNumero;

	}

	public void setVagaNumero(Integer vagaNumero) {

		this.vagaNumero = vagaNumero;

	}
	
	public void estacionarVeiculo() {
		
		this.statusVaga = StatusVaga.OCUPADA;
	}

	public void valorTotalPorTempo(Double tempo) {
		
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
				+ "" + statusVaga + ", carro=" + carro + "]";
	}

}
