//Example for Wildcards in Java
import java.util.List;
public class WildCardsGeneric {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("A", "B", "C");
        
        printList(intList);
        printList(strList);
    }
    
    // Using wildcard to accept any type of list
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }
}