package Generics.genericsTest;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {

	public static void main(String[] args) {
			
	/*	List<Cachorro> cachorroList = criarArray(new Cachorro()); 
		
		System.out.println(cachorroList);
		*/
		criarArray(new Cachorro());
	
	}
    /* não podemos utilizar wildCard na parametrização apenas uma classe que seja sub de Animal */
	public static <T extends Animal> void criarArray(T t) {    
		
		List<T> list = new ArrayList<>();		
		
		list.add(t);
		System.out.println(list);
	
	}
	
}
