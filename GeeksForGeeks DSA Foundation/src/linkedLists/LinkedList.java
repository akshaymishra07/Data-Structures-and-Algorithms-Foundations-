package linkedLists;

public class LinkedList {

	Node head;

	public void addNode(Node node) {

		if (head == null) {

			head = node;
		} else {

			Node temp = head;

			while (temp.next != null) {

				temp = temp.next;
			}

			temp.next = node;

		}

	}
	
	public void insertAtHead(int key) {
		
		Node newNode = new Node(key);
		if(head == null) {
			
			head = newNode;
		}
		
		newNode.next = head;
		head = newNode;
	}

	@Override
	public String toString() {
		String result = "";

		if (head == null) {
			return "null";
		}

		Node temp = head;

		while (temp != null) {

			result += temp.data +"->";
			temp = temp.next;

		}
        result += "null";
		return result;
	}

}
