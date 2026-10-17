package Collections;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        // Create Stack
        Stack<Integer> stack = new Stack<>();

        // 1. Add elements using push()
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Original Stack: " + stack);

        // 2. Peek - see the top element
        System.out.println("Top element: " + stack.peek());

        // 3. Pop - remove the top element
        System.out.println("Removed: " + stack.pop());

        System.out.println("After pop: " + stack);

        // 4. Search
        // Search returns position from the top
        System.out.println("Position of 20: " + stack.search(20));

        // 5. Check whether stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 6. Add another element
        stack.push(50);

        System.out.println("After adding 50: " + stack);

        // 7. Iterate
        System.out.println("Stack elements:");

        for (Integer value : stack) {
            System.out.println(value);
        }
    }
}