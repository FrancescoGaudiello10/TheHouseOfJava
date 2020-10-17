package reverseString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Inserisci la parola da capovolgere: ");
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine(); 
			
			int len = s.length();
			char[] ris = new char[len];
		
			for (int i = 0; i < s.length(); i++) {
	            ris[--len] = s.charAt(i);
	        }
			System.out.println(ris);
		}
	}
}
