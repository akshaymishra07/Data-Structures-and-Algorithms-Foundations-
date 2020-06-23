/*
 *   Given a linked list consisting of L nodes and given a 
 *   number N. The task is to find the Nth node from the end 
 *   of the linked list.
 *   
 *   Solution : 
 *   
 *   There are multiple ways to solve this problem.

     First approach is to calculate the length of the linked 
     list (L)and subtract n(position from the back) from it 
     to get the position of the desired node from the front.
     
     
     Another approach is to use two pointers. Both pointers 
     are initialized to head. Take a variable count starting 
     from 0. First pointers moves forwards (one step each time) till the count becomes n-1 from the front. Then the other pointer and the first pointer start moving simultaneously. This keeps on going till the first pointer becomes null. At this point the second pointer will be at the desired node.
 *   
 * 
 * */

package linkedLists;

import java.util.Scanner;

public class NthNodeFromEnd {

	static int getNthNodeFromEnd(Node head, int n) {

		Node temp1 = head;
		Node temp2 = head;
		int count = 0;

		while (count < n) {

			if (temp1 == null) {
				return -1;
			}

			temp1 = temp1.next;
			count++;
		}

		while (temp1 != null) {

			temp2 = temp2.next;
			temp1 = temp1.next;

		}

		return temp2.data;

	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int pos = kb.nextInt();

		LinkedList ll = new LinkedList();
		while (n-- > 0) {

			ll.addNode(new Node(kb.nextInt()));

		}

		int result = getNthNodeFromEnd(ll.head , pos);

		System.out.println(result);

	}

}
