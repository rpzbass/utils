package Generics.genericsTest;

import java.util.ArrayList;
import java.util.List;

import collectionClasse.Carro;
import collectionClasse.Computador;

public class ClasseGenericaTeste {

	public static void main(String[] args) {
	
		List<Carro> carrosDisponiveis = new ArrayList<>();
		
		carrosDisponiveis.add(new Carro("Gol"));
		carrosDisponiveis.add(new Carro("BMW"));
		
		/* Instanciamos a classe generica passando uma lista de carros disponiveis */
		ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
		
		Carro carro = carroAlugavel.getObjetoDisponivel();
		System.out.println("Usando o carro por um mês\n");
		carroAlugavel.devolverObjeto(carro);
		
		List<Computador> computadorDisponiveis = new ArrayList<>();
		
		computadorDisponiveis.add(new Computador("IBM"));
		computadorDisponiveis.add(new Computador("Lenovo"));
		computadorDisponiveis.add(new Computador("Acer"));
		
		/* Instanciamos a classe generica passando uma lista de computadores disponiveis */
		ObjetosAlugaveis<Computador> computadorAlugavel = new  ObjetosAlugaveis<>(computadorDisponiveis);
		
		Computador computador = computadorAlugavel.getObjetoDisponivel();
		System.out.println("\nUsando o computador por um mes");
		computadorAlugavel.devolverObjeto(computador);		
	}

}
class ObjetosAlugaveis<T> {

	private List<T> objetosDisponiveis;

	public ObjetosAlugaveis(List<T> objetosDisponiveis) {
	
		this.objetosDisponiveis = objetosDisponiveis;
	}

	public T getObjetoDisponivel() {

		T t = objetosDisponiveis.remove(0);
		System.out.println(" Alugando objeto: " + t);
		System.out.println("Objetos disponiveis" + objetosDisponiveis);
		return t;
	}

	public void devolverObjeto(T t) {

		System.out.println("Devolvendo objeto: " + t);
		objetosDisponiveis.add(t);
		System.out.println("Objetos disponiveis" + objetosDisponiveis);

	}

	
	
}
