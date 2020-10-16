package factorial;

import java.util.Scanner;

/*
 * Il fattoriale di un numero (4!) è il numero moltiplicato per tutti i suoi valori minori positivi. 
 * */

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il numero: ");
		int n = sc.nextInt(); 
		
		int fattoriale = fact(n);
		System.out.println("Il fattoriale del numero inserito è: " + fattoriale);
	}
	
	
	//Creo una funzione che mi calcola il fattoriale.
	private static int fact(int n) {
		int output;
		if(n < 1) {
			System.out.println("Hai inserito un numero minore di 1, non funziona.");
			return -1;
		}
		
		else if(n == 1) {
			return 1; 
		}
		else {
			output = fact(n-1)*n; 
			return output;
		}
	}
}
