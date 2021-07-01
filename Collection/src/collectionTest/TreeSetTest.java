package collectionTest;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

import collectionClasse.Celular;
import collectionClasse.Produto;

class CelularNomeComparator implements Comparator<Celular>{

	@Override
	public int compare(Celular o1, Celular o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
}

public class TreeSetTest {

	public static void main(String[] args) {
		
		
		Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0,10);
		Produto produto2 = new Produto("321", "Picanha", 26.4,10);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0,0);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5,0);
		Produto produto5 = new Produto("013", "Samsung galaxy S6 64Gb", 3250.5,0);
		
		Celular celular = new Celular("Iphone 7", "1234");
		
		NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
		NavigableSet<Celular> celularNavigableSet = new TreeSet<>(new CelularNomeComparator());
		
		celularNavigableSet.add(celular);
		
		
		for(Celular cel: celularNavigableSet) {
			
			System.out.println(cel);
		}
		
		produtoNavigableSet.add(produto1);
		produtoNavigableSet.add(produto2);
		produtoNavigableSet.add(produto3);
		produtoNavigableSet.add(produto4);
		produtoNavigableSet.add(produto5);
		
		
		System.out.println("----------Antes do descendingSet = ordem reversa---------------------\n");
		
			for(Produto prod: produtoNavigableSet) {
			
				System.out.println(prod);
			}
		
		System.out.println("\n----------Depois do descendingSet = ordem reversa---------------------\n");
			
	
		//produtoNavigableSet.forEach(System.out::println);
		
		/* methods NavigableSet 
		 * lower <
		 * floor <=
		 * higher >
		 * ceilling >=
		 * descendingSet ->  reverseList
		 */
		
		for(Produto prod: produtoNavigableSet.descendingSet()) {
			
			System.out.println(prod);
		}
	
	//	System.out.println("\n-----------higher = o maior relativo---------------------\n\n"+ produtoNavigableSet.higher(produto1));
		
		
		System.out.println(produtoNavigableSet.size());
		//System.out.println(produtoNavigableSet.pollFirst());
		
		System.out.println(produtoNavigableSet.pollLast());
		System.out.println(produtoNavigableSet.size());
		
		
		

	}

}
