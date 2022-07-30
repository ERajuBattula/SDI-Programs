package LinkedList;

public class LinkedListSubstraction {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	// Delete First
	public void DeleteFirst() {
		if (head == null) {
			System.out.println("The List Is Empty");
			return;
		}
		head = head.next;
	}

	// Delete Last
	public void DeleteLast() {
		if (head == null) {
			System.out.println("List is Empty.");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node secLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secLast = secLast.next;
		}
		secLast.next = null;
	}

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
		LinkedListSubstraction ll = new LinkedListSubstraction();
		ll.add(7);
		ll.add(9);
		ll.add(4);
		ll.add(8);
		ll.add(2);
		ll.add(3);
		ll.printList();

		ll.DeleteFirst();
		ll.DeleteFirst();
		ll.printList();

		ll.DeleteLast();
		ll.printList();
	}

}
