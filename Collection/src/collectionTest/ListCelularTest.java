package collectionTest;

import java.util.ArrayList;
import java.util.List;

import collectionClasse.Celular;

public class ListCelularTest {

	public static void main(String[] args) {
		
			Celular celular1 = new Celular("Galaxy S7","123456");
			Celular celular2 = new Celular("Iphone","123456");
			Celular celular3 = new Celular("Sony Xperia","123456");
			Celular celular5 = new Celular("LG","789456");

			
			List<Celular> celulares = new ArrayList<>();
			
			celulares.add(celular1);
			celulares.add(celular2);
			celulares.add(celular3);
			celulares.add(celular5);

			/* ------------------------ Lista para pesquisar -----------------------*/
			List<Celular> wordList = new ArrayList<>();
			
			wordList.add(celular1);
			wordList.add(celular2);
			wordList.add(celular3);
			wordList.add(new Celular("LG","789456"));
			wordList.add(new Celular("HUAWHEI","7894565"));
			
			System.out.println("HASHCODE LISTA CELULARES");
			for(Celular cel: celulares) {
				
				System.out.println(cel.hashCode());
			}
			System.out.println("HASHCODE LISTA WORDLIST");
			
			for(Celular word: wordList) {
				
				System.out.println(word.hashCode());
			
			}
			
			

			Celular celular4 = new Celular("Galaxi S7","123456");
			
			/*System.out.println(celular1.equals(celular4));*/
		
			//System.out.println("Celulares: "+ celulares.contains(celular4));	
			
			System.out.println("\n----------- Verificando se existe nome na lista celulares----------------\n");
			
		
			for(Celular nome: wordList) {
				
				System.out.println(celulares.contains(nome));
			}
			
			
	}

}
