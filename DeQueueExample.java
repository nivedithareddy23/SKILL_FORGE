//Example of DeQueue in Java with string datatype
import java.util.Deque;
import java.util.LinkedList;
public class DeQueueExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Adding elements to the front of the DeQueue
        deque.addFirst("Hello");
        deque.addFirst("World");

        // Adding elements to the back of the DeQueue
        deque.addLast("Java");
        deque.addLast("Programming");
        deque.offer("Language");
        // Displaying the DeQueue
        System.out.println("DeQueue: " + deque);

        // Removing elements from the front of the DeQueue
        String removedFront = deque.removeFirst();
        System.out.println("Removed from front: " + removedFront);

        // Removing elements from the back of the DeQueue
        String removedBack = deque.removeLast();
        System.out.println("Removed from back: " + removedBack);

        // Displaying the DeQueue after removals
        System.out.println("DeQueue after removals: " + deque);
        //peek at the front and back of the DeQueue
        String peekFront = deque.peekFirst();
        String peekBack = deque.peekLast();
        System.out.println("Peek at front: " + peekFront);
        System.out.println("Peek at back: " + peekBack);
        //poll from the front and back of the DeQueue
        String pollFront = deque.pollFirst();
        String pollBack = deque.pollLast();
        System.out.println("Polled from front: " + pollFront);
        System.out.println("Polled from back: " + pollBack);
        // Displaying the DeQueue after polling elements
        System.out.println("DeQueue after polling: " + deque);
        deque.offerFirst("New Front");
        deque.offerLast("New Back");
        //clear the DeQueue
        deque.clear();  
        System.out.println("DeQueue after clearing: " + deque);
    }
}