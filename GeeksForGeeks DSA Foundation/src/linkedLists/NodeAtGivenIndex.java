/*
 * 
 * 
 * Given a singly linked list with N nodes and a number X. 
 * The task is to find the node at the given index (X)(1 based index) of linked list. 
 * 
 * */


package linkedLists;

import java.util.Scanner;

public class NodeAtGivenIndex {

	static int returnNodeAtDesiredIndex(Node head , int index){
		
		Node temp = head;
		int count = 1 ;
		while(temp != null){
	           
	           if(count == index){
	               return temp.data;
	           }
	           
	           count++;
	           temp = temp.next;
	       }
	     return -1;  
		
		
		
	}
	
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		int index = kb.nextInt();
		LinkedList ll = new LinkedList();
		while (n-- > 0) {

			ll.addNode(new Node(kb.nextInt()));

		}

		int result = returnNodeAtDesiredIndex(ll.head , index);
		System.out.println(result);
	}

}
