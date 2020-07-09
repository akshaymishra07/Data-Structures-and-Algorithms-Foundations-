/* 
 *   RECURSIVE FUNCTION TO SEARCH A KEY IN LINKEDLIST
 *   
 *   The search() method takes the head of the linkedlist and
 *   the desired key as parameters and search for the key in 
 *   the linkedlist.
 *   
 *   If found it returns the position of the node(1-BASED INDEXING)
 *   and if not found it returns -1;
 *   
 *   Time  : O(n)
 *   Space : O(n)
 * 
 * */



package linkedLists;

import java.util.Scanner;

public class RecursiveSearch {

	static int search(Node head, int key) {

		if (head == null) {
			return -1;
		}

		if (head.data == key) {
			return 1;
		} else {

			int res = search(head.next, key);
			if (res == -1) {
				return -1;
			} else
				return res + 1;
		}

	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		LinkedList ll = new LinkedList();

		while (n-- > 0) {

			ll.addNode(new Node(kb.nextInt()));

		}

		int key = kb.nextInt();
		int result = search(ll.head, key);
		System.out.println(result);

	}

}
