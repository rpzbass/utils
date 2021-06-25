package serializacao.classes;

import java.io.Serializable;

public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private transient String password;
	private static String nomeEscola = "DevDojo";
	private Turma turma;
	

	public Aluno() {

	}

	public Aluno(Long id, String nome, String password,Turma turma ) {

		this.id = id;
		this.nome = nome;
		this.password = password;
		this.setTurma(turma);
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + 
				", nome=" + nome + 
				", password=" + password + 
				", nomeEscola=" + nomeEscola + 
				", turma="+ turma + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static String getNomeEscola() {
		return nomeEscola;
	}

	public static void setNomeEscola(String nomeEscola) {
		Aluno.nomeEscola = nomeEscola;
	}

}
