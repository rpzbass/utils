package serializacao.classes;

import java.io.Serializable;

public class Turma implements Serializable{


	private static final long serialVersionUID = 1L;
	private String nome;

	public Turma() {

	}

	public Turma(String nome) {

		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Turma [nome=" + nome + "]";
	}

	
	
	
	
}
