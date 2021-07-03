package Generics.genericsTest;

import java.util.*;

abstract class Animal {

	public abstract void consulta(); /* assinatura de um metodo abstrato */
}

class Cachorro extends Animal implements Comparable {

	@Override
	public void consulta() {
		System.out.println("Consultando Cachorro");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Gato extends Animal {

	@Override
	public void consulta() {
		System.out.println("Consultando Gato ");
	}
}

public class WildCardTest {

	public static void main(String[] args) {

		Cachorro[] cachorros = { new Cachorro(), new Cachorro() };
		Gato[] gatos = { new Gato(), new Gato() };
		Animal[] animais = new Cachorro[5];
		List<Animal> listCachorros = new ArrayList<>();

		List<Cachorro> cachorroList = new ArrayList<>();
		
		listCachorros.add(new Cachorro());
		listCachorros.add(new Gato());

		for (int i = 0; i < animais.length; i++) {
			animais[i] = new Cachorro();
		}

		consultarAnimais(cachorros);
		consultarAnimais(gatos);
		consultarAnimais(animais);
		System.out.println("-----------------------------------");

		consultarAnimaisList(listCachorros);

		consultarCachorroList(listCachorros);
		System.out.println("-----------------------------------");
		consultarAnimaisList(listCachorros);
		ordenarLista(cachorroList);
		
		
	}

	public static void consultarAnimais(Animal[] animals) {

		for (Animal animal : animals) {
			animal.consulta();
		}

	}

	/*
	 * com o '?' digo ao java que vou passar qualquer tipo de lista com Subclasse da
	 * Superclase animal
	 */
	public static void consultarAnimaisList(List<? extends Animal> animals) {

		for (Animal animal : animals) {
			animal.consulta();
		}

	}

	/*
	 * com parametro super falamos para o java que ele aceitara qualquer tipo que
	 * seja Cachorro ou Animal que vai acabar sendo cachorro tambem, garante que
	 * teremos apenas uma lista de cachorros coisa que o exemplo anterior já não
	 * garante, e ocasionaria um erro em tempo de compilação
	 * o object é uma classe raiz digamos que seja o tipo mais generico, consequentemente uma super Classe de cachorro tambem.
	 */
	public static void consultarCachorroList(List<? super Cachorro> cachorroList) {

		Cachorro c1 = new Cachorro();
		Animal c2 = new Cachorro();
		Object c3 = new Cachorro();

		cachorroList.add(c1);
		cachorroList.add((Cachorro) c2);
		cachorroList.add((Cachorro) c3);

	}

	public static void ordenarLista(List<? extends Comparable> lista) {
		
		Collections.sort(lista);
		
	}
	
	
	
	
}
