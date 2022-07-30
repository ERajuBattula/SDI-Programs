package Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<Integer>();

		// Add value in to stack(push operation)
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(45);
		s.push(12);
		s.push(6);
		s.push(90);
		s.push(23);
		s.push(56);
		System.out.println(s);

		// pop operation
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);

		// Peek Operation
		System.out.println(s.peek());

		// Empty Operation
		boolean status = s.empty();
		System.out.println(status);
	}

}
