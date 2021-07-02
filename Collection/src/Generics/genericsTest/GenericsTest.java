package Generics.genericsTest;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		
		
		List lista = new ArrayList();
	
		lista.add("string1");
		lista.add("string2");
		lista.add("string3");
		
		for(Object str: lista) {
			System.out.println(str);
			
		}
		add(lista,1L);
		
		
	}
	
	public static void add(List lista, Long l) {
		lista.add(l);
	}

}
