package ios.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderVersionTwo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	    String [] teste = new String[10];
		
	    
	   for(int i =0 ;i < teste.length;i++) {
		   teste[i] = in.readLine();
	   }

	    
	   for(String line : teste) {
		   System.out.println(line);
	   }
	   
	   
	   
	   

	}

}
