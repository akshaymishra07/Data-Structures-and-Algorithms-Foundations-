package linkedLists;

import java.util.Scanner;

public class CheckForCycleInLinkedList {
	
	static boolean isCircular(Node head) {
		
		Node temp = head;
		
		Node fast = head ;
		Node slow = head ;
		
		while(slow != null && fast != null && fast.next != null) {
			
			
			
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				return true;
			}
			
			
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		LinkedList ll = new LinkedList();
		while (n-- > 0) {

			ll.addNode(new Node(kb.nextInt()));

		}
		
		//making the linkedlist circular by connecting 
		//last node and the third node
		Node temp = ll.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = ll.head.next.next;
		
		
		boolean result = isCircular(ll.head);
		
		System.out.println(result);

	}

}
