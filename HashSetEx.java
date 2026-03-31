//Example of HashSet class in Java
import java.util.HashSet;
public class HashSetEx {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the HashSet
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // Display the HashSet
        System.out.println("HashSet: " + set);
        // Check if an element exists
        System.out.println("Does the HashSet contain 30? " + set.contains(30));
        // Remove an element    
        set.remove(20);
        System.out.println("HashSet after removing 20: " + set);
        // Get the size of the HashSet
        System.out.println("Size of HashSet: " + set.size());
    }
}


        