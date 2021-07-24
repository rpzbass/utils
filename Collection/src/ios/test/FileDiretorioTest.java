package ios.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDiretorioTest {

	public static void main(String[] args) {
		
		
		File directory = new File("folder"); /* cria uma instancia da classe File */
		boolean mkdir = directory.mkdir();  /* Cria um diretorio com metodo mkdir() */
		System.out.println(" Diretorio criado "+ mkdir); 
		File arquivo = new File(directory,"arquivo.txt");

		try {
			arquivo.createNewFile();
			File novoArq = new File(directory,"novoArq.txt");
			arquivo.renameTo(novoArq);
			File dirRenomeado = new File("folde2");
			boolean dir = directory.renameTo(dirRenomeado);
			System.out.println(dir);
	   		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		//buscarArquivos();
	
	}
	
	
	public static void buscarArquivos() {
		
		File file = new File("folder");
		String [] list = file.list();
		
		for(String arq: list) {
			System.out.println(arq);
			
		}
		
	}
	
	
	

}
