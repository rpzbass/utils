package ios.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {

	public static void main(String[] args) {

		File file = new File("arquivo3.txt");
		
		try(FileWriter fw = new FileWriter(file); FileReader fr = new FileReader(file)) 
		{

			fw.write("Uma mensagem foi escrita \ne pulando uma linha 2");
			fw.flush();
			fw.close();
						
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("Tamanho: "+size);
			
			for(char line : in) {
				System.out.print(line);
			}
			fr.close();
			
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
