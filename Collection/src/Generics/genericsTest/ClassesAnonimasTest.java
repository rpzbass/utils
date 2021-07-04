package Generics.genericsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collectionClasse.Carro;

class An1mal {
	
	public  void andar() {
		System.out.println("Andando");
	}	
}
public class ClassesAnonimasTest {

	public static void main(String[] args) {
		
		An1mal animal = new An1mal(){
     		@Override
			public void andar() {		
				System.out.println("Andando anonimamente");
			}
		};
		animal.andar();
		
		List<Carro> carroList = new ArrayList<>();
		
		carroList.add(new Carro("BMW"));
		carroList.add(new Carro("Audi"));
	
	/*	Collections.sort(carroList, new Comparator<Carro>() {	
			@Override
			public int compare(Carro o1, Carro o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		});
	*/
		Collections.sort(carroList, (o1,o2) -> o1.getNome().compareTo(o2.getNome()));
		
		
		carroList.forEach(System.out::println);
		
	}
}
/*
class CarroComparator implements Comparator<Carro>{

	@Override
	public int compare(Carro o1, Carro o2) { 
		return o1.getNome().compareTo(o2.getNome());
	}
	
}
*/