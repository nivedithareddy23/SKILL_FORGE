//Example for linked list in Java for integer values
import java.util.*; 
class LinkedListEx {
    public static void main(String[] args) {
        // Create a LinkedList of Integers
        LinkedList<Integer> list = new LinkedList<>();
        // Add elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        // Print the LinkedList
        System.out.println("LinkedList: " + list);
        // Access an element by index
        System.out.println("Element at index 2: " + list.get(2));
        // Remove an element
        list.remove(Integer.valueOf(20));
        System.out.println("After removing 20: " + list);
        // Check if the LinkedList contains an element
        System.out.println("Contains 30: " + list.contains(30));
        // Get the size of the LinkedList
        System.out.println("Size of LinkedList: " + list.size());
        // Clear the LinkedList
        list.clear();
        System.out.println("After clearing the LinkedList: " + list);
        // Check if the LinkedList is empty
        System.out.println("Is the LinkedList empty? " + list.isEmpty());
        //to insert an element at the beginning of the LinkedList
        list.addFirst(5);   
        System.out.println("After adding 5 at the beginning: " + list);
        //to insert an element at the end of the LinkedList
        list.addLast(35);    
        System.out.println("After adding 35 at the end: " + list);
        //to remove the first element of the LinkedList
        list.removeFirst(); 
        System.out.println("After removing the first element: " + list);
        //to remove the last element of the LinkedList
        list.removeLast();  
        System.out.println("After removing the last element: " + list); 
        //to insert an element at the specific index of the LinkedList
        list.add(3, 15);
        System.out.println("After inserting 15 at index 3: " + list);
    }
}