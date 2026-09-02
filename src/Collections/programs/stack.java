package Collections.programs;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.add(1,100);
		stack.push(40);

		System.out.println(stack);
		System.out.println(stack.peek());
		

	}

}
