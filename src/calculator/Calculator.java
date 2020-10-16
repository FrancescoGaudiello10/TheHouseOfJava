/* Programma che mi fa da calcolatrice:
 * - addizione
 * - sottrazione
 * - moltiplicazione
 * - divisione
 * */ 

package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci due numeri: ");
		
		double first = sc.nextDouble(); 
		double second = sc.nextDouble(); 
		
		System.out.println("Inserisci un operatore (+,-,*,/): ");
		char op = sc.next().charAt(0);
		
		double res = 0; 
		
		switch (op) {
		case '+':
			res = first+second; 
			break;
		case '-':
			res = first-second;
			break;
		case '*':
			res = first*second; 
			break; 
		case '/': 
			res = first/second; 
			
			//Caso in cui ho inserito un operatore sbagliato: 
		default:
			System.out.println("Operatore non valido!");
			break;
		}
		
		System.out.printf("%.1f %c %.1f = %.1f", first, op, second, res);
	}
}
