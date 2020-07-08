// RECURSIVE TRAVERSAL OF LINKEDLIST
/*
 *     The method traverse takes as a parameter the head of the
 *     linked and print all its nodes.
 *     
 *     Time  :  O(n)
 *     Space :  O(n)
 *     
 *     Note: Here the space complexity is also O(n) because 
 *           the call stack maintains the calls for n nodes 
 *           in the linkedlist.
 *           
 *     Since Iterative traversal can be done with constant 
 *     space , so it is preffered over recursive traversal.      
 * */


package linkedLists;

import java.util.Scanner;

public class RecursiveTraversal {
	
	static void traverse(Node head) {
		
		if(head == null) {
			
			return ;
		}
		
		System.out.print(head.data + " ");
		traverse(head.next);
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		LinkedList ll = new LinkedList();

		while (n-- > 0) {

			ll.addNode(new Node(kb.nextInt()));

		}

		traverse(ll.head);

	}

}
