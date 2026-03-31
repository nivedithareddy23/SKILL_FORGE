//Example for ArrayList in Java
import java.util.*;
class ArrayListEx {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        // Add elements to the ArrayList
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        // Print the ArrayList
        System.out.println("ArrayList: " + list);
        // Access an element by index
        System.out.println("Element at index 1: " + list.get(1));
        // Remove an element
        list.remove("World");
        System.out.println("After removing 'World': " + list);
        // Check if the ArrayList contains an element
        System.out.println("Contains 'Java': " + list.contains("Java"));
        // Get the size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size());
        // Clear the ArrayList
        list.clear();
        System.out.println("After clearing the ArrayList: " + list);
        // Check if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + list.isEmpty());
        //replace an element at a specific index
        list.add("Hello");
        list.add("World");
        list.set(1, "Java");
        System.out.println("After replacing 'World' with 'Java': " + list); 
        //remove an element by index
        list.remove(0);     
        System.out.println("After removing element at index 0: " + list);
        //remove object by value
        list.remove("Java");    
        System.out.println("After removing 'Java': " + list);
        //iterate through the ArrayList using for-each loop
        list.add("Hello");  
        list.add("World");
        list.add("Java");
        list.add("Hello");
        System.out.println("Iterating through the ArrayList: ");
        for (String element : list) {
            System.out.println(element);
        }
        //iterate through the ArrayList using iterator
        System.out.println("Iterating through the ArrayList using iterator: "); 
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //occurrence of an element in the ArrayList
        list.add("Hello"); 
        int lastIndex = list.lastIndexOf("Hello");
        System.out.println("Last occurrence of 'Hello': " + lastIndex);
        //first occurrence of an element in the ArrayList
        int firstIndex = list.indexOf("Hello");
        System.out.println("First occurrence of 'Hello': " + firstIndex);
    }
}
