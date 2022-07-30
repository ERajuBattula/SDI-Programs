package Queue;

public class QueueExample {

	private int arr[];
	private int capacity;
	private static int rear;

	QueueExample(int n) {
		capacity = n;
		arr = new int[n];
		rear = -1;
	}

//Enqueue
	public void enqueue(int data) {
		if (rear == capacity - 1) {
			System.out.println("Queue is Reached it's Maximum Position.");
			return;
		}
		rear++;
		arr[rear] = data;
	}

//Dequeue
	public int Dequeue() {
		if (rear == -1) {
			System.out.println("Queue is Empty.");
			return -1;
		}
		int front = arr[0];
		for (int i = 0; i < rear; i++) {
			arr[i] = arr[i + 1];
		}
		rear--;
		return front;
	}

//Peek
	public int peek() {
		if (rear == -1) {
			System.out.println("Queue is Empty.");
			return -1;
		}

		return arr[0];
	}

	public void display() {
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueExample q = new QueueExample(5);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(6);
		q.display();
		System.out.println();
		System.out.println(q.Dequeue());
		q.display();
		System.out.println();
		System.out.println(q.peek());
		q.enqueue(4);
		q.enqueue(2);
		q.enqueue(8);
		q.display();

	}

}
