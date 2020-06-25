/*
 *    Delete xth node from a singly linked list. Your task is to 
 *    complete the method deleteNode() which takes two 
 *    arguments: the address of the head of the linked list and 
 *    an integer x.
 * 
 *    i/p--> 1 3 4 
 *    n = 3
 *    o/p --> 1 3
 * 
 *    Note : Here we are following 1 BASED Indexing.
 * 
 * 
 * 
 * */



package linkedLists;

import java.util.Scanner;

public class DeleteNthNode {

	static int deleteNode(Node head, int n) {

		if (n == 1) {
			head = head.next;
			return 1;
		}

		Node temp = head;
		int count = 1;
		while (count < n - 1) {

			if(temp.next == null) {
				return -1;
			}
			
			temp = temp.next;
			count++;
		}

		temp.next = temp.next.next;

		return 1;
	}

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int pos = kb.nextInt();

		LinkedList ll = new LinkedList();
		while (n-- > 0) {

			ll.addNode(new Node(kb.nextInt()));

		}

		int res = deleteNode(ll.head, pos);

		if (res == -1) {
			System.out.println("Node Doesnt Exist");
		} else
			System.out.println(ll);
	}

}
