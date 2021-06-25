package collectionTest;

import java.util.ArrayList;

import collectionClasse.Celular;

public class EqualsTest {

	public static void main(String[] args) {

		String nome1 = "joaodascoves";
		String nome2 = new String("joaodascoves");

		
		
		ArrayList<String> listString = new ArrayList<>();
		
		listString.add("nome1");
		listString.add("nome2");
		listString.add("nome3");
		listString.add("nome4");
		
		
		listString.forEach(System.out::println);
		
		
		
		
		
		Integer int1 = 5;
		Integer int2 = 5;

		System.out.println(int1 == int2);
		System.out.println("\n-----------");
		System.out.println(nome1.equals(nome2));

		
		Celular c1 = new Celular("Iphone","1234");
		Celular c2 = new Celular("Iphone","1234");
		
		
		System.out.println("hashcode" + c1.hashCode());
		System.out.println("hashcode2" + c2.hashCode());
		
		System.out.println(c1.equals(c2));
		
	}

}
