package ios.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferredReader {

	public static void main(String[] args) {
		

		File file = new File("arquivo3.txt");

		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter(file)); /* cria uma canal de conexão com sistema operacional
			encadeado com FileWriter */
			bw.write(" Escrevendo primeira linha "); /*Escreve no arquivo */
			bw.newLine(); /* Pula uma linha dentro do arquivo  */
			System.out.println(" Escrevendo na segunda linha ");
			bw.flush(); /* empurra todo o fluxo do socket */
			bw.close(); /* Ferra o canal do buffer */
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);	
			}
			br.close(); /* não há necessidade de invocar o metodo fr.close(); */
			
		
		} catch (IOException e) {

			e.printStackTrace();
		
		}

	}

}
