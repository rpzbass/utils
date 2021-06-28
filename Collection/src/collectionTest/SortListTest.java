package collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		nomes.add("Akuma");
		nomes.add("joaodascoves");
		nomes.add("DevDojo");
		nomes.add("joaodascoves2");
		nomes.add("DevDojo2");
		nomes.add("Fulano");
		nomes.add("sagat");

		Collections.sort(nomes);

		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println("-----------------------");

		Collections.sort(nomes);

		Collections.reverse(nomes);

		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println("----------Numeros-------------");

		List<Double> numeros = new ArrayList<>();

		numeros.add(1.0);
		numeros.add(1.5);
		numeros.add(2.0);
		numeros.add(2.5);
		numeros.add(3.0);
		numeros.add(3.5);
		numeros.add(4.0);

		for (Double numero : numeros) {
			System.out.println(numero);
		}

	}

}
