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

	@Override
	public String toString() {
		String result = "";

		if (head == null) {
			return "null";
		}

		Node temp = head;

		while (temp != null) {

			result += temp.data + " ";
			temp = temp.next;

		}

		return result;
	}

}
