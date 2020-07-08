/* 
 *   ITERATIVE FUNCTION TO SEARCH A KEY IN LINKEDLIST
 *   
 *   The search() method takes the head of the linkedlist and
 *   the desired key as parameters and search for the key in 
 *   the linkedlist.
 *   
 *   If found it returns the position of the node(1-BASED INDEXING)
 *   and if not found it returns -1;
 *   
 *   Time  : O(n)
 *   Space : O(1)
 * 
 * */

package linkedLists;

import java.util.Scanner;

public class IterativeSearch {

	static int search(Node head, int key) {

		if (head == null) {
			return -1;
		}
		int count = 1;
		Node temp = head;
		while (temp != null) {

			if (temp.data == key) {
             
				return count;
			}
			
			count++;
			temp = temp.next;

		}
		
		return -1;

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
