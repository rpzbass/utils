package br.com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

		List<Palestrante> palestrantes_dto = new ArrayList<>();

		palestrantes_dto.add(new Palestrante(1, "Fulano", "Cidades Inteligentes"));
		palestrantes_dto.add(new Palestrante(2, "Ciclno", "Sistema Solar"));
		palestrantes_dto.add(new Palestrante(3, "Joao", "Carros Eletricos"));
		palestrantes_dto.add(new Palestrante(4, "fulano", "Industria 4.0"));
		palestrantes_dto.add(new Palestrante(5, "fulano", "BitCoins"));

		Palestra palestra = new Palestra();
		palestra.setData(LocalDate.now());
		palestra.setLocal("Rua A Nº 60");
		palestra.setInicio("10:00");
		palestra.setFim("12:00");

		for (Palestrante pales : palestrantes_dto) {

			palestra.getPalestrantes().add(new Palestrante(pales));
		}

		System.out.print(palestra.toString());

		Palestra palestra2 = new Palestra();
		palestra2.setData(LocalDate.now());
		palestra2.setLocal("Rua B Nº 90");
		palestra2.setInicio("13:00");
		palestra2.setFim("18:00");

		for (Palestrante pale2 : palestrantes_dto) {

			palestra2.getPalestrantes().add(pale2);
		}

		System.out.print(palestra2.toString());

	}

}
