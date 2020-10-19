package hashMapProgram;

import java.util.HashMap;

public class HashMapPr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		System.out.println(map);
		
		map.put("abc", 10);
		map.put("jhd", 30);
		map.put("pdso", 50);
		
		System.out.println("La dimensione della mappa è: " + map.size());
		System.out.println(map);
		
		if(map.containsKey("abc")) {
			Integer v = map.get("abc");
			System.out.println("Il valore della chiave per 'abc' è: " + v );
		}
		
		map.clear();
		System.out.println(map);
		
		if(map.isEmpty()) {
			System.out.println("La mappa è vuota");
		}
		else {
			System.out.println("La mappa non è vuota.");
		}
	}
	

}
