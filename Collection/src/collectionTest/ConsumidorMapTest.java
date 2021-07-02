package collectionTest;

import java.util.*;

import collectionClasse.Consumidor;
import collectionClasse.Produto;

public class ConsumidorMapTest {

	public static void main(String[] args) {
	
		Consumidor consumidor1 = new Consumidor("Joao das coves","055");
		Consumidor consumidor2 = new Consumidor("Dev Dojo","066");
		
		Produto produto1 = new Produto("123", "LapTop Lenovo", 2000.0);
		Produto produto2 = new Produto("321", "Picanha", 26.4);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
		Produto produto4 = new Produto("012", "Samsung galaxy S7 64Gb", 3250.5);
	
		Map<Consumidor,List<Produto>> map = new HashMap<>();
		
		List<Produto> produtoCon1 = new ArrayList<>();
		
		produtoCon1.add(produto1);
		produtoCon1.add(produto2);
		
		List<Produto> produtoCon2 = new ArrayList<>();
		
		produtoCon2.add(produto3);
		produtoCon2.add(produto4);
		
		map.put(consumidor1, produtoCon1);
		map.put(consumidor2, produtoCon2);
		
		for(Map.Entry<Consumidor,List<Produto>> vendas : map.entrySet()) { 
			
			System.out.println("Consumidor----------------------------");
			System.out.println(vendas.getKey().getNome());
			System.out.println("Produtos-------------------------------\n");
			
			for(Produto prods : vendas.getValue()) {
				System.out.println(prods.getNome());	
			}
			
			
		}
		
	
	}

}
