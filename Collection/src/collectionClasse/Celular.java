package collectionClasse;

public class Celular {

	
	private String nome;
	private String IMEI;
	
	
	public Celular() {
		
	}
	
	public Celular(String nome,String IMEI) {
		this.nome = nome;
		this.IMEI = IMEI;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	
	/* Reflexivo -> x.quals(x) tem ser true para tudo que for diferente de null
	* Simetrico -> para se y diferente de null, se x.equals(y) for igual true logo y.equals(x) tem que ser true tambem
	* Transitividade -> x, y, z diferente de null, se x.equals(y) == true, logo y.equals(x) == true e x.equals(x) == true logo y.equals(z) tambem tem ser true
	* Consistente -> x.equals(y) deve sempre retornar o mesmo valor
	* para x diferente de null x.equals(null) tem que retornar false;
	*/
	

	@Override
	public boolean equals(Object obj) {
		
		if(obj == null) return false; 
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return true;
		Celular outroCelular  = (Celular) obj;
		return IMEI != null? IMEI.equals(outroCelular.getIMEI()): false;	
		
	}

	@Override
	public String toString() {
		return "Celular [nome=" + nome + ","
			+ " IMEI=" + IMEI + "]";
	}
	
	
	
	
	
}
