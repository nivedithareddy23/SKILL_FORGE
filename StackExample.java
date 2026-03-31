//Example for all Stack methods in Java
import java.util.*; 
public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of Strings
        Stack<String> stack = new Stack<>();
        // Push elements onto the Stack
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        // Print the Stack
        System.out.println("Stack: " + stack);
        // Peek at the top element of the Stack
        System.out.println("Top element: " + stack.peek());
        // Pop an element from the Stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        // Check if the Stack is empty
        System.out.println("Is the Stack empty? " + stack.isEmpty());
        // Get the size of the Stack
        System.out.println("Size of Stack: " + stack.size());
        // Search for an element in the Stack
        System.out.println("Position of 'Hello' in Stack: " + stack.search("Hello"));
        // Clear the Stack  
        stack.clear();
        System.out.println("After clearing the Stack: " + stack);
        // Check if the Stack is empty after clearing
        System.out.println("Is the Stack empty after clearing? " + stack.isEmpty());    
        //replace an element at the top of the Stack
        stack.push("Hello");    
        stack.push("World");
        stack.push("Java"); 
        System.out.println("Stack before replacing top element: " + stack);
        stack.set(stack.size() - 1, "Programming");
        System.out.println("After replacing top element with 'Programming': " + stack);
    }
}
