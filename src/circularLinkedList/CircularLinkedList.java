/* Una circular linked list è una lista circolare che collega ogni elemento con il successivo, 
 * e collega l'ultimo elemento della lista con il primo.
 * 
 * 
 * 
 * */

package circularLinkedList;

public class CircularLinkedList {
	
	//Classe node
	public class Node{
		int data; 
		Node next; 
		public Node(int data) {
			this.data = data; 
		}
	}
	
	public Node head = null;
	public Node tail = null; 
	
	//Funzione add che aggiunge un nuovo nodo alla fine della lista
	public void add(int data) {
		Node newNode = new Node(data);
		
		//Vedo se la lista è vuota
		if(head == null) {
			head = newNode; 
			tail = newNode; 
			
			newNode.next = head;
		}
		else {
			tail.next = newNode; 
			tail = newNode;
			tail.next = head; 
		}
	}
	
	
	public void display() {
		Node current = head; 
		if(head == null) {
			System.out.println("La lista è vuota.");
		}
		else {
			System.out.println("I nodi della lista circolare sono: ");
			do {
				System.out.print(" "+current.data);
				current = current.next;
			}while(current != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList cl = new CircularLinkedList(); 
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		cl.add(5);
		cl.add(6);
		cl.display();
	}
}
