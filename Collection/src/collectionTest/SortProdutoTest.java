package collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collectionClasse.Produto;

public class SortProdutoTest {

	public static void main(String[] args) {

	
		separadorMenu("Produtos");
		
		List<Produto> produtos = new ArrayList<>();

		Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0);
		Produto produto2 = new Produto("321", "Picanha", 26.4);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5);

		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);

		Collections.sort(produtos);
		
		for(Produto prod: produtos) {
			System.out.println(prod);
		}
		
		
	}

	
	
	public static void separadorMenu(String title) {
		
		System.out.println("--------------------------[ "+ title + " ]--------------------------\n");
		
	}
	
	
}
