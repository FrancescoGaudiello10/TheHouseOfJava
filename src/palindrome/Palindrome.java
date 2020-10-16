package palindrome;

import java.util.Scanner;

/* Palidrome è detta una parola che letta al contrario è uguale.*/
public class Palindrome {

	
	private static void checkPalindrome(String input) {
		boolean res = true;
		int length = input.length();
		for(int i = 0; i < length/2; i++) {
			
			if(input.charAt(i) != input.charAt(length-i-1)) { //Se questo IF è verificato, allora non è palindroma ed esco.
				res = false; 
				break; 
			}
		}
		System.out.println("La parola "+ input+ "è palindroma? " + res);
	}
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Inserisci la parola: ");
			String str = sc.nextLine();
			
			checkPalindrome(str);
		}
	
	}
}
