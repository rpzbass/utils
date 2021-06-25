package collectionTest;

import collectionClasse.Celular;

public class EqualsTest {

	public static void main(String[] args) {

		String nome1 = "joaodascoves";
		String nome2 = new String("joaodascoves");

		Integer int1 = 5;
		Integer int2 = 5;

		System.out.println(int1 == int2);
		System.out.println("\n-----------");
		System.out.println(nome1.equals(nome2));

		
		Celular c1 = new Celular("Iphone","1234");
		Celular c2 = new Celular("Iphone","1234");
		
		System.out.println(c1.equals(c2));
		
	}

}
