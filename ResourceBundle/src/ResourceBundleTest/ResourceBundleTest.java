package ResourceBundleTest;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String[] args) {
		
		
		
		ResourceBundle rb = ResourceBundle.getBundle("messages", new Locale("pt","BR"));
		
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("bye"));
		System.out.println(rb.getString("HaveNiceDay"));
		System.out.println(rb.getString("goodlucky"));
		
		System.out.println("\n------------------------------------------------------------\n");
		
			
		ResourceBundle rb2 = ResourceBundle.getBundle("messages", new Locale("en","US"));
		
		System.out.println(rb2.getString("hello"));
		System.out.println(rb2.getString("bye"));
		System.out.println(rb2.getString("HaveNiceDay"));
		System.out.println(rb2.getString("goodlucky"));
		
		
		
		

	}
	
	
	/* content messages 
	hello= Ola Mundo ;)
	bye= Tchau
	HaveNiceDay= Tenha um bom dia
	goodlucky= Boa sorte 
	*/
	
	

}
