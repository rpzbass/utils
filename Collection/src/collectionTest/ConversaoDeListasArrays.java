package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListasArrays {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();

		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);

		Object[] objs = numeros.toArray();

		Integer[] numerosArray = new Integer[numeros.size()];

		numeros.toArray(numerosArray);

		System.out.println("\n--------------array------------------\n");

		for (Integer numero : numerosArray) {

			System.out.println(numero);
		}

		System.out.println("\n--------------objs------------------\n");

		for (Object obj : objs) {
			System.out.println(obj);
		}

		System.out.println(Arrays.toString(numerosArray));

		Integer[] arrayNumeros = new Integer[4];

		arrayNumeros[0] = 10;
		arrayNumeros[1] = 9;
		arrayNumeros[2] = 8;
		arrayNumeros[3] = 7;

		System.out.println(Arrays.toString(arrayNumeros));

		List<Integer> listNumeros = new ArrayList<Integer>();

		listNumeros.addAll(Arrays.asList(arrayNumeros));

		// listNumeros = Arrays.asList(arrayNumeros);

		listNumeros.set(3, 30);

		listNumeros.add(40);
		
		listNumeros.set(4, 45);

		System.out.println("\n-------------Impressão do array convertido em lista-------------\n");

		System.out.println(Arrays.toString(arrayNumeros));

		listNumeros.forEach(System.out::println);

	}

}
