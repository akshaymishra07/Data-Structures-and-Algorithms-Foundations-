package linkedLists;

import java.util.Scanner;

public class CountLength {

	static int countLength(Node head) {
		
		int count = 0;
		Node temp = head;
		while(temp != null) {
		 
			count++;
			temp = temp.next;
		
		}
		
		return count;
	}
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		
		int n = kb.nextInt();

		

		for(int i = 0 ; i < n ; i++) {
			
			
			
			Node node = new Node(kb.nextInt());
			ll.addNode(node);
		}

	    int result = countLength(ll.head);
	    System.out.println(result);
		
	}

}
