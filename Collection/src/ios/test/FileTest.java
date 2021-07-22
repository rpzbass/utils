package ios.test;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		

		File file = new File("arquivo3.txt");
		file.createNewFile();
		deletarArquivo(file);
		verificaArqExiste(file);
		
	}
	public static void deletarArquivo(File file) {
		file.delete();
	}
	public static void verificaArqExiste(File file) {
		
		System.out.println( (file.exists())?" O arquivo já existe  " : " O arquivo não existe ou foi deletado  ");
		
	}
	

}




