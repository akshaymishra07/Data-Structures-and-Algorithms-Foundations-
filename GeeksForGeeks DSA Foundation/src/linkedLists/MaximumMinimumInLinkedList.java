package linkedLists;

import java.util.Scanner;

public class MaximumMinimumInLinkedList {
	
	static int maximum(Node head) {
		
		if(head == null) {
			return -1;
		}
		
		Node temp = head;
		int max = Integer.MIN_VALUE;
		
		while(temp != null ) {
			
			if(temp.data > max) {
				
				max = temp.data;
			}
			temp = temp.next;
		}
		
	
		return max;
	}
	
	
static int minimum(Node head) {
		
		if(head == null) {
			return -1;
		}
		
		Node temp = head;
		int min = Integer.MAX_VALUE;
		
		while(temp != null ) {
			
			if(temp.data < min) {
				
				min = temp.data;
			}
			temp = temp.next;
		}
		
	
		return min;
	}
	

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();

		LinkedList ll = new LinkedList();

		while (n-- > 0) {

			ll.addNode(new Node(kb.nextInt()));

		}

		int maximum = maximum(ll.head);
		int minimum = minimum(ll.head);
		
		System.out.println("Maximum in LinkedList : " +maximum);
		System.out.println("Minimum in LinkedList : " +minimum);
 		
	}

}
