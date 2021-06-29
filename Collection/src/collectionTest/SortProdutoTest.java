package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collectionClasse.Produto;

class ProdutoNomeComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {

		return o1.getNome().compareTo(o2.getNome());

	}

}

public class SortProdutoTest {

	public static void main(String[] args) {

		separadorMenu("Produtos");

		List<Produto> produtos = new ArrayList<>();

		Produto[] produtosArray = new Produto[4];

		Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0);
		Produto produto2 = new Produto("321", "Picanha", 26.4);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5);

		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);

		
		produtosArray[0] = produto1;
		produtosArray[1] = produto2;
		produtosArray[2] = produto3;
		produtosArray[3] = produto4;
		
		
		
		
		Collections.sort(produtos, new ProdutoNomeComparator());

		for (Produto prod : produtos) {
			System.out.println(prod);
		}

		separadorMenu("Referencias dentro do Array");
		
		System.out.println(Arrays.toString(produtosArray));
		
		
		
		
	}

	public static void separadorMenu(String title) {

		System.out.println("--------------------------[ " + title + " ]--------------------------\n");

	}

}
