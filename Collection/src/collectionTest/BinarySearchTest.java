package collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Marvis
 *
 */

public class BinarySearchTest {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
	
		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);
		
		
		Collections.sort(numeros);
		
	//	numeros.forEach(System.out::println);
		
		
		
		//System.out.println(Collections.binarySearch(numeros,4));
	try {
			Scanner input = new Scanner(System.in);
		
	        System.out.println(numeros.get(Collections.binarySearch(numeros,input.nextInt())));
		
	        
	        
	}catch(IndexOutOfBoundsException e) {
		
		
		System.out.println("Valor não existe dentro do indice");
		
	}
	
		
} }
