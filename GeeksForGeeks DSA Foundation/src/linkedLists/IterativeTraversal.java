// ITERATIVE TRAVERSAL OF LINKEDLIST

/*
 *    
 *    The method traverse() , takes the head of the linkedlist
 *    as a parameter and prints all the nodes of the linkedlist.
 *    
 *    Note: It prints "Empty LinkedList" if the head is null
 *    
 * */
package linkedLists;

import java.util.Scanner;

public class IterativeTraversal {

	static void traverse(Node head) {

		if (head == null) {
			System.out.println("Empty LinkedList");
		}

		Node temp = head;

		while (temp != null) {

			System.out.print(temp.data + " ");

			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		LinkedList ll = new LinkedList();

		while (n-- > 0) {

			ll.addNode(new Node(kb.nextInt()));

		}
		
		traverse(ll.head);

		// System.out.println(ll);

	}

}
