package Stack;

public class StackExamples {

	int arr[];
	int top;
	int size;

	StackExamples(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}

	// Insert Element
	public void push(int n) {
		if (size - 1 == top) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		arr[top] = n;
	}

	// Delete Element
	public int pop() {
		if (top == -1) {
			System.out.println("stack is empty");
			return -1;
		}
		top--;
		return arr[top];
	}

	public int peek() {
		if (top == -1) {
			System.out.println("stack is empty");
			return -1;
		}
		return arr[top--];
	}

	// display
	public void display() {
		if (top == -1) {
			System.out.println("No elements to display.");
			return;
		}
		for (int i = top; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackExamples s = new StackExamples(6);
		s.push(7);
		s.push(4);
		s.push(3);
		s.push(87);
		s.push(99);
		s.push(45);
		s.display();
		System.out.println();
		s.pop();
		s.display();
		System.out.println();
		System.out.println(s.peek());

	}

}
