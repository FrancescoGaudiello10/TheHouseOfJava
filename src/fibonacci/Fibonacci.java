/* La serie di fibonacci è una serie in cui il numero è dato dalla somma dei due precedenti:
 * 0 1 1 2 3 5 8 13 21 ecc..*/

package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Inserire il numero da cui si vuole partire: ");
			int inp = sc.nextInt();
			
			int t1=0, t2=1; 
			System.out.println("Serie fino a " + inp + ": ");
			
			while(t1 <=inp) {
				System.out.print(t1 + " + " );
				
				int sum = t1+t2;
				t1 = t2;
				t2 = sum;
			}
		}

	}

}
