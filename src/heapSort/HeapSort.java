/* Algoritmo di ordinamento: https://www.baeldung.com/java-heap-sort*/

package heapSort;

public class HeapSort {
	
	public void sort(int arr[]) {
		int n = arr.length; 
		
		//Building Heap
		for(int i = n/2-1; i >=0; i--) {
			heapify(arr, n, i);
		}
		
		for(int i = n-1; i>=0; i--) {
			int temp = arr[0];
			arr[0] = arr[i]; 
			arr[i] = temp; 
			
			heapify(arr, i, 0);
		}
	}
	
	
	private static void heapify(int arr[], int n, int i) {
		int largest = i; 
		int l = 2*i+1; 
		int r = 2*i+2; 
		
		//Se il figlio sinistro è più grande della radice
		if(l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		
		//Se il figlio destro è più grande della radice
		if(r < n && arr[r] > arr[largest]) {
			largest = r;
		}
		
		if(largest != i) {
			int swap = arr[i]; 
			arr[i] = arr[largest];
			arr[largest] = swap; 
			
			heapify(arr, n, largest);
		}
	}
	
	
	/* A utility function to print array of size n */
    private static void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,22,32,10,11,5,34};
		int n = arr.length;
		HeapSort hs = new HeapSort(); 
		hs.sort(arr); 
		System.out.println("L'array ordinato è: ");
		printArray(arr);
	}

}
