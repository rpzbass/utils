package br.com.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Palestra {

	private Integer id_palestra;
	

	private String local;
	private LocalDate data;
	private String inicio;
	private String fim;
	
	
	List<Palestrante> palestrantes = new ArrayList<Palestrante>();
	
	
	
	
	public Integer getId_palestra() {
		return id_palestra;
	}

	public void setId_palestra(Integer id_palestra) {
		this.id_palestra = id_palestra;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFim() {
		return fim;
	}

	public void setFim(String fim) {
		this.fim = fim;
	}

	public List<Palestrante> getPalestrantes() {
	
		return palestrantes;
	
	}

	public void setPalestrantes(List<Palestrante> palestrantes) {
	
		this.palestrantes = palestrantes;
	
	}

	public Palestra() {
		
	}
	
	public Palestra(String local,LocalDate data) {
	
		this.local =local;
		this.data = data;
		
	}

	public String getLocal() {
	
		return local;
	
	}

	public void setLocal(String local) {
	
		this.local = local;
	
	}

	public LocalDate getData() {
	
		return data;
	
	}

	public void setData(LocalDate data) {
	
		this.data = data;
	
	}
	
	@Override
	public String toString() {
		return "Palestra [id_palestra=" + id_palestra + ", local=" + local + ", data=" + data + ", inicio=" + inicio
				+ ", fim=" + fim + ",\n palestrantes=\n" + palestrantes + "]";
	}
	
	
	
	
}
