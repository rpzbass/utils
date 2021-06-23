package br.com.empresa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class teste2 {

	
	public static void main(String[] args) {

		List<String> novalista = buscarCars().stream().filter(c -> (c.equals("gol"))).collect(Collectors.toList());

		/*while (novalista.size() > 2) {

			novalista.remove(novalista.size()-1);

		}
		*/
	
		System.out.print(novalista.size() + " \n");

		for (String element : novalista) {

			System.out.print(element.toString() + " \n");

		}

	}

	public static List<String> buscarCars() {

		List<String> car =  Arrays.asList("gol","gol","gol","gol","fusca","kadete","mercedes");
		
		return   car;

	}

}
