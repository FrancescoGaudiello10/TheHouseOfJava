package permutationANDcombination;

import java.util.Scanner;

/*
 * Una permutazione è data da: P(n,r) = n! / (n-r)!
 * Una combinazione è data da: P(n,r) = n! / r!(n-r)!
 * 
 * */


public class PermutationANDCombination {

	private static int fact(int num) {
		int fact = 1,i;
		for(i=1; i<=num; i++) {
			fact= fact*i;
		}
		return fact;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il valore di n: ");
		n = sc.nextInt(); 
		
		System.out.print("Inserisci il valore di r: ");
		r = sc.nextInt(); 
		
		System.out.println("Combinazione P(n,r) = " + (fact(n)/(fact(n-r)*fact(r))));
		System.out.println("Permutazione P(n,r) = " + (fact(n) / (fact(n-r))));
		
	}

}
