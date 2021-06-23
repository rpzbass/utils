package br.com.estacionamento.model;

import java.util.HashSet;
import java.util.Set;

public class Estacionamento {

	private Integer id;

	private String nome;
	private String fone;
	private String email;
	private String cnpj;
	
	
	
	Set<EstacionarCarro> estacionarcarros = new HashSet<>();  //Apartir do java 7 não há necessidade de repetir o tipagem<> operador diamente
	
	public Estacionamento() {
		
	}
	
	public Set<EstacionarCarro> getEstacionarCarros() {
		return estacionarcarros;
	}

	public void setEstacionarCarros(Set<EstacionarCarro> estacionarcarros) {
		this.estacionarcarros = estacionarcarros;
	}

	public Estacionamento(Integer id,String nome,String fone, String email,String cnpj) {
		
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
		this.cnpj = cnpj;
	
	}
	
	public Estacionamento(Estacionamento entidade) {
	
		this.id = entidade.getId();
		this.nome = entidade.getNome();
		this.fone = entidade.getFone();
		this.email = entidade.getEmail();
		this.cnpj = entidade.getCnpj();
		
	}
	
	public Integer getId() {
		
		return id;
	}

	public void setId(Integer id) {
		
		this.id = id;
	}

	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		
		this.nome = nome;
	
	}
	public String getFone() {
		
		return fone;
	
	}
	public void setFone(String fone) {
		
		this.fone = fone;
	
	}
	public String getEmail() {
		
		return email;
	
	}
	public void setEmail(String email) {
		
		this.email = email;
	
	}
	public String getCnpj() {
		
		return cnpj;
	
	}
	public void setCnpj(String cnpj) {
		
		this.cnpj = cnpj;
	
	}
	
	
	@Override
	public String toString() {
		return "Estacionamento [id=" + id + ", nome=" + nome + ", fone=" + fone + ", email=" + email + ", cnpj=" + cnpj
				+ ",\n estacionarcarros=" + estacionarcarros + "]\n";
	}
	
	
	
}
