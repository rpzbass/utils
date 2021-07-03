package Generics.genericsTest;

import java.util.ArrayList;
import java.util.List;

import collectionClasse.Computador;

public class ClasseNaoGenericaTest {

	public static void main(String[] args) {

		
		CarroAlugavel carroAlugavel = new CarroAlugavel();
		Computador carroAlugado = carroAlugavel.getCarroDisponivel();
		
		System.out.println("Usando o carro por um mes");
		carroAlugavel.devolverCarro(carroAlugado);
		
		
		
		
	}

}

class CarroAlugavel {

	private List<Computador> carrosDisponiveis = new ArrayList<>();
	{
		carrosDisponiveis.add(new Computador("Gol"));
		carrosDisponiveis.add(new Computador("BMW"));
	}

	public Computador getCarroDisponivel() {

		Computador c = carrosDisponiveis.remove(0);
		System.out.println(" Alugando carro: " + c);
		System.out.println("Carros disponiveis" + carrosDisponiveis);
		return c;
	}

	public void devolverCarro(Computador c) {

		System.out.println("Devolvendo carro: " + c);
		carrosDisponiveis.add(c);
		System.out.println("Carros disponiveis" + carrosDisponiveis);

	}
}

class ComputadorAlugavel {

	private List<Computador> computadorDisponiveis = new ArrayList<>();
	{
		computadorDisponiveis.add(new Computador("Lenovo"));
		computadorDisponiveis.add(new Computador("IBM"));
	}

	public Computador getCarroDisponivel() {

		Computador c = computadorDisponiveis.remove(0);
		System.out.println(" Alugando computador: " + c);
		System.out.println("Computadores disponiveis" + computadorDisponiveis);
		return c;
	}

	public void devolverCarro(Computador c) {

		System.out.println("Devolvendo computador: " + c);
		computadorDisponiveis.add(c);
		System.out.println("Computadores disponiveis" + computadorDisponiveis);

	}

	
	
}
