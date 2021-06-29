package collectionTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import collectionClasse.Produto;

public class InteratorTest {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();

		Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0, 2);
		Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 5);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5, 0);

		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);

		Iterator<Produto> produtoIterator = produtos.iterator(); /* Iterator recebe uma referencia da lista de Objetos do tipo Produto */

		System.out.println("Antes da deleção : " + produtos.size());

		while (produtoIterator.hasNext()) {
			if (produtoIterator.next().getQtde().equals(0)) {
				produtoIterator.remove();
			}
		}
		System.out.println("Depois da deleção : " + produtos.size());

	}

}
