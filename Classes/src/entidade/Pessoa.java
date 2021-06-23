package entidade;

public class Pessoa {

	/* Atributos */
	
	private String nome;
	private Integer idade;
	private Integer peso;
	
	/* Construtores  */
	
	public Pessoa() {
		
	}
	
	/* Construtores com argumentos  ou sobrecarga */
	
	public Pessoa(String nome,Integer idade,Integer peso) {
		
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;

	}
    /* gettes e setters */
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}

	
}
