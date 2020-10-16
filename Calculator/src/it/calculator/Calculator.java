package it.calculator;

import java.util.Scanner;

/* Operazioni in una calcolatrice: 
 * Addizione 
 * Sottrazione
 * Moltiplicazione
 * Divisione
 * Radice Quadrata

*/
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci due numeri: ");
		
		//nextDouble() legge i due numeri inseriti in input in formato double.
		double n1 = sc.nextDouble(); 
		double n2 = sc.nextDouble(); 
		
		System.out.print("Inserisci un operatore (+, -, *, /): "); 
		char op = sc.next().charAt(0); 
		
		double ris = 0; 
		
		switch (op) {
		case '+':
			ris = n1+n2;
			break;
		case '-':
			ris = n1-n2; 
			break; 
		case '*':
			ris = n1*n2; 
			break; 
		case '/':
			ris = n1/n2; 
			break; 
			
		// Caso in cui non ho sbagliato operatore
		default:
			System.out.println("Operatore non valido.");
			break;
		}
		
		//Permette di stampare nel formato giusto!
		System.out.printf("%.1f %c %.1f = %.1f", n1, op, n2, ris);
		
	}
}
