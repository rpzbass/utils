package br.com.model;

public class Palestrante {

	private Integer id_palestrante;
	private String nome;
	private String tema;

	
	public Palestrante() {
				
	}

	public Palestrante(Integer id,String nome,String tema) {
		
		this.id_palestrante = id;
		this.nome= nome;
		this.tema = tema;
	}
	
	@Override
	public String toString() {
		return "Palestrante [id_palestrante=" + id_palestrante + ", nome=" + nome + ", tema=" + tema + "]\n";
	}

	public Palestrante(Palestrante entidade) {
		this.id_palestrante = entidade.id_palestrante;
		this.nome = entidade.nome;
		this.tema = entidade.tema;
		 
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
	
	
	
}
