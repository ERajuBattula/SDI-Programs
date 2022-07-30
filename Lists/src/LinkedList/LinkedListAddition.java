package LinkedList;

public class LinkedListAddition {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

//add first
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

//add last
	public void addLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		Node curNod = head;
		while (curNod.next != null) {
			curNod = curNod.next;
		}
		curNod.next = new Node(data);
	}

//print
	public void printList() {
		if (head == null) {
			System.out.println("LinkedList is Empty.");
			return;
		}
		Node curNod = head;
		while (curNod != null) {
			System.out.print(curNod.data + "- ");
			curNod = curNod.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListAddition l = new LinkedListAddition();
		l.addFirst(7); // Add First
		l.addLast(9); // Add Last
		l.addFirst(4);
		l.printList();
	}
}
