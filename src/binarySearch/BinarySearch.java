package binarySearch;

/* Implementzione ricorsiva di un Binary Search
 * 
 * Ritorna all'indice di x se presente nell'array arr[l, ..., r] altrimenti -1
 * 
 * Classico esempio di Quick Sort: https://it.wikipedia.org/wiki/Quicksort
 * 
 * */

public class BinarySearch {
	
	private int binarySearch(int arr[], int low, int high) {
		
		int pivot = arr[high];
		int i = low-1; //index of smaller element
		
		for(int j = low; j < high; j++) {
			if(arr[j] <= pivot) {
				i++; 
				
				int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
			}
		}
		 // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1;
	}	
	
	
	
	//Algoritmo di ordinamento dell'array
	private void sort(int arr[], int low, int high){ 
        if (low < high){ 
            int pi = binarySearch(arr, low, high);
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
	
	/* A utility function to print array of size n */
    private static void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    
    //Controllo se è presente il valore
    private static int ricerca(int[] a, int elem) {
    	for(int i = 0; i < a.length; i++) {
    		if(a[i] == elem) {
    			return i; 
    		}
    	}
    	return -1; 
    }
    
    // Driver program 
    public static void main(String args[]) { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        BinarySearch ob = new BinarySearch(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("Sorted array: "); 
        printArray(arr); 
        
        int elemR = 110; 
        System.out.println("Effettuo la ricerca, elemento da ricercare = "+elemR);
        
        int res = ricerca(arr, elemR);
        if(res == -1) {
        	System.out.println("Elemento non trovato.");
        }
        else {
        	System.out.println("Elemento presente nell'array in posizione: " + res);
        }
    } 
} 

