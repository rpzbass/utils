package collectionTest;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		/*  List nomes = new ArrayList();    Até a versão 4 do java era assim */ 
	    
		/*	List<String> nomes = new ArrayList<String>();  Apartir da versão 5.0 o java foi incluido o tipo generics <T> */
		
		/*   Apartir da versão 7 foi incluido o tipo diamante <>  */
		List<String> nomes = new ArrayList<>(); 
		
			nomes.add("nome1");
			nomes.add("nome2");
			nomes.add("nome3");
			nomes.add("nome4");
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
		nomes.add("nome5");
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
		System.out.println("\n-----------Adiciona tudo para outra lista--------------------------\n");
		
		nomes.add("nome+");
		
		Integer tamnomelist = nomes.size();
		
		for(int i =0;i < tamnomelist;i++) {
			System.out.println(nomes.get(i));
		}
		
		List<String> stf2emeio = new ArrayList<>();
			
		stf2emeio.add("Blanka");
		stf2emeio.add("Ken");
		stf2emeio.add("Ryu");
		stf2emeio.add("Dhalsim");
	
		nomes.addAll(stf2emeio);
			
		System.out.println("\n--------------------Lista copiado--------------------\n");
		
	    for(String line : dumpList(stf2emeio)) { 	    	  
	    	System.out.println(line);
	    }
	    
	    System.out.println("\n--------------------Limpando a lista--------------------\n");
	    nomes.clear(); // mesmo  limpando a lista ainda existirá uma referencia
	    
	    for(String line : nomes) {
	    	
	    	
	    	System.out.println(line);
	    	
	    }
	    
	    
	    

	    
	    
	    
	    
	    
	    
	    
	}

	public static List<String>  dumpList(List<String> param){
	
			List<String> list = new ArrayList<>();
			list.addAll(param);
			return list;
	}
	
	
}
