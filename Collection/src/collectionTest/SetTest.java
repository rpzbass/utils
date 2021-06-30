package collectionTest;

import java.util.LinkedHashSet;
import java.util.Set;

import collectionClasse.Produto;

public class SetTest {
	
	/* N�o possui elementos repetidos, e tambem n�o possui indexa��o, ou seja os elementos n�o possuem ordem  */

	public static void main(String[] args) {

		Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0,10);
		Produto produto2 = new Produto("321", "Picanha", 26.4,10);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0,0);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5,0);
		Produto produto5 = new Produto("013", "Samsung galaxy S6 64Gb", 3250.5,0);
		
		/* Set<Produto> produtoSet = new HashSet<>(); HashSet n�o possui ordem de inser��o */
		
		Set<Produto> produtoSet = new LinkedHashSet<>();
		
		/* Perceba que com LinkedHashSet mantem a [ORDEM DE INSER��O] , porem permite elementos duplicados */
			
		produtoSet.add(produto1);
		produtoSet.add(produto2);
		produtoSet.add(produto3);
		produtoSet.add(produto4);
		produtoSet.add(produto5);

		for(Produto prod: produtoSet) {
			System.out.println(prod);
		}
		
		
		
	}

}
