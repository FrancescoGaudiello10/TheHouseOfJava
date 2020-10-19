package removingElement;

import java.util.ArrayList;

public class RemoveElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("C");
		arr.add("Ruby");
		arr.add("Python");
		arr.add("Java");
		arr.add("Python");
		arr.add("Swift");
		
		System.out.println("Array iniziale: " + arr);
		System.out.println("L'array è vuoto? "+arr.isEmpty());
		
		int index = -1; 
		for(String el : arr) {
			if(el=="C") {
				index = el.indexOf("C"); //Mi trovo la prima occorrenza di "C"
			}
		}
		if(index != -1) {
			arr.remove(index); //Rimuovo tramite indice
		}
		
		System.out.println("Ho appena rimosso C");
		System.out.println("Array dopo la remove: " + arr);
		
		System.out.println("Svuoto l'array...");
		arr.clear(); 
		System.out.println("L'array è vuoto ora? "+arr.isEmpty());
	}

}
