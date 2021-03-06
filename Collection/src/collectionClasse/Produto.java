package collectionClasse;

import java.util.Comparator;

public class Produto implements  Comparator<Produto>,Comparable<Produto> {

	private String serialNumber;
	private String nome;
	private Double preco; /*
							 * Diferen?a do tipo primitivo double para Double ? que double n?o possui
							 * metodos por ser tipo primitivo
							 */
	private Integer qtde;

	public Produto() {

	}

	public Produto(String serialNumber, String nome, Double preco) {

		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;

	}

	public Produto(String serialNumber, String nome, Double preco, Integer qtde) {

		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setId(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [serialNumber= " + serialNumber + "  Nome= " + nome + "  Preco= " + preco + "]\n";
	}

	@Override
	public int compareTo(Produto otherObject) {

		/*
		 * Negativo = se this.object < otherObject Zero = se this.object == otherOBject
		 * Positivo = se this.object > otherObject
		 */
		return this.preco.compareTo(otherObject.getPreco());
	}

	@Override
	public int compare(Produto o1, Produto o2) {
		
		return o1.getNome().compareTo(o2.getNome());
	
	}

}
