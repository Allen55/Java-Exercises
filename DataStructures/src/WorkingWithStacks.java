import java.util.Stack;

// The Stack class represents a last-in-first-out (LIFO) stack of objects.
// It extends class Vector with operations that allow a vector to be treated as a stack.
// The usual psuh and pop operations are provided, as well as a method to peek at the item on the stack,
// a method to test for whether the stack is empty, and a method to search the stack for an item and,
// discover how far it is from the top.

// Vector is synchronized, arraylist is not.

public class WorkingWithStacks {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());

    }
}
