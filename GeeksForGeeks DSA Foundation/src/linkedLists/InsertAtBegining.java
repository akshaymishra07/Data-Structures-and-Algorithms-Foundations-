/*
 *   
 *   A java program to illustrate the insertion of a 
 *   node at the beginning of a linkedlist.
 * 
 * */

package linkedLists;

import java.util.Scanner;

public class InsertAtBegining {

	static void insertAtBeginning(Node head, int key) {

		Node newNode = new Node(key);

		newNode.next = head;

		head = newNode;
		Node temp = head;
		System.out.println("After Insertion");
		while(temp != null) {
			
			System.out.print(temp.data + " ");
			
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		LinkedList ll = new LinkedList();

		int n = kb.nextInt();

		for (int i = 0; i < n; i++) {

			Node node = new Node(kb.nextInt());
			ll.addNode(node);
		}

		int key = kb.nextInt();

		System.out.println("Before Insertion");
		System.out.println(ll);

		insertAtBeginning(ll.head, key);

		
		

	}

}
