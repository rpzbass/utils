package collectionTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		
		Map<String,String> map = new HashMap<>();
		
		map.put("teklado","Teclado");
		map.put("Nouse","Mouse");
		map.put("mesa","você");
		map.put("vc","voce");
		
		for(String key: map.values()) {
			System.out.println(key);
		}
		
		System.out.println("\n---------------------------------------------------------\n");
		
		for (Map.Entry<String,String> entry : map.entrySet()) {	
			System.out.println(entry.getKey() + " " + entry.getValue());	
		}
		
		
	}

}
