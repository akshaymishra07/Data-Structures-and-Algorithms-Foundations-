/*
 *   Given a singly linked list of N nodes. The task is to 
 *   find the middle of the linked list. 
 *   
 *   For example, if given linked list is 1->2->3->4->5 then 
 *   the output should be 3.
     
     If there are even nodes, then there would be two middle 
     nodes, we need to print the second middle element. 
     For example, if given linked list is 1->2->3->4->5->6 
     then the output should be 4.
     
     
     
     Solution : 
     
     Two pointers approach is the optimized approach to solve this
     problem.
     
     slow pointer is incremented by 1 and fast pointer is
     incremented by 2 , when the fast pointer reaches the end
     of the linkedlist  then the slow pointer will be pointing
     to the middle of the linkedlist. 
 * 
 * */

package linkedLists;

import java.util.Scanner;

public class MiddleElementOfLinkedList {

	static int findMiddle(Node head){
		
         Node fastPointer = head ;
         Node slowPointer = head ;
         
         while(fastPointer != null && fastPointer.next != null){
        	 
        	 slowPointer = slowPointer.next;
        	 fastPointer = fastPointer.next.next;
        	 
        	 
        	 
         }
		
		return slowPointer.data;
		
	}
	
	
	public static void main(String[] args) {
	  
		Scanner kb = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		
		int n = kb.nextInt();

		

		for(int i = 0 ; i < n ; i++) {
			
			
			
			Node node = new Node(kb.nextInt());
			ll.addNode(node);
		}
		
		int result = findMiddle(ll.head);
		
		System.out.println(result);

		
	}

}
