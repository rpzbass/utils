package collectionTest;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {

	/* 
	 * Apesar de inserir desordenamente os valores, como estamos utilizando a Classe String na chave,
	 * e consequentemente essa classe implementa nativamente a interface comparable  Comparable<T>
	 */
	
	 /* Metodos uteis     T -> tipo do dado  |   key  -> chave neste caso, chaves do tipo String. 
	  * 
	  * headMap(T tKey) -> retorna os valores encadeados , menores que a chave passada. eX.   map.headMap("B") retorna A.
	  * headMap(T tKey, true) -> retorna os valores encadeados porem inclusivo. eX. map.headMap("B",true) retorna A B.
	  * pollFirstEntry(T Key) ->remove retorna o primeiro valor.
	  * pollLastEntry(T Key) ->  remove e retorna o ultimo valor.   
	  * higherKey(T Key) ->  retorna o maior valor.
	  * descendingMap() -> retorna os valores em ordem reversa. 
	  * 
	  * */
	
	public static void main(String[] args) {
		
		NavigableMap<String,String> map = new TreeMap<>();
		
		map.put("A", "Letra A");
		map.put("D", "Letra D");
		map.put("B", "Letra B");
		map.put("C", "Letra C");
		
		for(Map.Entry<String,String> key: map.entrySet()) {
			System.out.println(key.getKey() + " " + key.getValue());
		}
			System.out.println(map.higherKey("C"));
			
	}

}
